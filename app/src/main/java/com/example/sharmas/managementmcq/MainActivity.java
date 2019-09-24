package com.example.sharmas.managementmcq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity{

    String classes[] = {"Introduction to Management", "Management Process", "Organisational Management",
            "Industrial Safety and Legislative", "Finance Management",
            "Material Management", "Quality Management"};
    ListView lv;
    Button btnWhatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWhatsapp = (Button) findViewById(R.id.bWhatsapp);
        lv = (ListView) findViewById(R.id.idListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int position = i;
                if(position==0){
                    Intent intent = new Intent(MainActivity.this, Chapter1.class);
                    startActivity(intent);
                }else if (position==1){
                    Intent intent = new Intent(MainActivity.this, Chapter2.class);
                    startActivity(intent);
                }else if (position==2){
                    Intent intent = new Intent(MainActivity.this, Chapter3.class);
                    startActivity(intent);
                }
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itemAbout:
                Intent intentAbout = new Intent(MainActivity.this, About.class);
                startActivity(intentAbout);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
