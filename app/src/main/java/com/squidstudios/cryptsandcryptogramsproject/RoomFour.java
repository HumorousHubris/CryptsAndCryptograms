package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RoomFour extends AppCompatActivity {
    int score = 0;
    final String secret_message = "votijgu"; // "unshift" Caesar ciphered by 1
    boolean solved = false;
    String success_message = "\"You've broken the spell! I'm not sure who cursed me, " +
            "but as a military general I always have to watch my back for enemies " +
            "of the state. It must be because it is the Ides of March. " +
            "I have to go now or I'll be late for a senate session, " +
            "thanks again!\"" +
            "\nYou have earned 10 points.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_four);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        //USAGE: Display a message using messageBox.display(string);

        final ImageView decode = (ImageView) findViewById(R.id.decode);
        final ImageView submit = (ImageView) findViewById(R.id.submit);
        final TextView attempt = (TextView) findViewById(R.id.attempt);

        final TextView scoreCounter =  findViewById(R.id.Score);
        SharedPreferences myScore = this.getSharedPreferences("MyScore", Context.MODE_PRIVATE);
        score = myScore.getInt("playerScore", 0);
        scoreCounter.setTextColor(Color.WHITE);
        scoreCounter.setText("Score: " + score);

        decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decode.setVisibility(View.INVISIBLE);
                attempt.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((verifyAttempt(attempt.getText().toString()))){
                    attempt.setVisibility(View.INVISIBLE);
                    submit.setVisibility(View.INVISIBLE);
                    solved = true;
                    messageBox.display(success_message);

                    score += 10;
                    SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = myScore.edit();
                    editor.putInt("score", score);
                    editor.commit();
                    scoreCounter.setTextColor(Color.GREEN);
                    scoreCounter.setText("Score: " + score);
                }
                else {
                    attempt.setText("");
                    messageBox.display("It didn't seem to be the correct answer.");
                }
            }//end onClick
        });//end submit.setOnClickListener

        messageBox.display("You enter the room to find the great roman military general Julius " +
                "Caesar. He seems troubled. Talk to him!");

        ImageView caesar = (ImageView) findViewById(R.id.caesar);
        caesar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(solved){
                    messageBox.display(success_message);
                }//end if
                else{
                    messageBox.display("You try to greet him, but something seems off about Caesar. " +
                            "\"Ifmmp!\", he mumbles at you. Thinking it was a \"one-off\" mistake, " +
                            "you greet him again. \"Qmfbtf ifmq nf!\", he replies. It seems he has " +
                            "some kind of curse which \"shifts\" the meaning of his sentences!" +
                            "Break the spell by typing \"unshift\" translated into Caesar's cipher. " +
                            "Enter the answer with no additional spaces.");
                }//end else
            }//end onClick
        });//end caesar.setOnClickListener
    }//end onCreate

    boolean verifyAttempt(String attempt){
        if (attempt.toLowerCase().equals(secret_message.toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }//end verifyAttempt
}//end RoomFour class
