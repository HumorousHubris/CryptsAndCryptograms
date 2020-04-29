package com.squidstudios.cryptsandcryptogramsproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RoomOne extends MainActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_one);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        //USAGE: Display a message using messageBox.display(string);


        final ImageView kermit = (ImageView) findViewById(R.id.kermit);
        kermit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "question for this object goes here.";
                messageBox.display(h_question);
                //TODO show the question choices here!
            }
        });

        final ImageView wazosk = (ImageView) findViewById(R.id.wazosk);
        wazosk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "question for this object goes here.";
                messageBox.display(h_question);
                //TODO show the question choices here!
            }
        });

        final ImageView kirb = (ImageView) findViewById(R.id.kirb);
        kirb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "question for this object goes here.";
                messageBox.display(h_question);
                //TODO show the question choices here!
            }
        });

        final ImageView yosh = (ImageView) findViewById(R.id.yosh);
        yosh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "question for this object goes here.";
                messageBox.display(h_question);
                //TODO show the question choices here!
            }
        });

    }


}
