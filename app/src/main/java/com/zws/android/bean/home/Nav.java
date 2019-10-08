package com.zws.android.bean.home;

public class Nav {


    private int image;
    private String num;
    private String name;

    public Nav(int image, String num, String text) {
        this.image = image;
        this.num = num;
        this.name = text;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String text) {
        this.name = text;
    }

    public int getImage() {
        return image;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
