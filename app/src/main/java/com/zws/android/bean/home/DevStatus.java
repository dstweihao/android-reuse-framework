package com.zws.android.bean.home;

public class DevStatus {
    private String devtype;
    private String total;
    private String onLine;
    private String offLine;
    private String error;

    public DevStatus(String devtype, String total, String onLine, String offLine, String error) {
        this.devtype = devtype;
        this.total = total;
        this.onLine = onLine;
        this.offLine = offLine;
        this.error = error;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype;
    }

    public String getOnLine() {
        return onLine;
    }

    public void setOnLine(String onLine) {
        this.onLine = onLine;
    }

    public String getOffLine() {
        return offLine;
    }

    public void setOffLine(String offLine) {
        this.offLine = offLine;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
