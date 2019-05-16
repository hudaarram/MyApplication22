package com.example.hp.myapplication2;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static SeekBar seekBar1;
    static TextView b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =findViewById(R.id.b1);
        seekBar1= findViewById(R.id.seekBar1);

        MyBroadCast myBroadCast= new MyBroadCast();

        this.registerReceiver(myBroadCast,
                new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

    public  static void setValues(int level ){
        b1.setText(level + "%");
        seekBar1.setProgress(level);
        seekBar1.setMax(100);

    }
}
