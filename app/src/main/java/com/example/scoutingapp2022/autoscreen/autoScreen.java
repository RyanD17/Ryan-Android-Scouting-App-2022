package com.example.scoutingapp2022.autoscreen;

import android.app.Application;
import android.content.Intent;
import android.view.MotionEvent;
import android.widget.ImageButton;

import com.example.scoutingapp2022.teleop_screen.teleop;

public class autoScreen extends Application {

    public ImageButton undoButton;
    float x1, x2, y1, y2;

    public boolean onTouchEvent(MotionEvent touchEvent){ //If the screen is touched by
        //a user then this code will run
        switch (touchEvent.getAction()){//creating a switch statement to get the action
            //of the user
            case MotionEvent.ACTION_DOWN: // if
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();//
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if (x1 < x2){ // if x1 is less than x2 , then  the teleop screen will open
                    Intent intent = new Intent(autoScreen.this, teleop.class);
                    startActivity(intent);
                }
                break;
        }
        return false;
    }
    public void openCommentActivity() {
        Intent intent = new Intent(this, com.example.scoutingapp2022.CommentActivity.class);
        startActivity(intent);
    }
}