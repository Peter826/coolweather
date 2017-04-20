package com.example.administrator.coolweather.util;

/**
 * Created by Administrator on 2017/4/20 0020.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
