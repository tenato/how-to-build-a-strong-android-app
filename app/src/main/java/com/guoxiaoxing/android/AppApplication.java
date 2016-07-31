package com.guoxiaoxing.android;

import android.app.Application;

/**
 * Author: guoxiaoxing
 * Date: 16/7/31 下午4:06
 * Function: For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingv@163.com
 */
public class AppApplication extends Application {

    private AppApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public AppApplication getApplication() {
        return mApplication;
    }
}