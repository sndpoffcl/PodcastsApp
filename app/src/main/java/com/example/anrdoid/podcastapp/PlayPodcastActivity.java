package com.example.anrdoid.podcastapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Labtop on 21/01/18.
 */

public class PlayPodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playpodcast);

        TextView podcastNametextView = (TextView) findViewById(R.id.podcast_name_textView);
        TextView podcastDatetextView = (TextView) findViewById(R.id.podcast_Date_textView);

        Intent intent = getIntent();

        String PName = intent.getStringExtra("PodcastName");
        String PDate = intent.getStringExtra("PodcastDate");
        String modifypodcast_name_textView, modifypodcast_Date_textView;

        modifypodcast_name_textView = podcastNametextView.getText().toString();
        modifypodcast_Date_textView = podcastDatetextView.getText().toString();

        modifypodcast_name_textView = modifypodcast_name_textView + " " + PName;
        podcastNametextView.setText(modifypodcast_name_textView);

        modifypodcast_Date_textView = modifypodcast_Date_textView + " " + PDate;
        podcastDatetextView.setText(modifypodcast_Date_textView);

        Button homeButton = (Button) findViewById(R.id.home_button_view);
        //set a clicklistener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent languageIntent = new Intent(PlayPodcastActivity.this, MainActivity.class);
                startActivity(languageIntent);
            }
        });

        Button backButton = (Button) findViewById(R.id.back_button_view);
        //set a clicklistener on that view
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //to return back to a previous activity
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

}