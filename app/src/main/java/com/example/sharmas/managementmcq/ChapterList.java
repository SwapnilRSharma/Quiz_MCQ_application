package com.example.sharmas.managementmcq;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

/**
 * Created by Sharma's on 29-Dec-17.
 */

public class ChapterList extends AppCompatActivity {
    GridLayout mainGrid;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_list);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(ChapterList.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(ChapterList.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0) {
                        Intent intent = new Intent(ChapterList.this, Chapter1.class);
                        startActivity(intent);
                    }else if (finalI==1){

                        Intent intent = new Intent(ChapterList.this, Chapter2.class);
                        startActivity(intent);
                    }else if (finalI==2){

                        Intent intent = new Intent(ChapterList.this, Chapter3.class);
                        startActivity(intent);
                    }else if (finalI==3){

                        Intent intent = new Intent(ChapterList.this, Chapter4.class);
                        startActivity(intent);
                    }else if (finalI==4){

                        Intent intent = new Intent(ChapterList.this, Chapter5.class);
                        startActivity(intent);
                    }else if (finalI==5){

                        Intent intent = new Intent(ChapterList.this, Chapter6.class);
                        startActivity(intent);
                    }else if (finalI==6){

                        Intent intent = new Intent(ChapterList.this, Chapter7.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}



