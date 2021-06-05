package com.example.hw6_1_1_reservation;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReservationCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_complete);

        Intent it = getIntent();
        int title = it.getIntExtra("title", 0);
        int poster = it.getIntExtra("image",0);
        String id_info = it.getStringExtra("seat");

        TextView tv_title = (TextView)findViewById(R.id.textViewForTitle3);
        ImageView iv_iamge = (ImageView)findViewById(R.id.imageViewForPoster3);
        TextView tv_info = (TextView)findViewById(R.id.textViewForInfo);

        tv_info.setText(id_info);
        tv_title.setText(MainActivity.posterTitle[MainActivity.selected_id]);
        iv_iamge.setBackground(getDrawable(MainActivity.posterID[MainActivity.selected_id]));

    }
}
