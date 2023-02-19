package com.example.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class RabbitView extends View {
    public float bitmapX;

    public float bitmapY;

    public RabbitView(Context context) {
        super(context);
        this.bitmapX = 10;
        this.bitmapY = 10;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 画笔
        Paint paint = new Paint();
        //  位图
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.mipmap.img2);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        // 回收对象
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
