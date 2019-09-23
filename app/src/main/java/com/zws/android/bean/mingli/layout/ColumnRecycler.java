package com.zws.android.bean.mingli.layout;



import com.zws.android.bean.mingli.T;

import java.util.List;

/**
 * Created by weihao on 2018/1/9.
 */
/*栏目数据，热门测算，放生池，大师推荐
* */
public class ColumnRecycler {

    private int image;
    private String columnName;
    private String moreName;
    private int rightImage;
    private List<T> mTList;

    public ColumnRecycler(int image, String columnName, String moreName, int rightImage, List<T> TList) {
        this.image = image;
        this.columnName = columnName;
        this.moreName = moreName;
        this.rightImage = rightImage;
        mTList = TList;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getMoreName() {
        return moreName;
    }

    public void setMoreName(String moreName) {
        this.moreName = moreName;
    }

    public int getRightImage() {
        return rightImage;
    }

    public void setRightImage(int rightImage) {
        this.rightImage = rightImage;
    }

    public List<T> getTList() {
        return mTList;
    }

    public void setTList(List<T> TList) {
        mTList = TList;
    }
}
