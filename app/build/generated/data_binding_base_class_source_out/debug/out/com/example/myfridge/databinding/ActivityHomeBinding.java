// Generated by view binder compiler. Do not edit!
package com.example.myfridge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfridge.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText addressTextView;

  @NonNull
  public final AppCompatButton deleteButton;

  @NonNull
  public final TextView emailTextView;

  @NonNull
  public final AppCompatButton getButton;

  @NonNull
  public final AppCompatButton logOutButton;

  @NonNull
  public final EditText phoneTextView;

  @NonNull
  public final TextView providerTextView;

  @NonNull
  public final AppCompatButton saveButton;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView, @NonNull EditText addressTextView,
      @NonNull AppCompatButton deleteButton, @NonNull TextView emailTextView,
      @NonNull AppCompatButton getButton, @NonNull AppCompatButton logOutButton,
      @NonNull EditText phoneTextView, @NonNull TextView providerTextView,
      @NonNull AppCompatButton saveButton) {
    this.rootView = rootView;
    this.addressTextView = addressTextView;
    this.deleteButton = deleteButton;
    this.emailTextView = emailTextView;
    this.getButton = getButton;
    this.logOutButton = logOutButton;
    this.phoneTextView = phoneTextView;
    this.providerTextView = providerTextView;
    this.saveButton = saveButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressTextView;
      EditText addressTextView = ViewBindings.findChildViewById(rootView, id);
      if (addressTextView == null) {
        break missingId;
      }

      id = R.id.deleteButton;
      AppCompatButton deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.emailTextView;
      TextView emailTextView = ViewBindings.findChildViewById(rootView, id);
      if (emailTextView == null) {
        break missingId;
      }

      id = R.id.getButton;
      AppCompatButton getButton = ViewBindings.findChildViewById(rootView, id);
      if (getButton == null) {
        break missingId;
      }

      id = R.id.logOutButton;
      AppCompatButton logOutButton = ViewBindings.findChildViewById(rootView, id);
      if (logOutButton == null) {
        break missingId;
      }

      id = R.id.phoneTextView;
      EditText phoneTextView = ViewBindings.findChildViewById(rootView, id);
      if (phoneTextView == null) {
        break missingId;
      }

      id = R.id.providerTextView;
      TextView providerTextView = ViewBindings.findChildViewById(rootView, id);
      if (providerTextView == null) {
        break missingId;
      }

      id = R.id.saveButton;
      AppCompatButton saveButton = ViewBindings.findChildViewById(rootView, id);
      if (saveButton == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, addressTextView, deleteButton,
          emailTextView, getButton, logOutButton, phoneTextView, providerTextView, saveButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
