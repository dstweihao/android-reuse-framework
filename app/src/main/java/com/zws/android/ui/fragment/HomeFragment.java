package com.zws.android.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zws.android.R;
import com.zws.android.adapter.home.DeviceStatisticsAdapter;
import com.zws.android.adapter.home.FruitsAdapter;
import com.zws.android.bean.home.DeviceStatistocsBean;
import com.zws.android.bean.home.Fruits;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends BaseFragment {

    @BindView(R.id.recyclerview)
    public RecyclerView nav_recyclerView;

    @BindView(R.id.device_statistics_recyclerview)
    public RecyclerView device_recyclerview;

    private List<Fruits> mFruits = new ArrayList<>();
    private List<DeviceStatistocsBean> deviceStatistocsBean = new ArrayList<>();

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    protected void initData() {
        initFruits();
        LinearLayoutManager deviceLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 4);
        FruitsAdapter adapter1 = new FruitsAdapter(mFruits);
        DeviceStatisticsAdapter statisticsAdapter = new DeviceStatisticsAdapter(deviceStatistocsBean);
        nav_recyclerView.setLayoutManager(layoutManager);
        nav_recyclerView.setAdapter(adapter1);
        device_recyclerview.setLayoutManager(deviceLayoutManager);
        device_recyclerview.setAdapter(statisticsAdapter);
    }


    private void initFruits() {

        addToList(mFruits, R.mipmap.ic_launcher_round, "项目");
        addToList(mFruits, R.mipmap.ic_launcher_round, "设备类型");
        addToList(mFruits, R.mipmap.ic_launcher_round, "设备");
        addToList(mFruits, R.mipmap.ic_launcher_round, "触发器");

        for (int i = 0; i < 20; i++) {
            deviceStatistocsBean.add(new DeviceStatistocsBean("CANDTU-900" + i, "101", "22", "323", "52"));
        }
    }

    private void addToList(List list, int image, String name) {
        Fruits fruits = new Fruits(image, name);
        list.add(fruits);
    }
}
