package com.zws.android.dagger.module.activity;

import com.zws.android.presenter.activity.LoginActivityPresenter;
import com.zws.android.ui.activity.LoginActivity;

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
