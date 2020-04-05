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

        //Example of prompting a display message through a click event
        final ImageView hamtaro = (ImageView) findViewById(R.id.hamtaro);
        hamtaro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String Hamtaro_Description = "Hamtaro, known in Japan as Trotting Hamtaro, is a Japanese children's manga "
                        + "and storybook series created and illustrated by Ritsuko Kawai. The manga is "
                        + "serialized in Shogakukan's all-girl's magazine Ciao in 1997, focusing on a "
                        + "hamster named Hamtaro who has a variety of adventures with other hamsters, "
                        + "known as \"Ham-Hams\" (\"Hamuchans\" in the Japanese version). ";
                messageBox.display(Hamtaro_Description);
            }
        });
    }


}
