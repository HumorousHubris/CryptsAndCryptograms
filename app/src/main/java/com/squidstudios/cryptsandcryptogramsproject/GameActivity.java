package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;

import java.io.InputStream;


public class GameActivity extends AppCompatActivity {

    //public GLSurfaceView gLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Game g = new Game();
        //set fullscreen & remove title
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //instantiate the game view
        this.setContentView(new GameSurface(this));

        //gLView = new MyGLSurfaceView(this);
        //setContentView(gLView);
        //Bitmap test = BitmapFactory.decodeResource(getResources(),R.drawable.jade);
        //gLView.requestRender();

    }

    //public GameActivity getActiv(){return this;}
}

