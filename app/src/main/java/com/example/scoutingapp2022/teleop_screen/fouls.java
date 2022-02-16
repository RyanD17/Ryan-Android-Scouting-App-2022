package com.example.scoutingapp2022.teleop_screen;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.scoutingapp2022.R;

import java.util.Stack;

public class fouls extends teleop{
    Button foulBtn;
    TextView foulCount;
    Button techFoulBtn;
    TextView techFoulTxt;
    int foul_count_num;
    int techFoul_count_num;

    public fouls (){//creating a constructor for the foul class
        foulBtn = findViewById(R.id.foul_Btn);
        techFoulBtn = findViewById(R.id.tech_foul_Btn);
        foulCount = findViewById(R.id.foul_count);
        techFoulTxt = findViewById(R.id.tech_foul_count);
    }
    public  void foul_isPressed(){
        foulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                foulCount.setText(Integer.toString(foul_count_num++));//Increases the count of foul
                // button by 1
                undoButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        Stack<Integer> stk = new Stack<>();
                        stk.push(foul_count_num);
                        while (stk.firstElement() == foul_count_num) {
                            foulCount.setText(Integer.toString(foul_count_num -= 1));
                        }
                        stk.pop();
                    }
                });
            }
        });
    }
    public void techFoul_isPressed (){
        techFoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                techFoulTxt.setText(Integer.toString(techFoul_count_num ++));
                undoButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        Stack<Integer> stk = new Stack<>();
                        stk.push(techFoul_count_num);
                        while (stk.firstElement() == techFoul_count_num) {
                            techFoulTxt.setText(Integer.toString(techFoul_count_num -= 1));
                        }
                        stk.pop();
                    }
                });
            }
        });
    }
}
