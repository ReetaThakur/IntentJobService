package com.example.intentjobservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService;


public class MyIJobntentService extends JobIntentService {
    private String TAG = "reeta";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG, "OnCreate Of IntentService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "OnDestroy Of IntentService");
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        Log.v(TAG,"OnHandlerWork"+" "+Thread.currentThread().getName());
        int num=intent.getIntExtra("JobId1",3);
        int num1=intent.getIntExtra("JobId2",6);
        if (intent!=null){
            if (num==1){
                for(int i=0;i<=10;i++){
                    Log.v("Job1","i values"+i);
                }
            }
            if (num1==2){
                for(int i=0;i<=12;i++){
                    Log.v("Job2","i values"+i);
                }

            }
        }

    }

}


