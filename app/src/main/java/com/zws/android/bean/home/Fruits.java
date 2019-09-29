package com.zws.android.bean.home;

public class Fruits  {

    private int fruitsImage;
    private String fruitsName;

    public Fruits(int fruitsImage, String fruitsName) {
        this.fruitsImage = fruitsImage;
        this.fruitsName = fruitsName;
    }

    public int getFruitsImage() {
        return fruitsImage;
    }

    public void setFruitsImage(int fruitsImage) {
        this.fruitsImage = fruitsImage;
    }

    public String getFruitsName() {
        return fruitsName;
    }

    public void setFruitsName(String fruitsName) {
        this.fruitsName = fruitsName;
    }
}
