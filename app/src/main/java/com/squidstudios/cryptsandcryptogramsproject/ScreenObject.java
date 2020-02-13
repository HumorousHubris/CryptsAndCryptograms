package com.squidstudios.cryptsandcryptogramsproject;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.content.res.Resources;

public class ScreenObject {

    //screen coordinates - in percentages?
    int x;
    int y;

    Bitmap[] imgs; //array of Bitmaps in the order they are displayed
    private int currentImgNum;
    Bitmap currentImg;
    String name;
    int width;
    int height;

    public ScreenObject(){
        imgs = null;
        currentImg = null;
        name = "NULLobject";
        currentImgNum = 0;
    }

    public ScreenObject(String n, Bitmap[] b, int x, int y) {
        name=n;
        imgs = b;
        currentImg = b[0];
        currentImgNum = 0;
        this.x =x;
        this.y =y;
        width = currentImg.getWidth();
        height = currentImg.getHeight();
    }

    public void nextImage(){
        currentImgNum += 1;
        currentImg = imgs[currentImgNum];
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(currentImg,x,y,new Paint());
    }
}