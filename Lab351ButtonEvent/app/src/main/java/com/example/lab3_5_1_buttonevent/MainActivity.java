  package com.example.lab3_5_1_buttonevent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;

import java.util.Random;

  public class MainActivity extends AppCompatActivity {

      private TextView objTV;
      private LinearLayout objLayout;
      private Button objBnt;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objLayout = (LinearLayout)findViewById(R.id.LinearLayout1);
        objTV = (TextView)findViewById(R.id.TextView1);
        objBnt = (Button)findViewById(R.id.Button1);

        objBnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int random1 = new Random().nextInt(256);
                int random2 = new Random().nextInt(256);
                int random3 = new Random().nextInt(256);

                int color = Color.rgb(random1, random2, random3);
                objLayout.setBackgroundColor(color);
                objTV.setText("RGB("+random1+", "+random2+", "+random3+")");
            }
        });


     }
}