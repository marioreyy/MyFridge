// Generated by view binder compiler. Do not edit!
package com.example.myfridge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ActivityAuthBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout authLayout;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final AppCompatButton googleButton;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final Button signUpButton;

  @NonNull
  public final TextView textView;

  private ActivityAuthBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout authLayout,
      @NonNull EditText emailEditText, @NonNull AppCompatButton googleButton,
      @NonNull ImageView imageView9, @NonNull Button loginButton,
      @NonNull EditText passwordEditText, @NonNull Button signUpButton,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.authLayout = authLayout;
    this.emailEditText = emailEditText;
    this.googleButton = googleButton;
    this.imageView9 = imageView9;
    this.loginButton = loginButton;
    this.passwordEditText = passwordEditText;
    this.signUpButton = signUpButton;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.authLayout;
      LinearLayout authLayout = ViewBindings.findChildViewById(rootView, id);
      if (authLayout == null) {
        break missingId;
      }

      id = R.id.emailEditText;
      EditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.googleButton;
      AppCompatButton googleButton = ViewBindings.findChildViewById(rootView, id);
      if (googleButton == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.passwordEditText;
      EditText passwordEditText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditText == null) {
        break missingId;
      }

      id = R.id.signUpButton;
      Button signUpButton = ViewBindings.findChildViewById(rootView, id);
      if (signUpButton == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityAuthBinding((ConstraintLayout) rootView, authLayout, emailEditText,
          googleButton, imageView9, loginButton, passwordEditText, signUpButton, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
