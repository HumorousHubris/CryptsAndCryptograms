package com.squidstudios.cryptsandcryptogramsproject;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;

public class Game {
    boolean[] doorsUnlocked;
    Room[] rooms;
    //Player player;
    Room playerLocation; //maybe add to player class?
    public Bitmap[] graphicsBuffer;
    Room currentRoom;

    //define the rooms, items and ScreenObjects here:
    /*
        example:
        rooms = new room[x]; <- where x is the total number of rooms in the game.
        rooms[0] = new Room(...) //each room instantiated manually.
    */

    public Game(){ //call this constructor for new game

        //TODO player = new Player()
        //playerLocation = rooms[0]; //start the player in the first room
        //Todo any more game start protocols


    }

    public Game(String path){ //TODO call this constructor for continue and load game!

    }

    public void onTouchEvent(float x, float y){
        /*
        call the touched() method of the object touched, if any.
        replace that object's image in the graphicsBuffer
        redraw the screen (call
         */
    }

    public Bitmap makeFrame(){ //make each new frame the game will draw
        Bitmap base = currentRoom.background;
        int[] basePixels = new int[base.getWidth() * base.getHeight()];
        base.getPixels(basePixels,0,base.getWidth(),0,0,base.getWidth(),base.getHeight());

        for(int o=0; o > currentRoom.objs.length; o++){
            Bitmap overlay = currentRoom.objs[o].currentImg;
            int[] overlayPixels = new int[overlay.getWidth() * overlay.getHeight()];
            overlay.getPixels(overlayPixels, 0, overlay.getWidth(),0,0,overlay.getWidth(), overlay.getHeight());
            for(int i=currentRoom.objs[o].x;i < currentRoom.objs[o].x + currentRoom.objs[o].currentImg.getWidth(); i++){
                for(int j=currentRoom.objs[o].y;j < currentRoom.objs[o].y + currentRoom.objs[o].currentImg.getHeight(); j++){
                    basePixels[i + j*base.getWidth()] = overlayPixels[(i-currentRoom.objs[o].x) + (j-currentRoom.objs[o].y)*currentRoom.objs[o].currentImg.getWidth()];
                }
            }
        }
        Bitmap finalFrame = Bitmap.createBitmap(new DisplayMetrics(),basePixels,base.getWidth(),base.getHeight(),base.getConfig());
        return finalFrame;
    }
}
