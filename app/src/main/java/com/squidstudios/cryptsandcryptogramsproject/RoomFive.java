package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RoomFive extends AppCompatActivity {
    int score = 0;
    final String secret_message = "romance";
    boolean solved = false;
    String success_message = "Cupid seems happy. \"Oh! I think I've got the hang of it now. " +
            "I'm going to take over the rest of the translation from here. " +
            "Thank you for your help!\"" +
            "\nYou have earned 10 points.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_five);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        //USAGE: Display a message using messageBox.display(string);
        final ImageView ciphertext = (ImageView) findViewById(R.id.ciphertext);
        final ImageView cipher = (ImageView) findViewById(R.id.cipher);
        final ImageView decode = (ImageView) findViewById(R.id.decode);
        final ImageView submit = (ImageView) findViewById(R.id.submit);
        final TextView attempt = (TextView) findViewById(R.id.attempt);

        final TextView scoreCounter =  findViewById(R.id.Score);
        SharedPreferences myScore = this.getSharedPreferences("MyScore", Context.MODE_PRIVATE);
        score = myScore.getInt("playerScore", 0);
        scoreCounter.setTextColor(Color.WHITE);
        scoreCounter.setText("Score: " + score);

        ciphertext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cipher.setVisibility(View.VISIBLE);
            }
        });

        cipher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cipher.setVisibility(View.INVISIBLE);
            }
        });

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

        messageBox.display("You enter the room to find the matchmaker Cupid, " +
                "who is fussing over some Xs and Os. " +
                "You should probably ask him what's wrong. ");

        ImageView cupid = (ImageView) findViewById(R.id.cupid);

        cupid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(solved){
                    messageBox.display(success_message);
                }//end if
                else{
                    cipher.setVisibility(View.VISIBLE);
                    messageBox.display("Cupid shows you a chart which resembles tic-tac-toe. " +
                            "\"My lover Elian has sent me a letter in some strange code. " +
                            "There are 27 symbols and there are 26 letters in the alphabet. " +
                            "Can you help me find out what this says?\"" +
                            "\nHint: Touch the symbols to toggle back and forth from the encoded " +
                            "text to the chart. Enter the answer with no additional spaces.");

                }//end else
                //cipher.setVisibility(View.INVISIBLE);
            }//end onClick
        });//end cupid.setOnClickListener
    }//end onCreate

    boolean verifyAttempt(String attempt){
        if (attempt.toLowerCase().equals(secret_message.toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }//end verifyAttempt


}
