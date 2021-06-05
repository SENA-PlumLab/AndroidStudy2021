package com.example.hw5_3_chartgraphdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class BarCanvas extends View{
    public BarCanvas(Context context){ super(context);    }
    public BarCanvas(Context context, AttributeSet attrs){ super(context, attrs);    }
    public BarCanvas(Context context, AttributeSet attrs, int defaultStyle){ super(context, attrs, defaultStyle);    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawRect(75, (800-800*(float)0.74), 150, 800, paint);
        paint.setColor(Color.BLUE);
        canvas.drawRect(225, (800-800*(float)0.05), 300, 800, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(375, (800-800*(float)0.04), 450, 800, paint);
        paint.setColor(Color.CYAN);
        canvas.drawRect(525, (800-800*(float)0.00), 600, 800, paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(675, (800-800*(float)0.06), 750, 800, paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawRect(825, (800-800*(float)0.07), 900, 800, paint);




        invalidate();
    }

}
