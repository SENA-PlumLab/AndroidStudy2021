package com.example.hw5_3_chartgraphdraw;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarChartView extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_drawbar);
        //ImageView iv_chart = (ImageView)findViewById(R.id.imageView2);


/*
        Path p = new Path();
        p.moveTo(0,0);
        p.lineTo(0,800);
        p.lineTo(800,800);


        p.moveTo(100, 700);
        p.moveTo(175, 700);
        p.lineTo(175, (700-700*(float)0.74));
        p.lineTo(100, (700-700*(float)0.74));


        ShapeDrawable d = new ShapeDrawable(new PathShape(p, 800, 800));
        d.setIntrinsicHeight(800);
        d.setIntrinsicWidth(800);
        d.getPaint().setColor(Color.BLUE);
        d.getPaint().setStyle(Paint.Style.STROKE);
        iv_chart.setImageDrawable(d);
        iv_chart.setImageResource(R.drawable.barchart);




*/

    }



}
