package com.example.wjb.coolweather.util;

/**
 * Created by wjb on 2015/11/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
