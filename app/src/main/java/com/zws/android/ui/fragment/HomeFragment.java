package com.zws.android.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.zws.android.R;
import com.zws.android.adapter.home.HomeAdapter;
import com.zws.android.bean.ExampleBaseBean;
import com.zws.android.bean.home.HomeBean;
import com.zws.android.bean.home.NavBean;
import com.zws.android.bean.home.NavBeanItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import retrofit2.http.HEAD;

public class HomeFragment extends BaseFragment {

    private static final int TYPE_HEAD = 1001;
    @BindView(R.id.recyclerview)
    public RecyclerView recyclerView;


    private List<HomeBean> homeBeans = new ArrayList<>();
    private List<NavBeanItem> navBeans = new ArrayList<>();

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    protected void initData() {
        initNavBean();
        NavBean navBean = new NavBean(TYPE_HEAD, navBeans);
        homeBeans.add(navBean);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 4);
        recyclerView.setLayoutManager(layoutManager);
        HomeAdapter homeAdapter = new HomeAdapter(homeBeans);
        recyclerView.setAdapter(homeAdapter);
        Log.d("sssss---", new Gson().toJson(homeBeans));
    }

    private void initDevice() {
        List<Number> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
//           DeviceStatistocsBean deviceStatistocsBean= new DeviceStatistocsBean("CANDTU-900" + i, "101", "22", "323", "52");
//            deviceStatistocsBean.setViewType(ExampleAdapter.FOOT);//正常列表
//            baseBeans.add(deviceStatistocsBean);

            list.add(i);

        }

        Log.d("xxxxx----", new Gson().toJson(list));
    }

    private void initNavBean() {
        addToList(navBeans, R.mipmap.ic_launcher_round, "55", "项目");
        addToList(navBeans, R.mipmap.ic_launcher_round, "65", "设备类型");
        addToList(navBeans, R.mipmap.ic_launcher_round, "895", "设备类型");
        addToList(navBeans, R.mipmap.ic_launcher_round, "43", "触发器");

    }

    private void addToList(List array, int image, String num, String text) {
        array.add(new NavBeanItem(image, num, text));


    }
//
//
//    private void initFruits() {
//
////        addToList(mFruits, R.mipmap.ic_launcher_round, "项目");
////        addToList(mFruits, R.mipmap.ic_launcher_round, "设备类型");
////        addToList(mFruits, R.mipmap.ic_launcher_round, "设备");
////        addToList(mFruits, R.mipmap.ic_launcher_round, "触发器");
//
//        for (int i = 0; i < 20; i++) {
//            deviceStatistocsBean.add(new DeviceStatistocsBean("CANDTU-900" + i, "101", "22", "323", "52"));
//        }
//    }


}
