package com.squidstudios.cryptsandcryptogramsproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RoomOne extends MainActivity {
    int score = 0;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_one);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //USAGE: Display a message using messageBox.display(string);
        final MessageBox messageBox = (MessageBox) getFragmentManager().findFragmentById(R.id.message_fragment);

        // ScoreCounter and Display
        final TextView scoreCounter =  findViewById(R.id.Score);
        SharedPreferences myScore = this.getSharedPreferences("MyScore", Context.MODE_PRIVATE);
        score = myScore.getInt("playerScore", 0);
        scoreCounter.setTextColor(Color.WHITE);
        scoreCounter.setText("Score: " + score);

        // Answer Choices Buttons
        final Button btn1 = (Button) findViewById(R.id.Choice1);
        final Button btn2 = (Button) findViewById(R.id.Choice2);
        final Button btn3 = (Button) findViewById(R.id.Choice3);
        final Button btn4 = (Button) findViewById(R.id.Choice4);
        hideAnswerButtons(btn1,btn2,btn3,btn4);

        // region Kermit
        final ImageView kermit = (ImageView) findViewById(R.id.kermit);
        kermit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "Who let the dogs out?\n(A) Bow Wow \t(B) The Doggies \n(C) Hannah Montana \t\t\t(D) Obama";
                messageBox.display(h_question);
                displayAnswerButtons(btn1,btn2,btn3,btn4);
                scoreCounter.setTextColor(Color.WHITE);
                //TODO show the question choices here!
                //answer options:
                //Bow Wow
                //The Doggies <-- the right answer (this is the band who sang the song)
                //Hannah Montana
                //Obama

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score += 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.GREEN);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });
            }
        });
        // endregion <!--endregion-->

        // region Wazosk
        final ImageView wazosk = (ImageView) findViewById(R.id.wazosk);
        wazosk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "Who blessed the rains down in Africa?\n(A) Jesus \t(B) a-ha \n(C) Toto \t\t\t(D) Wham!";
                messageBox.display(h_question);
                displayAnswerButtons(btn1,btn2,btn3,btn4);
                scoreCounter.setTextColor(Color.WHITE);
                //TODO show the question choices here!
                //answer options:
                //Jesus
                //a-ha
                //Toto <-- the right answer
                //Wham!

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score += 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.GREEN);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });
            }
        });
        // endregion

        // region Kirby
        final ImageView kirb = (ImageView) findViewById(R.id.kirb);
        kirb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "How did Jeffrey Epstein die?\n(A) Murder \t(B) Suicide \n(C) Not dead \t\t\t(D) Epstein did not kill himself";
                messageBox.display(h_question);
                displayAnswerButtons(btn1,btn2,btn3,btn4);
                scoreCounter.setTextColor(Color.WHITE);
                //TODO show the question choices here!
                //answer choices:
                //murder
                //suicide
                //he's not dead
                //Jeffrey Epstein Did Not Kill Himself <-- the correct answer

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score += 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.GREEN);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });
            }
        });
        // endregion

        // region Yoshi
        final ImageView yosh = (ImageView) findViewById(R.id.yosh);
        yosh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String h_question = "What college do you go to?\n(A) Texas Tech University \t(B) Texas A&M University \n(C) Zoom University \t\t\t(D) Oklahoma University";
                messageBox.display(h_question);
                displayAnswerButtons(btn1,btn2,btn3,btn4);
                scoreCounter.setTextColor(Color.WHITE);
                //TODO show the question choices here!
                //answer choices:
                //Texas Tech University
                //Texas A&M University
                //Zoom University <-- correct answer
                //Oklahoma University

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score += 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.GREEN);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        score -= 10;
                        SharedPreferences myScore = getSharedPreferences("MyScore", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = myScore.edit();
                        editor.putInt("score", score);
                        editor.commit();
                        scoreCounter.setTextColor(Color.RED);
                        scoreCounter.setText("Score: " + score);
                        hideAnswerButtons(btn1,btn2,btn3,btn4);
                    }
                });
            }
        });
        // endregion
    }

    protected void hideAnswerButtons(Button btn1, Button btn2, Button btn3, Button btn4){
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
    }

    protected void displayAnswerButtons(Button btn1, Button btn2, Button btn3, Button btn4){
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }
}