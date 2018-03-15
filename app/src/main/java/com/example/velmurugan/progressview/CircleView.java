package com.example.velmurugan.progressview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Velmurugan on 3/15/2018.
 */

public class CircleView extends View {
    private String TAG = CircleView.class.getSimpleName();
    private Paint paint;
    int canvasWidth,canvasHeight;
    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GRAY);

        int padding = canvasWidth / 10;
        int startX = padding;
        int startY = canvasHeight / 2;
        // Created Circle over progressbar
        paint.setColor(Color.BLACK);
        canvas.drawCircle(startX,startY,60,paint);
        paint.setColor(Color.RED);
        canvas.drawCircle(startX,startY,30,paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        canvasWidth = MeasureSpec.getSize(widthMeasureSpec);
        canvasHeight = MeasureSpec.getSize(heightMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                log("ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                log("ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                log("ACTION_MOVE");
                break;
        }
        return true;
    }

    private void log(String log){
        Log.d(TAG,log);
    }
}
