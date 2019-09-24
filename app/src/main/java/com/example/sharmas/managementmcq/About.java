package com.example.sharmas.managementmcq;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    Button ContactUs, RateUs, Whatsapp;
    String emailaddress[] = {"swapnilrsharma2806@gmail.com"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ContactUs = (Button) findViewById(R.id.bContactUs);
        RateUs = (Button) findViewById(R.id.bRateUs);
        Whatsapp = (Button) findViewById(R.id.bWhatsapp);


    }


    public void onWA(View view){
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "A Must-have app if you are a KnowledgeGeek. Let's test and Inprove your GK. Management MCQ is the best and the only app to learn and improve Magament subject. Link to download will be available soon.Thank You.";
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        //sharingIntent.setPackage("com.whatsapp");
        startActivity(Intent.createChooser(sharingIntent, "Share Using"));
    }

    public void onContactUs(View view){

        final Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"swapnilrsharma2806@gmail.com"});
        //emailIntent.putExtra(Intent.EXTRA_EMAIL, emailaddress);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Management MCQ");
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));
        //startActivity(emailIntent);
    }
}
