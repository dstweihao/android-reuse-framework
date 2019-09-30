package com.zws.android.bean.home;

import java.util.List;

public class NavBean extends HomeBean {

    private int viewType;
    private List<NavBeanItem> navBeanItemList;

    public NavBean(int viewType,List<NavBeanItem> navBeanItemList) {
        this.viewType = viewType;
        this.navBeanItemList = navBeanItemList;
    }
}


