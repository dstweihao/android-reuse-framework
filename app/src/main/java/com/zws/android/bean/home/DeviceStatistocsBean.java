package com.zws.android.bean.home;

public class DeviceStatistocsBean {

    private  String devtypename;
    private String deviceTotal;
    private String deviceOnLine;
    private String deviceOffLine;
    private String deviceError;

    public DeviceStatistocsBean(String devtypename, String deviceTotal, String deviceOnLine, String deviceOffLine, String deviceError) {
        this.devtypename = devtypename;
        this.deviceTotal = deviceTotal;
        this.deviceOnLine = deviceOnLine;
        this.deviceOffLine = deviceOffLine;
        this.deviceError = deviceError;
    }

    public String getDevtypename() {
        return devtypename;
    }

    public void setDevtypename(String devtypename) {
        this.devtypename = devtypename;
    }

    public String getDeviceTotal() {
        return deviceTotal;
    }

    public void setDeviceTotal(String deviceTotal) {
        this.deviceTotal = deviceTotal;
    }

    public String getDeviceOnLine() {
        return deviceOnLine;
    }

    public void setDeviceOnLine(String deviceOnLine) {
        this.deviceOnLine = deviceOnLine;
    }

    public String getDeviceOffLine() {
        return deviceOffLine;
    }

    public void setDeviceOffLine(String deviceOffLine) {
        this.deviceOffLine = deviceOffLine;
    }

    public String getDeviceError() {
        return deviceError;
    }

    public void setDeviceError(String deviceError) {
        this.deviceError = deviceError;
    }
}
