package com.example.anrdoid.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView languageTextView = (TextView) findViewById(R.id.language);
        //set a clicklistener on that view
        languageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent languageIntent = new Intent(MainActivity.this, LanguagesActivity.class);
                startActivity(languageIntent);
            }
        });

        TextView programmingTextView = (TextView) findViewById(R.id.programming);
        //set a clicklistener on that view
        programmingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent programmingIntent = new Intent(MainActivity.this, ProgrammingActivity.class);
                startActivity(programmingIntent);
            }
        });

        TextView financeTextView = (TextView) findViewById(R.id.finance);
        //set a clicklistener on that view
        financeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent financeIntent = new Intent(MainActivity.this, FinanceActivity.class);
                startActivity(financeIntent);
            }
        });

        TextView historyTextView = (TextView) findViewById(R.id.history);
        //set a clicklistener on that view
        historyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
            }
        });

        TextView scienceTextView = (TextView) findViewById(R.id.science);
        //set a clicklistener on that view
        scienceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scienceIntent = new Intent(MainActivity.this, SciencesActivity.class);
                startActivity(scienceIntent);
            }
        });

        TextView spaceTextView = (TextView) findViewById(R.id.space);
        //set a clicklistener on that view
        spaceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spaceIntent = new Intent(MainActivity.this, SpaceActivity.class);
                startActivity(spaceIntent);
            }
        });

        TextView sportTextView = (TextView) findViewById(R.id.sport);
        //set a clicklistener on that view
        sportTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sportIntent = new Intent(MainActivity.this, SportActivity.class);
                startActivity(sportIntent);
            }
        });
        TextView policyTextView = (TextView) findViewById(R.id.policy);
        //set a clicklistener on that view
        policyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent policyIntent = new Intent(MainActivity.this, PolicyActivity.class);
                startActivity(policyIntent);
            }
        });


    }

}
