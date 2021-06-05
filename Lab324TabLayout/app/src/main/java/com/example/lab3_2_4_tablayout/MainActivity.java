package com.example.lab3_2_4_tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {


    TabHost myTabHost = null;
    TabHost.TabSpec spec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTabHost = getTabHost();

        //Tab추가
        spec = myTabHost.newTabSpec("Artists").setIndicator("Artists").setContent(R.id.textView1);
        myTabHost.addTab(spec);

        spec = myTabHost.newTabSpec("Albums").setIndicator("Albums").setContent(R.id.textView2);
        myTabHost.addTab(spec);

        spec = myTabHost.newTabSpec("Songs").setIndicator("Songs").setContent(R.id.textView3);
        myTabHost.addTab(spec);

        myTabHost.setCurrentTab(0);



    }
}