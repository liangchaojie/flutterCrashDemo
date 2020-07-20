package com.demo.flutter_app_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(this);
        MyPlatformViewFlutterPlugin.registerWith(this);
       // startActivity(new Intent(this, SecondActivity.class));
    }
}
