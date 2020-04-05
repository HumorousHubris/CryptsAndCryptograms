package com.squidstudios.cryptsandcryptogramsproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ScreenObjectTest {


    @Test
    public void testNextImageNotNull() {
        Context context = ApplicationProvider.getApplicationContext();
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inDensity = 420; //these three things are currently hardcoded, for Pixel API 29. In future set these dynamically.
        o.outHeight = 1920;
        o.outWidth = 1080;
        Bitmap bitmp = BitmapFactory.decodeResource(context.getResources(),R.drawable.item_frame,o);
        ScreenObject currentItemFrame = new ScreenObject("active item frame", bitmp, 0, 1080);
        currentItemFrame.nextImage();
        assertNotNull(currentItemFrame.currentImg);
    }

    @Test
    public void testNextImageNull() {
        Bitmap nullBit = null;
        ScreenObject currentItemFrame = new ScreenObject("active item frame", nullBit, 0, 1080);
        currentItemFrame.nextImage();
        assertNull(currentItemFrame.currentImg);
    }

    //isTouched should return false
    //meaning the image is not touched
    @Test
    public void testIsTouchedFalse() {
        Context context = ApplicationProvider.getApplicationContext();
        Bitmap itemFrameBmp = BitmapFactory.decodeResource(context.getResources(),R.drawable.item_frame);
        ScreenObject currentItemFrame = new ScreenObject("active item frame", itemFrameBmp, 0, 1080);
        float xt = currentItemFrame.currentImg.getWidth() - 1000;
        float yt = currentItemFrame.currentImg.getHeight() - 2000;
        assertFalse(currentItemFrame.isTouched(xt,yt));
    }

    //isTouched should return true
    //meaning the image is touched
    @Test
    public void testIsTouchedTrue() {
        Context context = ApplicationProvider.getApplicationContext();
        Bitmap itemFrameBmp = BitmapFactory.decodeResource(context.getResources(),R.drawable.item_frame);
        ScreenObject currentItemFrame = new ScreenObject("active item frame", itemFrameBmp, 0, 1080);
        float xt = currentItemFrame.currentImg.getWidth() + currentItemFrame.x - 10;
        float yt = currentItemFrame.currentImg.getHeight() + currentItemFrame.y - 10;
        assertTrue(currentItemFrame.isTouched(xt,yt));
    }

    @Test
    public void testTouched() {
        Context context = ApplicationProvider.getApplicationContext();
        ScreenObject[] room1Objs = new ScreenObject[1]; //set this to number of objects in the room
        Bitmap[] chestImgs = new Bitmap[2];
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inDensity = 420; //these three things are currently hardcoded, for Pixel API 29. In future set these dynamically.
        o.outHeight = 1920;
        o.outWidth = 1080;
        chestImgs[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.chestclosed,o);
        chestImgs[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.chestopen,o);
        room1Objs[0] = new ScreenObject("Chest",chestImgs,700,700);
        float xt = room1Objs[0].currentImg.getWidth() + room1Objs[0].x - 10;
        float yt = room1Objs[0].currentImg.getHeight() + room1Objs[0].y - 10;
        room1Objs[0].touched(xt,yt);
        assertEquals(room1Objs[0].currentImg, chestImgs[1]);
    }

}