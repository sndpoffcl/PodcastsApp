package com.example.anrdoid.podcastapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

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
    }
}