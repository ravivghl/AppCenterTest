package com.parth.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!AppCenter.isConfigured()){
            AppCenter.start(getApplication(), "80b608ae-7f5f-44f5-9096-d9f6ebf9ed11",
                    Analytics.class, Crashes.class);
        }
        setContentView(R.layout.activity_main);


        Log.e("Test","log testing");
    }
}