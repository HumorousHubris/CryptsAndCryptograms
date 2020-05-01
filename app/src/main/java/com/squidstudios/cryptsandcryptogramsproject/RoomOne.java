package com.squidstudios.cryptsandcryptogramsproject;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

public class RoomOne extends MainActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_one);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        final Button btn1 = (Button) findViewById(R.id.Choice1);
        final Button btn2 = (Button) findViewById(R.id.Choice2);
        final Button btn3 = (Button) findViewById(R.id.Choice3);
        final Button btn4 = (Button) findViewById(R.id.Choice4);
        //final AnswerBox answerButtons =
        //USAGE: Display a message using messageBox.display(string);


        final ImageView kermit = (ImageView) findViewById(R.id.kermit);
        kermit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "Who let the dogs out?\n(A) Bow Wow \t(B) The Doggies \n(C) Hannah Montana \t\t\t(D) Obama";
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
                String h_question = "Who blessed the rains down in Africa?\n(A) Jesus \t(B) a-ha \n(C) Toto \t\t\t(D) Wham!";
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
                String h_question = "How did Jeffrey Epstein die?\n(A) Murder \t(B) Suicide \n(C) Not dead \t\t\t(D) Epstein did not kill himself";
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
                String h_question = "What college do you go to?\n(A) Texas Tech University \t(B) Texas A&M University \n(C) Zoom University \t\t\t(D) Oklahoma University";
                messageBox.display(h_question);
                //TODO show the question choices here!
                //answer choices:
                //Texas Tech University
                //Texas A&M University
                //Zoom University <-- correct answer
                //Oklahoma University
            }
        });

        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(RoomOne.this,);
                startActivity(activityChangeIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(android.intent.action.VIEW);
                startActivity(activityChangeIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(android.intent.action.VIEW);
                startActivity(activityChangeIntent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(android.intent.action.VIEW);
                startActivity(activityChangeIntent);
            }
        });
        */
    }
}