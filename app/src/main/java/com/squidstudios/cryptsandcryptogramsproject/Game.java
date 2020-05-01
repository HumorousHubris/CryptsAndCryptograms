package com.squidstudios.cryptsandcryptogramsproject;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;

public class Game {
    boolean[] doorsUnlocked;
    Room[] rooms = new Room[1]; //VALUE HERE SHOULD REFLECT NUMBER OF ROOMS IN THE GAME
    //Player player;
    //Room playerLocation; //maybe add to player class?
    Room currentRoom;
    Context context;
    Resources res;
    Item[] inventory = new Item[6]; //assuming 6 items max in inventory

    public Game(Context c){ //call this constructor for new game
        res = c.getResources();
        /*
        Bitmaps are defined in this constructor now, but later they can be loaded in the loadRoom()
        method which constructs the room
         */
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inDensity = 420; //these three things are currently hardcoded, for Pixel API 29. In future set these dynamically.
        o.outHeight = 1920;
        o.outWidth = 1080;

        Bitmap itemFrameBmp = BitmapFactory.decodeResource(res,R.drawable.item_frame,o);
        ScreenObject currentItemFrame = new ScreenObject("active item frame", itemFrameBmp,0,1080);
        ScreenObject currentItem = new ScreenObject();

        //define all screenObjects for room 1 here
        ScreenObject[] room1Objs = new ScreenObject[1]; //set this to number of objects in the room
        Bitmap[] chestImgs = new Bitmap[2];

        room1Objs[0] = new ScreenObject("Chest",chestImgs,700,700);
        Bitmap room1Background = BitmapFactory.decodeResource(res,R.drawable.dung,o);
        Room firstRoom = new Room(room1Objs,room1Background,"This is the first room of the game.");
        rooms[0] = firstRoom;
        currentRoom = firstRoom;
        //ScreenObject testCurtain = new ScreenObject();
        //ScreenObject testWindow = new ScreenObject();

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
