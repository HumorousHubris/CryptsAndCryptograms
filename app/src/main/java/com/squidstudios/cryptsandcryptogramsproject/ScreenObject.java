package com.squidstudios.cryptsandcryptogramsproject;
import android.graphics.Bitmap;

public class ScreenObject {

    //screen coordinates
    int x;
    int y;

    Bitmap[] imgs; //array of Bitmaps in the order they are displayed
    private int currentImgNum;
    Bitmap currentImg;
    String imgPath;
    String name;

    public ScreenObject(){
        imgs = null;
        name = "NULLobject";
        imgPath = null;
        currentImgNum = 0;
    }

    public ScreenObject(String n, String path) {
        name=n;
        imgPath=path;
        currentImgNum = 0;

        //TODO: read in the Bitmaps from the path

    }

    public void nextImage(){
        currentImgNum += 1;
        currentImg = imgs[currentImgNum];
    }



    public void draw(){

    }
}