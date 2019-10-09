package com.zws.android.presenter.activity;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zws.android.bean.auth.LoginBean;
import com.zws.android.constant.http.API;
import com.zws.android.http.RetrofitService;
import com.zws.android.ui.activity.LoginActivity;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class LoginActivityPresenter {

    private LoginActivity loginActivity;


    public LoginActivityPresenter(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
    }

    public void login(Map<String, String> map) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.baseUrl)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        Observable<LoginBean> observable = service.login(map);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        LoginActivityPresenter.this.loginActivity.onError(e);
                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        LoginActivityPresenter.this.loginActivity.onNext(loginBean);
                    }
                });
    }
}
