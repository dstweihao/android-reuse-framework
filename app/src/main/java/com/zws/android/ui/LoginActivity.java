package com.zws.android.ui;



import android.view.View;
import android.widget.Button;

import com.zws.android.R;
import com.zws.android.ui.activity.BaseActivity;
import com.zws.android.ui.activity.MainActivity;

import butterknife.BindView;

public class LoginActivity extends BaseActivity {


    @BindView(R.id.bt_login)
    public Button bt_login;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        setStatusBar(false, false);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.class, false);
            }
        });
    }
    @Override
    protected void initDate() {

    }
}
