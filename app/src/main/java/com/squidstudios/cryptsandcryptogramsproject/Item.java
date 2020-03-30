package com.squidstudios.cryptsandcryptogramsproject;

import android.graphics.Bitmap;

public class Item {
    Bitmap icon; //for inventory
    String name;

    public Item(){
        icon = null;
        name = "nullitem";
    }

    public Item(Bitmap i,String n){
        icon = i;
        name = n;
    }
}
