package com.example.wjb.coolweather.model;

/**
 * Created by wjb on 2015/11/30.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {

        return cityId;
    }

    public void setCountyCode(String countyCode) {

        this.countyCode = countyCode;
    }

    public String getCountyCode() {

        return countyCode;
    }

    public void setCountyName(String countyName) {

        this.countyName = countyName;
    }

    public String getCountyName() {

        return countyName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }
}
