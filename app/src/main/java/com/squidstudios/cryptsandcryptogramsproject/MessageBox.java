package com.squidstudios.cryptsandcryptogramsproject;

import android.os.Bundle;
import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MessageBox extends Fragment {
    TextView main_box_text;
    ImageView main_box_image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message_box, container, false);

    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        main_box_text = (TextView) getView().findViewById(R.id.main_box_text);
        main_box_image = (ImageView) getView().findViewById(R.id.main_box_image);

        main_box_image.setVisibility(View.INVISIBLE);
        main_box_text.setVisibility(View.INVISIBLE);
    }

    void display(String message){
        main_box_image.setVisibility(View.VISIBLE);
        main_box_text.setVisibility(View.VISIBLE);
        main_box_text.setText(message);
        main_box_text.post(new Runnable() {
            public void run() {
                //Determines lines per message box and divides the message into parts
                //***********************************************************************
                int max_lines=3; //Number of lines the textbox can display at a time
                int total_lines = main_box_text.getLineCount(); //Total number of lines in message
                //The total number of line blocks needed to display the full message
                final int total_blocks = (total_lines%max_lines!=0) ?
                        (total_lines/max_lines)+1 : total_lines/max_lines;

                //Storing the lines into displayable blocks
                final String[] display_block= new String[total_blocks];
                int start, end;
                for(int i=0;i<total_blocks;i++){
                    start = main_box_text.getLayout().getLineStart(i*max_lines);
                    int edge_of_block=((i+1)*max_lines)-1;
                    //There are an even number of lines to display in this block
                    if(edge_of_block<total_lines)
                        end = main_box_text.getLayout().getLineEnd(edge_of_block);
                        //There are an odd number of lines to display in this block
                    else
                        end = main_box_text.getLayout().getLineEnd(total_lines-1);
                    display_block[i]=""+(String) main_box_text.getText().subSequence(start, end);
                }//end for
                //***********************************************************************/

                //Sets message box invisible after the message has been fully displayed
                //***********************************************************************
                main_box_image.setOnClickListener(new View.OnClickListener(){
                    int clicks = 0;
                    public void onClick(View v){
                        clicks++;
                        if (clicks<total_blocks)
                            main_box_text.setText(display_block[clicks]);
                        else {
                            main_box_image.setVisibility(View.INVISIBLE);
                            main_box_text.setVisibility(View.INVISIBLE);
                        }//end else
                    }//end onClick
                });//end of main_box_image.setOnClickListener
                //***********************************************************************
            }//end run()
        });//end post()
    }//end display()
}//end fragment MessageBox

