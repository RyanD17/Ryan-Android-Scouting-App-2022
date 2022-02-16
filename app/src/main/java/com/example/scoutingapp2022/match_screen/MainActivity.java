package com.example.scoutingapp2022.match_screen;

import android.os.Bundle;
import android.widget.ListView;

import com.example.scoutingapp2022.R;

public class MainActivity extends    {
    ListView matchScheduleView;

    String[] blueAlliance = {"1","1","1","1","1"};
    String[] redAlliance = {"2","2","2","2","2"};
    Integer[] match = {1,2,3,4,5};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MatchSchedule matchSchedule = new MatchSchedule(this, blueAlliance, redAlliance, match);
        matchScheduleView = findViewById(R.id.matchSchedule);
        matchScheduleView.setAdapter(matchSchedule);
    }
}
