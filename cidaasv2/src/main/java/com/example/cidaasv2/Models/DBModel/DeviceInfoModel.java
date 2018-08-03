package com.example.cidaasv2.Models.DBModel;

import java.io.Serializable;

/**
 * Created by widasrnarayanan on 13/2/18.
 */

public class DeviceInfoModel implements Serializable{
    //Todo Shared instance


    private String deviceMake;
    private String deviceModel;
    private String deviceVersion;
    private String deviceid;

    public String getDeviceMake() {
        return deviceMake;
    }

    public void setDeviceMake(String deviceMake) {
        this.deviceMake = deviceMake;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }
}
