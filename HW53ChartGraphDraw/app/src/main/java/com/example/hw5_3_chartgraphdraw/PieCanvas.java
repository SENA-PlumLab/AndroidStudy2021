package com.example.hw5_3_chartgraphdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PieCanvas extends View{
    public PieCanvas(Context context){ super(context);    }
    public PieCanvas(Context context, AttributeSet attrs){ super(context, attrs);    }
    public PieCanvas(Context context, AttributeSet attrs, int defaultStyle){ super(context, attrs, defaultStyle);    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF mBigOval = new RectF(0 , 0, 800, 800);
        Paint p = new Paint();
        DashPathEffect dashPath = new DashPathEffect(new float[]{5, 5}, (float)1.0);
        PathEffect path = new PathEffect();
        p.setPathEffect(path);
        p.setStyle(Paint.Style.FILL_AND_STROKE);
        p.setColor(Color.BLACK);
        canvas.drawArc(mBigOval, 0, 360, true, p);
        p.setColor(Color.MAGENTA);
        canvas.drawArc(mBigOval, 0, 360*(float)0.96,true, p);
        p.setColor(Color.GREEN);
        canvas.drawArc(mBigOval, 0, 360*(float)0.89, true, p);
        p.setColor(Color.CYAN);
        canvas.drawArc(mBigOval, 0, 360*(float)0.835, true, p);
        p.setColor(Color.YELLOW);
        canvas.drawArc(mBigOval, 0, 360*(float)0.83, true, p);
        p.setColor(Color.BLUE);
        canvas.drawArc(mBigOval, 0, 360*(float)0.79, true, p);
        p.setColor(Color.RED);
        canvas.drawArc(mBigOval, 0, 360*(float)0.74, true, p);

        invalidate();

    }

}
