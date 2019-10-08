package com.zws.android.bean.home;

import java.util.List;

public class NavList {

    private List<Nav> navList;

    public NavList(List<Nav> navList) {
        this.navList = navList;
    }

    public List<Nav> getNavList() {
        return navList;
    }

    public void setNavList(List<Nav> navList) {
        this.navList = navList;
    }
}
