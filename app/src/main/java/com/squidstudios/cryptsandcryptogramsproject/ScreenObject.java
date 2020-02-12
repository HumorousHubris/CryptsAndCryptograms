package com.squidstudios.cryptsandcryptogramsproject;
import android.graphics.Bitmap;
import android.graphics.drawable.shapes.Shape;

public class ScreenObject {

    //screen coordinates - in percentages
    int x;
    int y;

    Bitmap[] imgs; //array of Bitmaps in the order they are displayed
    private int currentImgNum;
    Bitmap currentImg;
    String imgPath;
    String name;
    Shape mask;

    public ScreenObject(){
        imgs = null;
        name = "NULLobject";
        imgPath = null;
        currentImgNum = 0;
    }

    public ScreenObject(String n, String path, int x, int y) {
        name=n;
        imgPath=path;
        currentImgNum = 0;
        this.x =x;
        this.y=y;

        //TODO: read in the Bitmaps from the path

    }

    public void nextImage(){
        currentImgNum += 1;
        currentImg = imgs[currentImgNum];
    }



    public void draw(){

    }
}