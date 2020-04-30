package com.squidstudios.cryptsandcryptogramsproject;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
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
                String h_question = "Who let the dogs out?";
                messageBox.display(h_question);
                //TODO show the question choices here!
                //answer options:
                //Bow Wow
                //The Doggies <-- the right answer (this is the band who sang the song)
                //Hannah Montana
                //Obama
            }
        });

        final ImageView wazosk = (ImageView) findViewById(R.id.wazosk);
        wazosk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "Who blessed the rains down in Africa?";
                messageBox.display(h_question);
                //TODO show the question choices here!
                //answer options:
                //Jesus
                //a-ha
                //Toto <-- the right answer
                //Wham!
            }
        });

        final ImageView kirb = (ImageView) findViewById(R.id.kirb);
        kirb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "How did Jeffrey Epstein die?";
                messageBox.display(h_question);
                //TODO show the question choices here!
                //answer choices:
                //murder
                //suicide
                //he's not dead
                //Jeffrey Epstein Did Not Kill Himself <-- the correct answer

            }
        });

        final ImageView yosh = (ImageView) findViewById(R.id.yosh);
        yosh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "What college do you go to?";
                messageBox.display(h_question);
                //TODO show the question choices here!
                //answer choices:
                //Texas Tech University
                //Texas A&M University
                //Zoom University <-- correct answer
                //Oklahoma University
            }
        });

    }


}
