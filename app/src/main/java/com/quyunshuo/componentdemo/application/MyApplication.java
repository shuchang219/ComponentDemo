package com.quyunshuo.componentdemo.application;

import android.app.Application;
import android.util.Log;

/**
 * @Author: quyunshuo
 * @Time: 2019/4/7 23:42
 * @see:
 * @Company:
 * @Description: 功能描述
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //以下两行代码可以理解为第三方SDK的初始化
        Log.i("LoginApplication", "onCreate: LoginApplication");
        Log.i("RegisterApplication", "onCreate: RegisterApplication");
    }
}
