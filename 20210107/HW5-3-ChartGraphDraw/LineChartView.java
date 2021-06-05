package com.example.hw5_3_chartgraphdraw;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LineChartView extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_drawline);

        ImageView iv_chart = (ImageView)findViewById(R.id.imageView1);


        Path p = new Path();
        p.moveTo(0,0);
        p.lineTo(0,700);
        p.lineTo(700,700);
        p.moveTo(0, 700);
        p.lineTo(100, (700-700*(float)0.74));
        p.lineTo(200, (700-700*(float)0.05));
        p.lineTo(300, (700-700*(float)0.04));
        p.lineTo(400, (700-700*(float)0.00));
        p.lineTo(500, (700-700*(float)0.06));
        p.lineTo(600, (700-700*(float)0.07));


        ShapeDrawable d = new ShapeDrawable(new PathShape(p, 700, 700));
        d.setIntrinsicHeight(800);
        d.setIntrinsicWidth(800);
        d.getPaint().setColor(Color.BLUE);
        d.getPaint().setStyle(Paint.Style.STROKE);


        iv_chart.setImageDrawable(d);



    }



}
