package com.example.lab5_1_2_multi_circles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;

public class ViewWithCircles extends View {

    public ViewWithCircles(Context context){ super(context);}
    public ViewWithCircles(Context context, AttributeSet attrs) { super(context, attrs);}
    public ViewWithCircles(Context context, AttributeSet attrs, int defaultStyle) {
        super(context, attrs, defaultStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);

        Paint circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);


        //Circle1
        LinearGradient linGrad = new LinearGradient(1, 1, 25, 25, Color.RED, Color.BLACK, Shader.TileMode.MIRROR);
        circlePaint.setShader(linGrad);
        canvas.drawCircle(300,300,300, circlePaint);

        RadialGradient RadGrad = new RadialGradient(750, 475, 150, Color.GREEN, Color.BLACK, Shader.TileMode.MIRROR);
        circlePaint.setShader(RadGrad);
        canvas.drawCircle(750, 475, 150, circlePaint);

        SweepGradient sweepGrad = new SweepGradient(canvas.getWidth() -475, canvas.getHeight()-475,
                new int[] {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA}, null);
        circlePaint.setShader(sweepGrad);
        canvas.drawCircle(canvas.getWidth() -475, canvas.getHeight()-475,300,circlePaint);



    }
}
