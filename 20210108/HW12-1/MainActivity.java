package com.example.hw6_1_1_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    static int[] posterID = {R.drawable.image01, R.drawable.image02, R.drawable.image03, R.drawable.image04, R.drawable.image05,
            R.drawable.image06, R.drawable.image07, R.drawable.image08, R.drawable.image09, R.drawable.image10};
    static int[] posterTitle = {R.string.mov01, R.string.mov02, R.string.mov03, R.string.mov04, R.string.mov05,
            R.string.mov06, R.string.mov07, R.string.mov08, R.string.mov09, R.string.mov10};
    static int selected_id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화 예약");

        final GridView gv = (GridView)findViewById(R.id.gridView01);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), ReservationActivity.class);
                selected_id = position;
                //intent.putExtra("image", posterID[position]);
                //intent.putExtra("title", posterTitle[position]);

                startActivity(intent);


            }
        });


    }
}

