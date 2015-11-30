package com.example.wjb.coolweather.model;

/**
 * Created by wjb on 2015/11/30.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityCode(String cityCode) {

        this.cityCode = cityCode;
    }

    public int getProvinceId() {

        return provinceId;
    }

    public String getCityCode() {

        return cityCode;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public String getCityName() {

        return cityName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }
}
