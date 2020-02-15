package com.squidstudios.cryptsandcryptogramsproject;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer renderer;

    @Override
    public boolean onTouchEvent(MotionEvent e){
        float x = e.getX();
        float y = e.getY();

        //Game.onTouchEvent(x,y);

        return true;
    }

    public MyGLSurfaceView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        renderer = new MyGLRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer);

        //redraw screen only when requested
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

    }
}

