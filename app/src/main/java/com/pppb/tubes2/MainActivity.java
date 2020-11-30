package com.pppb.tubes2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{
    protected TextView score;
    protected TextView highScore;
    protected Button start;
    protected ImageView iv_11,iv_12,iv_13,iv_14,
            iv_21,iv_22,iv_23,iv_24,
            iv_31,iv_32,iv_33,iv_34,
            iv_41,iv_42,iv_43,iv_44;
    protected int currentScore;
    protected int nilai;
    protected Bitmap bitmap;
    protected Canvas mCanvas;
    protected Paint strokePaint;
    protected GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.start = findViewById(R.id.start);
        this.highScore = (TextView) findViewById(R.id.tv_highScore);
        this.score = (TextView) findViewById(R.id.tv_score);
        this.iv_11 = findViewById(R.id.iv_11);
        this.iv_12 = findViewById(R.id.iv_12);
        this.iv_13 = findViewById(R.id.iv_13);
        this.iv_14 = findViewById(R.id.iv_14);
        this.iv_21 = findViewById(R.id.iv_21);
        this.iv_22 = findViewById(R.id.iv_23);
        this.iv_24 = findViewById(R.id.iv_24);
        this.iv_31 = findViewById(R.id.iv_31);
        this.iv_32 = findViewById(R.id.iv_32);
        this.iv_33 = findViewById(R.id.iv_33);
        this.iv_34 = findViewById(R.id.iv_34);
        this.iv_41 = findViewById(R.id.iv_41);
        this.iv_42 = findViewById(R.id.iv_42);
        this.iv_43 = findViewById(R.id.iv_43);
        this.iv_44 = findViewById(R.id.iv_44);

        this.start.setOnClickListener(this);
        this.iv_11.setOnClickListener(this);
        this.iv_12.setOnClickListener(this);
        this.iv_13.setOnClickListener(this);
        this.iv_14.setOnClickListener(this);
        this.iv_21.setOnClickListener(this);
        this.iv_22.setOnClickListener(this);
        this.iv_23.setOnClickListener(this);
        this.iv_24.setOnClickListener(this);
        this.iv_31.setOnClickListener(this);
        this.iv_32.setOnClickListener(this);
        this.iv_33.setOnClickListener(this);
        this.iv_34.setOnClickListener(this);
        this.iv_41.setOnClickListener(this);
        this.iv_42.setOnClickListener(this);
        this.iv_43.setOnClickListener(this);
        this.iv_44.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view == this.start){
           this.start.setVisibility(view.GONE);
        }
        if(this.iv_11 == view){
            Log.d("test", "check");
            setContentView(R.layout.activity_main);
            this.currentScore = this.nilai;
            this.score.setText("Score: "+this.score);
        }
    }

    public void initiateCanvas(){
        // 1. Create Bitmap
        this.bitmap = Bitmap.createBitmap(iv_11.getWidth(),iv_11.getHeight(),Bitmap.Config.ARGB_8888);
        // 2. Associate the bitmap to the ImageView.
        this.iv_11.setImageBitmap(bitmap);
        // 3. Create a Canvas with the bitmap.
        this.mCanvas = new Canvas(bitmap);
        // new paint for stroke + style (Paint.Style.STROKE)
        this.strokePaint = new Paint();
        this.strokePaint.setStyle(Paint.Style.STROKE);

        //resetCanvas
        resetCanvas();
        this.iv_11.setOnTouchListener(this);
    }

    public void resetCanvas(){

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        //gesture listener
        return this.mDetector.onTouchEvent(motionEvent);
    }
}