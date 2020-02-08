package com.squidstudios.cryptsandcryptogramsproject;
import android.media.Image;

public class ScreenObject {

    //screen coordinates
    int x;
    int y;

    Image[] imgs; //array of images in the order they are displayed
    private int currentImgNum;
    Image currentImg;
    String imgPath;
    String name;

    public ScreenObject(String n, String path) {
        name=n;
        imgPath=path;
        currentImgNum = 0;

        //TODO: read in the images from the path

    }

    public void nextImage(){
        currentImgNum += 1;
        currentImg = imgs[currentImgNum];
    }

    public void draw(){

    }
}