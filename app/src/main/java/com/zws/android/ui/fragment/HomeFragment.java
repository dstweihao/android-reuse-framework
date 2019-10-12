package com.zws.android.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zws.android.R;
import com.zws.android.bean.home.DevStatusBean;
import com.zws.android.bean.home.NavBean;
import com.zws.android.bean.home.NavListBean;
import com.zws.android.bean.home.TitleBarBean;
import com.zws.android.view.ViewBinder.home.DevStatusViewBinder;
import com.zws.android.view.ViewBinder.home.NavListViewBinder;
import com.zws.android.view.ViewBinder.home.TitleBarViewBinder;

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

        adapter.register(NavListBean.class, new NavListViewBinder());
        adapter.register(TitleBarBean.class, new TitleBarViewBinder());
        adapter.register(DevStatusBean.class, new DevStatusViewBinder());

        List<NavBean> navBeanList = new ArrayList<>();
        navBeanList.add(new NavBean(R.mipmap.ic_launcher_round, "55", "项目"));
        navBeanList.add(new NavBean(R.mipmap.ic_launcher_round, "65", "设备类型"));
        navBeanList.add(new NavBean(R.mipmap.ic_launcher_round, "895", "设备"));
        navBeanList.add(new NavBean(R.mipmap.ic_launcher_round, "43", "触发器"));

        items.add(new NavListBean(navBeanList));
        items.add(new TitleBarBean("设备统计"));
        for (int i = 0; i < 20; i++) {
            items.add(new DevStatusBean("CANDTU-900" + i, "101", "22", "323", "52"));
        }

        adapter.setItems(items);
        adapter.notifyDataSetChanged();

    }



}
