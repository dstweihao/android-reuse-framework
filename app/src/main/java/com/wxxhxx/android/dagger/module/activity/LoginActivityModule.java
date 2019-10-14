package com.wxxhxx.android.dagger.module.activity;

import com.wxxhxx.android.presenter.activity.LoginActivityPresenter;
import com.wxxhxx.android.ui.activity.LoginActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    private LoginActivity loginActivity;


    public LoginActivityModule(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
    }

    @Provides
    LoginActivityPresenter provideLoginActivityPresenter(){
        return new LoginActivityPresenter(loginActivity);
    }

}
