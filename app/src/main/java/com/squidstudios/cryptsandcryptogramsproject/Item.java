package com.squidstudios.cryptsandcryptogramsproject;

import android.graphics.Bitmap;

public class Item {
    Bitmap icon; //for inventory
    String name;
    String iconPath;

    public Item(){
        icon = null;
        name = "nullitem";
        iconPath = null;
    }

    public Item(String iP,String n){
        iconPath = iP; //todo not sure if having iconpath as a data member is necessary, it could just read in the value.
        //icon = new Image(iP)
        name = n;
    }
}
