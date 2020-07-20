package com.demo.flutter_app_1;

import android.app.Activity;
import android.os.Bundle;

import io.flutter.app.FlutterActivity;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}