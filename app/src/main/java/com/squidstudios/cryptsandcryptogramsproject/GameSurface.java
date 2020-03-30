package com.squidstudios.cryptsandcryptogramsproject;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import android.view.SurfaceHolder;

public class GameSurface extends SurfaceView implements SurfaceHolder.Callback {

    Game g;

    //these are apparently required to use the thing in an XML activity
    public GameSurface(Context c, AttributeSet attrs, int defStyle){
        super(c,attrs,defStyle);
        //this.setFocusable(true);
        //this.getHolder().addCallback(this);
        //this.getHolder().setFixedSize(1920,1080); //forcing to be 1080p for now.
        //Log.i("GameSurface","height:" + this.getHeight() + " width: " + this.getWidth());
        g = new Game(c);
    }
    public GameSurface(Context c, AttributeSet at){
        super(c,at);g=new Game(c);
        //Log.i("GameSurface","height:" + this.getHeight() + " width: " + this.getWidth());
        //this.setFocusable(true);
        //this.getHolder().addCallback(this);
        //this.getHolder().setFixedSize(1920,1080); //forcing to be 1080p for now.
    }

    public GameSurface(Context context){
        super(context);
        this.setFocusable(true);
        this.getHolder().addCallback(this);
        this.getHolder().setFixedSize(1920,1080); //forcing to be 1080p for now.
        android.view.ViewGroup.LayoutParams lp = this.getLayoutParams();
        lp.width = 1920;
        lp.height = 1080;
        this.setLayoutParams(lp);

        //Log.i("GameSurface","height:" + this.getHeight() + " width: " + this.getWidth());
        g= new Game(context); //just implementing new game for now
        //this.setScaleX(0.5F);
        //this.setScaleY(0.5F);
        //this.setRotation(180F);
    }

    /*
    Stopping work for now, everything is working when rotating the images 90 degrees but the images are super large.
    the screen resolution _is_ being set right but only a corner of the background actually fits on it.
     */



    public void draw(Canvas canvas){
        super.draw(canvas);
        g.currentRoom.draw(canvas);
        //Drawable d= getResources().getDrawable(R.drawable.dung,null);
        //d.setBounds(1,2,4,6);
        //d.draw(canvas);
        //draw the HUD

    }

    public void surfaceCreated(SurfaceHolder holder){
        //Log.i("GameSurface","height:" + this.getHeight() + " width: " + this.getWidth());
        Canvas canvas = this.getHolder().lockCanvas();
        canvas.rotate(90f);
        this.draw(canvas);
        this.getHolder().unlockCanvasAndPost(canvas);
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}
    public void surfaceDestroyed(SurfaceHolder holder) {}

    @Override
    public boolean onTouchEvent(MotionEvent e){
        if(e.getAction() == MotionEvent.ACTION_DOWN){ //when user presses down
            Log.i("GameSurface","height:" + this.getHeight() + " width: " + this.getWidth());
            g.currentRoom.touched(e.getX(),e.getY());
            Canvas canvas = this.getHolder().lockCanvas();
            this.draw(canvas);
            this.getHolder().unlockCanvasAndPost(canvas);
        }
        return true;
    }
}
