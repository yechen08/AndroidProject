package com.feifei.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView[] image = new ImageView[12];
    private int[] imagePath = new int[]{
            R.mipmap.girl03,R.mipmap.girl03,R.mipmap.girl03,R.mipmap.girl03,
            R.mipmap.girl03,R.mipmap.girl03,R.mipmap.girl03,R.mipmap.girl03,
            R.mipmap.girl03,R.mipmap.girl03,R.mipmap.girl03,R.mipmap.girl03
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GridLayout layout = (GridLayout) findViewById(R.id.layout);
        for(int i=0;i<imagePath.length;i++){
            image[i] = new ImageView(MainActivity2.this);
            image[i].setImageResource(imagePath[i]);
            image[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(100, 100);
            image[i].setLayoutParams(params);
            layout.addView(image[i]);
        }

    }
}