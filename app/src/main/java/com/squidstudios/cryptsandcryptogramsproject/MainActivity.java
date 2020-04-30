package com.squidstudios.cryptsandcryptogramsproject;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.ActivityInfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final Button btnNewGame = (Button) findViewById(R.id.btnNewGame);
        final Button btnLoad = (Button) findViewById(R.id.btnLoad);
        final Button btnHelp = (Button) findViewById(R.id.btnHelp);
        final Button btnSettings = (Button) findViewById(R.id.btnSettings);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
              //ADD SOMETHING
            }
        });

        btnLoad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, LoadScreen.class);
                startActivity(activityChangeIntent);
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(MainActivity.this, Help.class);
                startActivity(activityChangeIntent);
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(activityChangeIntent);
            }
        });

    }

}
