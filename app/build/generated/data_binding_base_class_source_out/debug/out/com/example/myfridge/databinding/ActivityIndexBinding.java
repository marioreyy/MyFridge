// Generated by view binder compiler. Do not edit!
package com.example.myfridge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfridge.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIndexBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Button logOutButtonIndex;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  private ActivityIndexBinding(@NonNull DrawerLayout rootView, @NonNull DrawerLayout drawerLayout,
      @NonNull ImageView imageView, @NonNull ImageView imageView3, @NonNull ImageView imageView4,
      @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout,
      @NonNull Button logOutButtonIndex, @NonNull NavigationView navView,
      @NonNull TextView textView2, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextView textView8) {
    this.rootView = rootView;
    this.drawerLayout = drawerLayout;
    this.imageView = imageView;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.linearLayout = linearLayout;
    this.logOutButtonIndex = logOutButtonIndex;
    this.navView = navView;
    this.textView2 = textView2;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIndexBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIndexBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_index, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIndexBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.logOutButtonIndex;
      Button logOutButtonIndex = ViewBindings.findChildViewById(rootView, id);
      if (logOutButtonIndex == null) {
        break missingId;
      }

      id = R.id.nav_view;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityIndexBinding((DrawerLayout) rootView, drawerLayout, imageView, imageView3,
          imageView4, imageView5, linearLayout, logOutButtonIndex, navView, textView2, textView5,
          textView6, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
