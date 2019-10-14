package com.wxxhxx.android.ui.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.wxxhxx.android.R;
import com.wxxhxx.android.bean.auth.LoginBean;
import com.wxxhxx.android.bean.user.AvatarBean;
import com.wxxhxx.android.bean.user.CellBean;
import com.wxxhxx.android.view.ViewBinder.user.AvatarBeanViewBinder;
import com.wxxhxx.android.view.ViewBinder.user.CellBeanViewBinder;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class UserFragment extends BaseFragment {

    @BindView(R.id.toolbar_text)
    public TextView toolbar_text;


    @BindView(R.id.rv_user)
    public RecyclerView rv_user;

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        return view;
    }

    @Override
    protected void initData() {
        toolbar_text.setText("我");
        SharedPreferences sp = getActivity().getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String data = sp.getString("data", "");
        LoginBean loginBean = new Gson().fromJson(data, LoginBean.class);
        LoginBean.DataBeanX userInfo = loginBean.getData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        RecyclerView.ItemDecoration decoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(AvatarBean.class, new AvatarBeanViewBinder());
        adapter.register(CellBean.class, new CellBeanViewBinder());
        Items items = new Items();
        rv_user.setLayoutManager(layoutManager);
        rv_user.setAdapter(adapter);
        rv_user.addItemDecoration(decoration);
        AvatarBean avatarBean = new AvatarBean(userInfo.getAvatar(), userInfo.getNickname(), "账号：" + userInfo.getUsername());
        CellBean cellBean = new CellBean(R.mipmap.account_safety, "账号安全");
        items.add(avatarBean);
        items.add(cellBean);
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }
}
