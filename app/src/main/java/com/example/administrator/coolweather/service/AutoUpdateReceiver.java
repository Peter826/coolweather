package com.example.administrator.coolweather.service;

/**
 * Created by Administrator on 2017/4/20 0020.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
