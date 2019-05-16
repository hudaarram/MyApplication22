package com.example.hp.myapplication2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

public class MyBroadCast extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        MainActivity.setValues(level);
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
