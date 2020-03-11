package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.content.Intent;
=======
import android.content.pm.ActivityInfo;
>>>>>>> 23336e5fd03ea0a3b97ff927260dd1787a17e055
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        final Button btnNewGame = (Button) findViewById(R.id.btnNewGame);
        btnNewGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, TextBox.class);
                startActivity(activityChangeIntent);
            }
        });

        final Button btnLoad = (Button) findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(activityChangeIntent);
=======
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        final Button btnNewGame = findViewById(R.id.btnNewGame);








        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, ___________.class);  //Thus _____ bit is the name of the file Liam created
                //startActivity(intent);
>>>>>>> 23336e5fd03ea0a3b97ff927260dd1787a17e055
            }
        });
    }
}
