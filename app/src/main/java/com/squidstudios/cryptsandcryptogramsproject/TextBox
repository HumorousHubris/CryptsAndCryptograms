package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TextBox extends AppCompatActivity {
    TextView main_box_text;
    ImageView main_box_image;
    ImageView main_box_arrow;
    String[] filler_text= {"",
            "Again? Okay.",
            "Why do you keep clicking this? Are you nervous or something? You know, nothing new is going to happen so you might as well just stop.",
            "Didn't your mother ever teach you that it's rude to poke people? You could be outside enjoying some fresh air.",
            "The corona virus is going around, so I hope you washed your hands before smudging up the screen like this.",
            "If you keep poking this box with your grubby, unwashed fingers, I might just get sick.",
            "The definition of insanity is doing the same thing over and over again, but expecting different results. There are no new features at this time.",
            "I'm going to have to start repeating myself. Is that what you want? For me to sound like a lunatic? Do us both a favor and stop poking the box!",
            "...",
            "Really?"};
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textbox_activity);
        main_box_text = (TextView) findViewById(R.id.main_box_text);
        main_box_image = (ImageView) findViewById(R.id.main_box_image);
        main_box_arrow = (ImageView) findViewById(R.id.main_box_arrow);

        main_box_image.setOnClickListener(new View.OnClickListener(){
            // Edit this for what you would like to happen when main text box is clicked
            //***********************************************************************
            int clicks = 1;
            int filler_text_index = 0;
            public void onClick(View v){
                if (filler_text_index == filler_text.length)
                    filler_text_index = 0;
                main_box_text.setText("The textbox has been clicked " + clicks + " times.\n" +
                                      filler_text[filler_text_index]);
                clicks++;
                filler_text_index++;

                /*This is a temporary proof of concept for the blinking arrow in main box image.
                 *Ideally this will be timed every .5 seconds when the timer is figured out*/
                if (clicks%2==0)
                    main_box_arrow.setVisibility(View.INVISIBLE);
                else
                    main_box_arrow.setVisibility(View.VISIBLE);
            }
            //***********************************************************************
        });
// This will crash the app
//        Timer arrow_blink_rate = new Timer();
//        arrow_blink_rate.scheduleAtFixedRate(new TimerTask() {
//            public void run() {
//             if (main_box_arrow.getVisibility()==View.VISIBLE)
//                 main_box_arrow.setVisibility(View.INVISIBLE);
//             else
//                 main_box_arrow.setVisibility(View.VISIBLE);
//            }
//        }, 1000,1000);
    }
}
