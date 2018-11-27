package com.example.anrdoid.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by SandeepSinha on 25/11/18.
 */

public class SpaceActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);


        listView = findViewById(R.id.listview);

        final ArrayList<Podcast> podcastList = new ArrayList<>();

        // add demo auto data faster by loop
        for (int i = 10; i > 0; i--) {

            podcastList.add(new Podcast("Space Episode " + i, "21-1-2018", R.drawable.icon_podcast));
        }
        listView.setAdapter(new PodcastAdpater(this, podcastList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpaceActivity.this, podcastList.get(position).getPodcastName(), Toast.LENGTH_LONG).show();
                Intent languageIntent = new Intent(SpaceActivity.this, PlayPodcastActivity.class);
                languageIntent.putExtra("PodcastName", podcastList.get(position).getPodcastName());
                languageIntent.putExtra("PodcastDate", podcastList.get(position).getPodcastDate());
                startActivity(languageIntent);
            }
        });

        Button homeButton = (Button) findViewById(R.id.home_button_view);
        //set a clicklistener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent languageIntent = new Intent(SpaceActivity.this, MainActivity.class);
                startActivity(languageIntent);
            }
        });
    }
}