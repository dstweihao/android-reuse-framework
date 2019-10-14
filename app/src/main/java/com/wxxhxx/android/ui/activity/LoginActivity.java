package com.wxxhxx.android.ui.activity;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.wxxhxx.android.R;
import com.wxxhxx.android.bean.auth.LoginBean;
import com.wxxhxx.android.dagger.component.activity.DaggerLoginActivityComponent;
import com.wxxhxx.android.dagger.module.activity.LoginActivityModule;
import com.wxxhxx.android.presenter.activity.LoginActivityPresenter;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import androidx.core.widget.ContentLoadingProgressBar;
import butterknife.BindView;

public class LoginActivity extends BaseActivity {

    @Inject
    public LoginActivityPresenter loginActivityPresenter;
    private Boolean isDisplay = true;

    @BindView(R.id.et_username)
    public EditText et_username;

    @BindView(R.id.et_password)
    public EditText et_password;

    @BindView(R.id.bt_login)
    public Button bt_login;

    @BindView(R.id.progressbar)
    public ContentLoadingProgressBar progressBar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        setStatusBar(false, false);

        setUsernameIcon();
        setPasswordIcon(R.mipmap.login_pwd_hide);

    }

    @Override
    protected void initDate() {

        DaggerLoginActivityComponent.builder().loginActivityModule(new LoginActivityModule(this)).build().in(this);

    }

    @Override
    protected void initListener() {
        et_password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Drawable drawable = et_password.getCompoundDrawables()[2];
                if (drawable == null) {
                    return false;
                }
                if (event.getX() > et_password.getWidth() - et_password.getCompoundDrawables()[2].getBounds().width()) {
                    if (isDisplay) {
                        setPasswordIcon(R.mipmap.login_pwd_show);
                    } else {
                        setPasswordIcon(R.mipmap.login_pwd_hide);
                    }
                    isDisplay = !isDisplay;
                }
                return false;
            }
        });
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.show();
                Map<String, String> map = new HashMap<>();
                map.put("username", et_username.getText().toString().trim());
                map.put("password", et_password.getText().toString().trim());
                loginActivityPresenter.login(map);
            }
        });
    }

    private void setUsernameIcon() {
        Drawable prefix_username = getResources().getDrawable(R.mipmap.login_username);
        prefix_username.setBounds(0, 0, 50, 50);
        et_username.setCompoundDrawables(prefix_username, null, null, null);
    }

    private void setPasswordIcon(int suffixImage) {
        Drawable prefix_password = getResources().getDrawable(R.mipmap.login_password);
        Drawable suffix_password = getResources().getDrawable(suffixImage);
        prefix_password.setBounds(0, 0, 50, 50);
        suffix_password.setBounds(0, 0, 50, 50);
        et_password.setCompoundDrawables(prefix_password, null, suffix_password, null);
    }

    public void onNext(LoginBean loginBean) {
        progressBar.hide();
        SharedPreferences sp = this.getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("data", new Gson().toJson(loginBean));
        edit.apply();
        Log.d("LoginBeanTrue", new Gson().toJson(loginBean));
        startActivity(MainActivity.class, false);
    }

    public void onError(Throwable e) {
        progressBar.hide();
        Toast.makeText(this, "用户名或者密码错误，请重新输入。", Toast.LENGTH_SHORT).show();
    }
}
