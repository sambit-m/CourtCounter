package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScore(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void addThreeForA(View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForA(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForA(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForB(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForB(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
}
