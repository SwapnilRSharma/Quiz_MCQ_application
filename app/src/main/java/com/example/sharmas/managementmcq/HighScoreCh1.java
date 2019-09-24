package com.example.sharmas.managementmcq;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighScoreCh1 extends AppCompatActivity{


    Button Try, Quit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter1_hs);
        Try = (Button) findViewById(R.id.bTry);
        Quit = (Button) findViewById(R.id.bQuit);
        TextView txtScore = (TextView) findViewById(R.id.textScore);
        //TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        TextView txtAttempt = (TextView) findViewById(R.id.textAttempt);
        // receive the score from last activity by Intent
        Intent hsIntent = getIntent();
        int score = hsIntent.getIntExtra("score", 0);
        int attempted = hsIntent.getIntExtra("attempted", 0);
        // display current score
        txtScore.setText("Your score: " + score);

        txtAttempt.setText("Attempted: " + attempted);
        /*
        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
        */
    }

    public void onQuit(View view){
        Intent intentQuit = new Intent(HighScoreCh1.this, startingPoint.class);
        startActivity(intentQuit);
    }
    public void onClick(View view) {
        Intent intent = new Intent(HighScoreCh1.this,Chapter1.class);
        startActivity(intent);
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

