package com.example.scoutingapp2022.endgame;

import android.graphics.Color;
import android.view.View;
import android.widget.ToggleButton;

import com.example.scoutingapp2022.R;
import com.example.scoutingapp2022.autoscreen.autoScreen;


public class endgame extends MainActivity {
    //creating a new Main Activity Object
    public autoScreen autoScreenObj = new autoScreen();

    //initializing toggle buttons
    public ToggleButton noneBtn;
    public ToggleButton attempt;
    public ToggleButton success;
    public ToggleButton lowRung;
    public ToggleButton midRung;
    public ToggleButton highRung;
    public ToggleButton traversalRung;

    public endgame (float x1, float x2, float y1, float y2) {
        noneBtn = findView
        attempt = findViewById(R.id.climb_attempt);
        success = findViewById(R.id.climb_success);

        lowRung = findViewById(R.id.climb_mid);
        midRung = findViewById(R.id.climb_high);
        highRung = findViewById(R.id.climb_low);
        traversalRung = findViewById(R.id.climb_traversal);
    }

    public void noneBtn_isPressed () {
        noneBtn.setOnClickListener(v -> {
            noneBtn.setBackgroundColor(Color.GREEN);
            attempt.setBackgroundColor(Color.RED);
            success.setBackgroundColor(Color.RED);
        });
        noneBtn.setBackgroundColor(Color.RED);
    }

    public void attemptBtn_isPressed () {
        attempt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                noneBtn.setBackgroundColor(Color.RED);
                attempt.setBackgroundColor(Color.GREEN);
                success.setBackgroundColor(Color.RED);
            }
        });
        attempt.setBackgroundColor(Color.RED);
    }

    public void successBtn_isPressed () {
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                success.setBackgroundColor(Color.GREEN);
                attempt.setBackgroundColor(Color.RED);
                noneBtn.setBackgroundColor(Color.RED);
            }
        });
        success.setBackgroundColor(Color.RED);
    }
/*
    public void upBtn_isPressed () {

    }

    public void downBtn_isPressed () {
    }

    public void middleBtn_isPressed () {
    }

    public void balancedBtn_IsPressed () {
    }

 */
}
