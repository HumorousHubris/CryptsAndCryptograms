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
        g= new Game(context); //just implementing new game for now
    }

    public void draw(Canvas canvas){
        super.draw(canvas);
        g.currentRoom.draw(canvas);
        canvas.drawColor(456);
    }

    public void surfaceCreated(SurfaceHolder holder){
        Canvas canvas = this.getHolder().lockCanvas();
        this.draw(canvas);
        this.getHolder().unlockCanvasAndPost(canvas);
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}
    public void surfaceDestroyed(SurfaceHolder holder) {}

}
