package com.squidstudios.cryptsandcryptogramsproject;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.robolectric.Robolectric;

import static org.junit.Assert.*;
import androidx.appcompat.app.AppCompatActivity;

public class RoomOneTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            RoomOne.class);

    @Before
    public void setUp() throws Exception {
        System.out.println("Before\n");
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
        Intent serviceIntent = Robolectric.getShadowApplication().getNextStartedService();
        assertEquals("MY_INTENT_ACTION", serviceIntent.getAction());
    }

    @Test
    public void shouldShowHamtaroFragment() throws Exception {
        assertNotNull( activity.getFragmentManager().findFragmentById( R.id.welcome_fragment ) );
        /*
        Activity activity = MainActivity.buildActivity(RoomOne.class).create().visible().get();
        assertEquals(View.VISIBLE, activity.findViewById(R.id.hamtaro).getVisibility());

         */
    }

    @Test
    public void testOnCreate() {
    }

    @Test
    public void addContentView() {
    }

    @Test
    public void onStart() {
    }

    @Test
    public void onStop() {
    }

    @Test
    public void onSaveInstanceState() {
    }

    @Test
    public void openOptionsMenu() {
    }

    @Test
    public void closeOptionsMenu() {
    }

    @Test
    public void onBackPressed() {
    }

    @Test
    public void startActivityForResult() {
    }

    @Test
    public void testStartActivityForResult() {
    }

    @Test
    public void startActivity() {
    }

    @Test
    public void testStartActivity() {
    }

    @Test
    public void startActivities() {
    }

    @Test
    public void testStartActivities() {
    }

    @Test
    public void testOnCreate1() {
    }
}