package com.example.edu.singletouchview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class SingleTouchView  extends View {
    private Paint paint = new Paint();//색
    private  Path path = new Path();//그림정보 하나하나 저장
    public SingleTouchView(Context context, AttributeSet attrs) {//AttributeSet
        super(context, attrs);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10f);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float eventX = event.getX();
        float eventY = event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.reset();path.moveTo(eventX, eventY); break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(eventX, eventY); break;
            case MotionEvent.ACTION_UP: break;
            default: return false;
        }
        invalidate();
        return true;
    }
}
