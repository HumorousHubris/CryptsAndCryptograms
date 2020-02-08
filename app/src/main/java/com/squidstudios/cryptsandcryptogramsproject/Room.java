package com.squidstudios.cryptsandcryptogramsproject;

import android.media.Image;

public class Room {
    ScreenObject[] objs; //array of objects to be drawn on entering room
    String loadMessage; //message displayed in log when room entered.
    Image background;

    public void enter(){ //method called when room is entered
        //TODO: implement changing rooms, maybe after friday
    }

    public Room(){
        objs = null;
        loadMessage = "This is a null room.";
        background = null;
    }
    
}
