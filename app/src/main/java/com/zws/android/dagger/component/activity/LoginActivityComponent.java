package com.zws.android.dagger.component.activity;

import com.zws.android.dagger.module.activity.LoginActivityModule;
import com.zws.android.ui.activity.LoginActivity;

import dagger.Component;

@Component(modules = LoginActivityModule.class)
public interface LoginActivityComponent {
    void in(LoginActivity loginActivity);
}
