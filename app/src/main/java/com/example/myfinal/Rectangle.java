package com.example.myfinal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Rectangle extends View {

    public int SQURE_SIZE=100;
    private Rect rect;

    private Paint paint;
    public Rectangle(Context context) {
        super(context);
        init(null);
    }

    public Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public Rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public Rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }
    private  void init(@Nullable AttributeSet set){
        rect=new Rect();
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GREEN);
    }
    public  void swapcolor(){
        paint.setColor(paint.getColor()==Color.RED? Color.GREEN:Color.RED);
        postInvalidate();
    }
    public  void swapwidth(){
       // paint.setColor(paint.getStrokeWidth()==10? Color.RED:StrokeWidth.15f);
        postInvalidate();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.RED);
        paint.setStrokeWidth(15f);


        // canvas.drawLine(100, 500, 0, 1200, paint);
        canvas.drawLine(50, 1200, 50, 500, paint);
        canvas.drawLine(150, 1200, 150, 500, paint);
        canvas.drawLine(100, 1200, 150, 500, paint);
        canvas.drawLine(100, 1200, 50, 500, paint);
    }
}
