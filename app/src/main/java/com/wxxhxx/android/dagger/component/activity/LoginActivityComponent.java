package com.wxxhxx.android.dagger.component.activity;

import com.wxxhxx.android.dagger.module.activity.LoginActivityModule;
import com.wxxhxx.android.ui.activity.LoginActivity;

import dagger.Component;

@Component(modules = LoginActivityModule.class)
public interface LoginActivityComponent {
    void in(LoginActivity loginActivity);
}
