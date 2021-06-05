package com.example.hw6_1_1_reservation;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReservationActivity extends AppCompatActivity {
    public static Context context_Reservation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        ImageView iv_iamge = (ImageView)findViewById(R.id.imageViewForPoster2);
        TextView tv_title = (TextView)findViewById(R.id.textViewForTitle);

        Intent it = getIntent();

        tv_title.setText(MainActivity.posterTitle[MainActivity.selected_id]);
        iv_iamge.setBackground(getDrawable(MainActivity.posterID[MainActivity.selected_id]));


        final GridView gv = (GridView)findViewById(R.id.gridView02);
        SeatGridAdapter gAdapter = new SeatGridAdapter(this);
        gv.setAdapter(gAdapter);

    }

}