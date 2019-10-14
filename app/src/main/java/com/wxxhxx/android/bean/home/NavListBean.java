package com.wxxhxx.android.bean.home;

import java.util.List;

public class NavListBean {

    private List<NavBean> navBeanList;

    public NavListBean(List<NavBean> navBeanList) {
        this.navBeanList = navBeanList;
    }

    public List<NavBean> getNavBeanList() {
        return navBeanList;
    }

    public void setNavBeanList(List<NavBean> navBeanList) {
        this.navBeanList = navBeanList;
    }
}
