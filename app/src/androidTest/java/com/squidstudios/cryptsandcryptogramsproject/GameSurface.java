package com.squidstudios.cryptsandcryptogramsproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import android.view.SurfaceHolder;

public class GameSurface extends SurfaceView implements SurfaceHolder.Callback {

    Game g;

    public GameSurface(Context context){
        super(context);
        this.setFocusable(true);
        this.getHolder().addCallback(this);
        this.getHolder().setFixedSize(1920,1080); //forcing to be 1080p for now.
        g= new Game(context); //just implementing new game for now
    }

    public void draw(Canvas canvas){
        super.draw(canvas);
        g.currentRoom.draw(canvas);
    }

    public void surfaceCreated(SurfaceHolder holder){
        Canvas canvas = this.getHolder().lockCanvas();
        this.draw(canvas);
        this.getHolder().unlockCanvasAndPost(canvas);
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}
    public void surfaceDestroyed(SurfaceHolder holder) {}

    @Override
    public boolean onTouchEvent(MotionEvent e){
        if(e.getAction() == MotionEvent.ACTION_DOWN){ //when user presses down
            g.currentRoom.touched(e.getX(),e.getY());
            Canvas canvas = this.getHolder().lockCanvas();
            this.draw(canvas);
            this.getHolder().unlockCanvasAndPost(canvas);
        }
        return true;
    }

}
