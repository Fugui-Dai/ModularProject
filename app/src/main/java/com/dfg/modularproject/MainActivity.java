package com.dfg.modularproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gralde(app) 配置后，此时就会为 debug 的 url 值
        String debug = BuildConfig.debug;
        // gralde(app) 配置后，此时就会为 isRelease 的boolean值
        boolean isRelease = BuildConfig.isRelease;

        if(BuildConfig.isRelease){
            Log.d( TAG, "onCreate: 当前是:集成化线上环境，以app壳为主导运行的方式");
            Toast.makeText(this, "当前是:集成化 线上环境，以app壳为主导运行的方式",Toast.LENGTH_SHORT).show();
        }else{
            Log.d( TAG, "onCreate: 当前是:测试环境，所有的子模块都可以独立运行");
            Toast.makeText(this, "当前是:组件化 测试环境，所有的子模块都可以独立运行",Toast.LENGTH_SHORT).show();
        }
    }
}