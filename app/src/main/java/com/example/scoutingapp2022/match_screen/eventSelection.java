package com.example.scoutingapp2022.match_screen;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scoutingapp2022.R;
/*
import ca.warp7.android.scouting.tba.EventSimple;
import com.example.scoutingapp2022.tba.EventSimple;
import ca.warp7.android.scouting.tba.createCachedTBAInstance;
import ca.warp7.android.scouting.tba.getEventMatchesSimple;
import ca.warp7.android.scouting.tba.getTeamEventsByYearSimple;
import ca.warp7.android.scouting.ui.EventListAdapter;
*/
public class eventSelection extends AppCompatActivity {


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_selection);

        EditText teamSearch = findViewById(R.id.team_search);
        EditText yearEdit = findViewById(R.id.year);

        ListView eventList = findViewById(R.id.event_list);


    }
}