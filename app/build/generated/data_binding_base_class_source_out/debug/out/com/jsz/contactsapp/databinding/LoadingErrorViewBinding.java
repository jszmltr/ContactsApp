// Generated by view binder compiler. Do not edit!
package com.jsz.contactsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.jsz.contactsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoadingErrorViewBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final TextView errorView;

  @NonNull
  public final ProgressBar progressBar;

  private LoadingErrorViewBinding(@NonNull View rootView, @NonNull TextView errorView,
      @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.errorView = errorView;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static LoadingErrorViewBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.loading_error_view, parent);
    return bind(parent);
  }

  @NonNull
  public static LoadingErrorViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errorView;
      TextView errorView = rootView.findViewById(id);
      if (errorView == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      return new LoadingErrorViewBinding(rootView, errorView, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
