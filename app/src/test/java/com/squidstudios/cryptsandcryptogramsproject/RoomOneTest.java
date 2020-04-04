package com.squidstudios.cryptsandcryptogramsproject;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import androidx.appcompat.app.AppCompatActivity;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class RoomOneTest {

    private RoomOne activity;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before\n");
        activity = Robolectric.setupActivity(RoomOne.class);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After\n");
    }

    @Test
    public void onCreate() {
        System.out.println("onCreate Test\n");
    }

    @Test
    public void checkActivityNotNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldStartMyIntentService() throws Exception {
        //Intent serviceIntent = Robolectric.getShadowApplication().getNextStartedService();
        //assertEquals("MY_INTENT_ACTION", serviceIntent.getAction());
    }

    @Test
    public void shouldShowHamtaroFragment() throws Exception {
        //assertNotNull( activity.getFragmentManager().findFragmentById( R.id.welcome_fragment ) );
        /*
        Activity activity = MainActivity.buildActivity(RoomOne.class).create().visible().get();
        assertEquals(View.VISIBLE, activity.findViewById(R.id.hamtaro).getVisibility());

         */
    }

    @Test
    public void addContentView() {
    }

    @Test
    public void onBackPressed() {
    }

    @Test
    public void startActivity() {
    }
}