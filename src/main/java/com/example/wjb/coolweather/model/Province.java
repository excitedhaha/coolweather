package com.example.wjb.coolweather.model;

/**
 * Created by wjb on 2015/11/30.
 */
public class Province  {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() {

        return provinceCode;
    }

    public void setProvinceName(String provinceName) {

        this.provinceName = provinceName;
    }

    public String getProvinceName() {

        return provinceName;
    }
}
