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
        g= new Game(); //just implementing new game for now
    }

    public void draw(Canvas canvas){
        super.draw(canvas);
        for(int i=0; i < g.currentRoom.objs.length; i++){
            g.currentRoom.draw(canvas);
        }
    }

    public void surfaceCreated(SurfaceHolder holder){

    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}
    public void surfaceDestroyed(SurfaceHolder holder) {}

}
