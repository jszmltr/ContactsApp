@file:Suppress("unused")

package com.jsz.contactsapp.utils

import com.jsz.contactsapp.common.utils.BaseViewModel
import org.assertj.core.api.Assertions.assertThat


class RecordingViewModelObserver<State : Any, NavigationEvents : Any> {
    private val observedStates = mutableListOf<State>()
    private val observedCoordinatorEvents = mutableListOf<Any>()

    fun observe(viewModel: BaseViewModel<State, NavigationEvents>) {
        viewModel.state.observeForever { state ->
            synchronized(this) {
                observedStates += state
            }
        }
    }

    @Synchronized
    fun clearObservedStates() = observedStates.clear()

    @Synchronized
    fun peekMostRecentObservedState(): State {
        return observedStates.lastOrNull() ?: throw AssertionError("No state changes observed")
    }

    /** Asserts that the passed list of states has been observed since the last call to this method. */
    @Synchronized
    fun assertStatesObserved(vararg states: State) {
        assertThat(observedStates).containsExactly(*states)
        observedStates.clear()
    }

    /** Asserts that the state was the last state observed. */
    @Synchronized
    fun assertMostRecentStateObserved(state: State) {
        assertThat(peekMostRecentObservedState()).isEqualTo(state)
        observedStates.clear()
    }

    @Synchronized
    fun onMostRecentObservedState(block: State.() -> Unit) {
        block(peekMostRecentObservedState())
    }
}

fun <State : Any, NavigationEvents : Any> BaseViewModel<State, NavigationEvents>.testObserver() =
    RecordingViewModelObserver<State, NavigationEvents>().also { it.observe(this) }
