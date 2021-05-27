package com.jsz.contactsapp.feature.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsFragment;", "Lcom/jsz/contactsapp/common/ui/BottomSheetFragment;", "()V", "binding", "Lcom/jsz/contactsapp/databinding/UserDetailsFragmentBinding;", "config", "Lcom/jsz/contactsapp/common/ui/BottomSheetFragment$Config;", "getConfig", "()Lcom/jsz/contactsapp/common/ui/BottomSheetFragment$Config;", "viewModel", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel;", "getViewModel", "()Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class UserDetailsFragment extends com.jsz.contactsapp.common.ui.BottomSheetFragment {
    @org.jetbrains.annotations.NotNull
    private final com.jsz.contactsapp.common.ui.BottomSheetFragment.Config config = null;
    private com.jsz.contactsapp.databinding.UserDetailsFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.jsz.contactsapp.feature.details.UserDetailsFragment.Companion Companion = null;
    private static final java.lang.String EXTRA_USER_ID = "EXTRA_USER_ID";
    
    public UserDetailsFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.jsz.contactsapp.common.ui.BottomSheetFragment.Config getConfig() {
        return null;
    }
    
    private final com.jsz.contactsapp.feature.details.UserDetailsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDismiss(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsFragment$Companion;", "", "()V", "EXTRA_USER_ID", "", "newInstance", "Lcom/jsz/contactsapp/feature/details/UserDetailsFragment;", "userId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.feature.details.UserDetailsFragment newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String userId) {
            return null;
        }
    }
}