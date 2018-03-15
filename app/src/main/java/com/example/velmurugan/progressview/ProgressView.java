package com.example.velmurugan.progressview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Velmurugan on 3/15/2018.
 */

public class ProgressView extends View {
    private Paint paint;
    int canvasWidth,canvasHeight;
    public ProgressView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(50);
        paint.setColor(Color.BLUE);

        int padding = canvasWidth / 10;

        Path path = new Path();
        path.moveTo(padding,canvasHeight / 2 );
        path.lineTo(canvasWidth - padding , canvasHeight / 2);

        canvas.drawPath(path,paint);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        canvasWidth = MeasureSpec.getSize(widthMeasureSpec);
        canvasHeight = MeasureSpec.getSize(heightMeasureSpec);
    }
}
