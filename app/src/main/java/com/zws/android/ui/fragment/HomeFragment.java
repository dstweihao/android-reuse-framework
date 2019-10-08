package com.zws.android.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.zws.android.R;
import com.zws.android.bean.home.DevStatus;
import com.zws.android.bean.home.Nav;
import com.zws.android.bean.home.NavList;
import com.zws.android.bean.home.TitleBar;
import com.zws.android.view.ViewBinder.DevStatusViewBinder;
import com.zws.android.view.ViewBinder.NavListViewBinder;
import com.zws.android.view.ViewBinder.TitleBarViewBinder;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class HomeFragment extends BaseFragment {

    @BindView(R.id.recyclerview)
    public RecyclerView recyclerView;


    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    protected void initData() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        Items items = new Items();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        adapter.register(NavList.class, new NavListViewBinder());
        adapter.register(TitleBar.class, new TitleBarViewBinder());
        adapter.register(DevStatus.class, new DevStatusViewBinder());

        List<Nav> navList = new ArrayList<>();
        navList.add(new Nav(R.mipmap.ic_launcher_round, "55", "项目"));
        navList.add(new Nav(R.mipmap.ic_launcher_round, "65", "设备类型"));
        navList.add(new Nav(R.mipmap.ic_launcher_round, "895", "设备"));
        navList.add(new Nav(R.mipmap.ic_launcher_round, "43", "触发器"));

        items.add(new NavList(navList));
        items.add(new TitleBar("设备统计"));
        for (int i = 0; i < 20; i++) {
            items.add(new DevStatus("CANDTU-900" + i, "101", "22", "323", "52"));
        }

        adapter.setItems(items);
        adapter.notifyDataSetChanged();

    }



}
