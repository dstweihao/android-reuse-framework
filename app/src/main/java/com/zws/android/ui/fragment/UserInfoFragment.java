package com.zws.android.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import com.zws.android.R;

import butterknife.BindView;

public class UserInfoFragment extends BaseFragment {



    @BindView(R.id.toolbar_text)
    public TextView toolbar_text;

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_info, container, false);
        return view;
    }

    @Override
    protected void initData() {
        toolbar_text.setText("个人信息");
    }
}
