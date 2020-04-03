package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class RoomThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_three);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        //USAGE: Display a message using messageBox.display(string);
    }
}
