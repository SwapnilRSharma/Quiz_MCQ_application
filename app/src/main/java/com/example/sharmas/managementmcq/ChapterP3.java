package com.example.sharmas.managementmcq;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ChapterP3 extends AppCompatActivity {

    private QuestionLibrary3 mQuestionLibrary = new QuestionLibrary3();

    private TextView mScoreView;
    private TextView mQuesetionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private String mAnswer;
//    public int mScore = 0;
    private int mQuestionNumber = 0;
    private int counter = 0;
    private TextView QuestionCountText;
    private TextView QuestionCount;
    private int flag = 0;
    private int counterAttempt = 0;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_activity);
        QuestionCountText = (TextView) findViewById(R.id.tvQCText);
        QuestionCount = (TextView) findViewById(R.id.tvQuestionCount);
  //      mScoreView = (TextView) findViewById(R.id.score);
        mQuesetionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);

        updateQuestion();
    //    updateScore(0);
        updateQuestionCount(counter);

        //Start of Button Listener 1

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag == 1) {

                } else {
                    if (mButtonChoice1.getText() == mAnswer) {
      //                  mScore++;
                        //updateScore(mScore);

                        flag = 1;
                        counterAttempt++;
                    } else {

                        flag = 1;
                        counterAttempt++;
                    }
                }

            }
        });

        //End of Buttton Listener 2

        //Start of Button Listener 3

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag == 1) {

                } else {

                    if (mButtonChoice2.getText() == mAnswer) {
        //                mScore++;
                        //updateScore(mScore);

                        flag = 1;
                        counterAttempt++;
                    } else {

                        flag = 1;
                        counterAttempt++;
                    }
                }

            }
        });

        //End of Buttton Listener 2

        //Start of Button Listener 3

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag == 1) {

                } else {

                    if (mButtonChoice3.getText() == mAnswer) {
          //              mScore++;
                        //updateScore(mScore);
                        flag = 1;
                        counterAttempt++;
                    } else {
                        flag = 1;
                        counterAttempt++;
                    }
                }

            }
        });

        //End of Buttton Listener 3

        //Start of Button Listener 4

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag == 1) {

                } else {

                    if (mButtonChoice4.getText() == mAnswer) {
            //            mScore++;
                        //updateScore(mScore);
                        flag = 1;
                        counterAttempt++;
                    } else {
                        flag = 1;
                        counterAttempt++;
                    }
                }

            }
        });

        //End of Buttton Listener 4

    }

    private void updateQuestion() {


        if (mQuestionNumber < mQuestionLibrary.getLength()) {
            mQuesetionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            if (mButtonChoice1.getText()==mAnswer){
                mButtonChoice1.setBackgroundColor(Color.GREEN);
            }else if (mButtonChoice2.getText()==mAnswer){
                mButtonChoice2.setBackgroundColor(Color.GREEN);
            }else if (mButtonChoice3.getText()==mAnswer){
                mButtonChoice3.setBackgroundColor(Color.GREEN);
            }else if (mButtonChoice4.getText()==mAnswer){
                mButtonChoice4.setBackgroundColor(Color.GREEN);
            }
            //mQuestionNumber++;
            counter++;

        } else {
            Toast.makeText(ChapterP3.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent hsIntent = new Intent(ChapterP3.this, HighScoreCh1.class);
            //hsIntent.putExtra("score", mScore);
            //hsIntent.putExtra("attempted", counterAttempt);
            startActivity(hsIntent);
        }
    }

    private void updateScore(int mScore) {

        //mScoreView.setText("" + mScore);
    }

    private void updateQuestionCount(int counter) {
        QuestionCount.setText("" + counter);
    }

    public void onBtnQuit(View view) {
        Intent hsIntent = new Intent(ChapterP3.this, startingPoint.class);
        //hsIntent.putExtra("score", mScore);
        //hsIntent.putExtra("attempted", counter - 1);
        startActivity(hsIntent);
    }

    public void onBtnNext(View view) {
        mButtonChoice1.setBackgroundColor(Color.rgb(50, 50, 50));
        mButtonChoice2.setBackgroundColor(Color.rgb(50, 50, 50));
        mButtonChoice3.setBackgroundColor(Color.rgb(50, 50, 50));
        mButtonChoice4.setBackgroundColor(Color.rgb(50, 50, 50));

        flag = 0;
        mQuestionNumber++;
        updateQuestion();
        //updateScore(mScore);
        updateQuestionCount(counter);
    }

    public void onBtnPrevious(View view) {


        if (counter == 1) {
            Toast.makeText(ChapterP3.this, "It is 1st Question.", Toast.LENGTH_SHORT).show();

        } else {
            mButtonChoice1.setBackgroundColor(Color.rgb(50, 50, 50));
            mButtonChoice2.setBackgroundColor(Color.rgb(50, 50, 50));
            mButtonChoice3.setBackgroundColor(Color.rgb(50, 50, 50));
            mButtonChoice4.setBackgroundColor(Color.rgb(50, 50, 50));

            mQuestionNumber--;
            mQuesetionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            if (mButtonChoice1.getText()==mAnswer){
                mButtonChoice1.setBackgroundColor(Color.GREEN);
            }else if (mButtonChoice2.getText()==mAnswer){
                mButtonChoice2.setBackgroundColor(Color.GREEN);
            }else if (mButtonChoice3.getText()==mAnswer){
                mButtonChoice3.setBackgroundColor(Color.GREEN);
            }else if (mButtonChoice4.getText()==mAnswer){
                mButtonChoice4.setBackgroundColor(Color.GREEN);
            }
            counter--;
            updateQuestionCount(counter);
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}


