package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RoomTwo extends AppCompatActivity {
int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_two);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        //<include layout="@layout/message_box_position"/>    This is a backup of what was in the xml file
        //USAGE: Display a message using messageBox.display(string);

        final TextView scoreCounter =  findViewById(R.id.Score);
        final Button btnpoints = findViewById(R.id.btnPoints);


        SharedPreferences myScore = this.getSharedPreferences("MyScore", Context.MODE_PRIVATE);
        score = myScore.getInt("score", 0);
        scoreCounter.setText("Score: " + score);


        btnpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score += 10;
                SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = myScore.edit();
                editor.putInt("score", score);
                editor.commit();
                scoreCounter.setText("Score: " + score);
            }
        });

    }
}
