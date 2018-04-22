package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // display scores
    public void displayScorePlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScorePlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }



    // update player A score
    public void roll_5_A(View v) {
        scorePlayerA += 50;
        displayScorePlayerA(scorePlayerA);
    }

    public void roll_1_A(View v) {
        scorePlayerA += 100;
        displayScorePlayerA(scorePlayerA);
    }

    public void three_1s_A(View v) {
        scorePlayerA += 1000;
        displayScorePlayerA(scorePlayerA);
    }

    public void three_2s_A(View v) {
        scorePlayerA += 200;
        displayScorePlayerA(scorePlayerA);
    }

    public void three_3s_A(View v) {
        scorePlayerA += 300;
        displayScorePlayerA(scorePlayerA);
    }

    public void three_4s_A(View v) {
        scorePlayerA += 400;
        displayScorePlayerA(scorePlayerA);
    }

    public void three_5s_A(View v) {
        scorePlayerA += 500;
        displayScorePlayerA(scorePlayerA);
    }

    public void three_6s_A(View v) {
        scorePlayerA += 600;
        displayScorePlayerA(scorePlayerA);
    }

    public void roll_123456_A(View v) {
        scorePlayerA += 3000;
        displayScorePlayerA(scorePlayerA);
    }



    // update player B score
    public void roll_5_B(View v) {
        scorePlayerB += 50;
        displayScorePlayerB(scorePlayerB);
    }

    public void roll_1_B(View v) {
        scorePlayerB += 100;
        displayScorePlayerB(scorePlayerB);
    }

    public void three_1s_B(View v) {
        scorePlayerB += 1000;
        displayScorePlayerB(scorePlayerB);
    }

    public void three_2s_B(View v) {
        scorePlayerB += 200;
        displayScorePlayerB(scorePlayerB);
    }

    public void three_3s_B(View v) {
        scorePlayerB += 300;
        displayScorePlayerB(scorePlayerB);
    }

    public void three_4s_B(View v) {
        scorePlayerB += 400;
        displayScorePlayerB(scorePlayerB);
    }

    public void three_5s_B(View v) {
        scorePlayerB += 500;
        displayScorePlayerB(scorePlayerB);
    }

    public void three_6s_B(View v) {
        scorePlayerB += 600;
        displayScorePlayerB(scorePlayerB);
    }

    public void roll_123456_B(View v) {
        scorePlayerB += 3000;
        displayScorePlayerB(scorePlayerB);
    }


    // reset the scores
    public void reset_button(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayScorePlayerA(scorePlayerA);
        displayScorePlayerB(scorePlayerB);
    }

}
