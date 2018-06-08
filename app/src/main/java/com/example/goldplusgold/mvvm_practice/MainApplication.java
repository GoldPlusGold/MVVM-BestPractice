package com.example.goldplusgold.mvvm_practice;

import android.app.Application;

import com.example.goldplusgold.mvvm_practice.common.weex.WeexSDKManager;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WeexSDKManager.init(this);
    }

}
