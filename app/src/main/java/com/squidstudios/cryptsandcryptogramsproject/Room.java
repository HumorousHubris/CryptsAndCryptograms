package com.squidstudios.cryptsandcryptogramsproject;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Room {
    ScreenObject[] objs; //array of objects to be drawn on entering room
    String loadMessage; //message displayed in log when room entered.
    Bitmap background;
    //boolean lightState

    public void draw(Canvas canvas){ //method called when room is entered
        //draw all of the screen objects in the view on the activity
        canvas.drawBitmap(background,0,0,new Paint());
        for(int i=0; i < objs.length; i++){
            objs[i].draw(canvas);
        }
        //draw background as bitmap at (0,0) on canvas
        //TODO: Game.messageBox.display(loadMessage) //<-implement this
    }

    public Room(){
        objs = null;
        loadMessage = "This is a null room.";
        background = null;
    }

    public Room(ScreenObject[] objs, Bitmap background, String loadMessage){
        this.objs = objs;
        this.background = background;
        this.loadMessage = loadMessage;
    }
    
}
