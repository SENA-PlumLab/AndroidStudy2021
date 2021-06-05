package com.example.lab2_2_2_pinwheel;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_pinwheel = (ImageView)findViewById(R.id.pinwheel); //drawble내의 image인식

        ObjectAnimator object = ObjectAnimator.ofFloat(iv_pinwheel, "rotation", 360);
        //360도 회전
        object.setInterpolator(new LinearInterpolator()); //일정한 속도로 움직이게 함
        object.setDuration(2000); //animation 회전을 2초 간격으로 설정
        object.setRepeatCount(ValueAnimator.INFINITE); //animation 무한으로 반복하게 설정
        object.start(); //animation 실행




    }
}