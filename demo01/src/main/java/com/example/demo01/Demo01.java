package com.example.demo01;

import android.util.Log;

public class Demo01 {
    private static final String TAG = "log_debug";

    public static void log(String msg){
        Log.d(TAG,"log is printed :" + msg);
    }
}
