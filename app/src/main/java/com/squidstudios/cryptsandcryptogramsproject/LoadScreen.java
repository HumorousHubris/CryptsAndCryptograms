package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoadScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        final Button btnRoomOne = (Button) findViewById(R.id.RoomOne);
        final Button btnRoomTwo = (Button) findViewById(R.id.RoomTwo);
        final Button btnRoomThree = (Button) findViewById(R.id.RoomThree);
        final Button btnRoomFour = (Button) findViewById(R.id.RoomFour);
        final Button btnRoomFive = (Button) findViewById(R.id.RoomFive);
        final Button btnRoomSix = (Button) findViewById(R.id.RoomSix);
        final Button btnRoomSeven = (Button) findViewById(R.id.RoomSeven);
        final Button btnRoomEight = (Button) findViewById(R.id.RoomEight);
        final Button btnRoomNine = (Button) findViewById(R.id.RoomNine);

        btnRoomOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomOne.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomTwo.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomThree.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomFour.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomFive.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomSix.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomSeven.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomEight.class);
                startActivity(activityChangeIntent);
            }
        });

        btnRoomNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(LoadScreen.this, RoomNine.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}
