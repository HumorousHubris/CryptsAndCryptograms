package com.squidstudios.cryptsandcryptogramsproject;

import org.junit.*;
import org.junit.runner.RunWith;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import static org.junit.Assert.*;
public class RoomOneTest {

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

    /*@Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.squidstudios.cryptsandcryptogramsproject", appContext.getPackageName());
    }*/
}