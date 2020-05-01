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

public class RoomSix extends AppCompatActivity {
    int score = 0;
    final String secret_message = "...././.-../.-../---";
    boolean solved = false;
    String success_message = "You've got a good rhythm going and you're starting to get the hang of all this tapping. \"It's so nice to finally be understood!\" Morse the Horse taps at you. \"Thank you!\"\n" +
            "\nYou have earned 10 points.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_six);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);
        //USAGE: Display a message using messageBox.display(string);

        final ImageView ciphertext = (ImageView) findViewById(R.id.ciphertext3);
        final ImageView cipher = (ImageView) findViewById(R.id.cipher3);
        final ImageView encode = (ImageView) findViewById(R.id.encode);
        final ImageView submit = (ImageView) findViewById(R.id.submit);
        final TextView attempt = (TextView) findViewById(R.id.attempt);

        final TextView scoreCounter =  findViewById(R.id.Score);
        SharedPreferences myScore = this.getSharedPreferences("MyScore", Context.MODE_PRIVATE);
        score = myScore.getInt("playerScore", 0);

        scoreCounter.setText("Score: " + score);
        scoreCounter.setTextColor(Color.BLACK);

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

        encode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                encode.setVisibility(View.INVISIBLE);
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

        messageBox.display("You enter the room to find Morse the Horse! Due to obvious constraints, he can only communicate with you by tapping his hoof. \nIf you want to say hello, you're going \n" +
                "to have to use Morse Code!");

        ImageView morse = (ImageView) findViewById(R.id.morse);

        morse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(solved){
                    messageBox.display(success_message);
                }//end if
                else{
                    cipher.setVisibility(View.VISIBLE);
                    messageBox.display("Morse the horse says: \"--./.-./././-/../-./--./...\" " +
                            "Due to obvious constraints, he can only communicate with you by " +
                            "tapping his hoof. \nIf you want to say \"hello\", you're going " +
                            "to have to use Morse Code!" +
                            "\nHint: Enter Morse Code with forward slashes between each Morse letter " +
                            "with no additional spaces.");
                }//end else
                //cipher.setVisibility(View.INVISIBLE);
            }//end onClick
        });//end morse.setOnClickListener
    }//end onCreate

    boolean verifyAttempt(String attempt){
        if (attempt.equals(secret_message)) {
            return true;
        }
        else {
            return false;
        }
    }//end verifyAttempt


}
