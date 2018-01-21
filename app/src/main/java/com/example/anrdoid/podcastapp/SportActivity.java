package com.example.anrdoid.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Labtop on 20/01/18.
 */

public class SportActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);


        listView = findViewById(R.id.listview);

        final ArrayList<Podcast> PodcasttList = new ArrayList<>();

        // add demo auto data faster by loop
        for (int i = 10; i > 0; i--) {

            PodcasttList.add(new Podcast("Sport Episode " + i, "21-1-2018", R.drawable.icon_podcast));
        }
        listView.setAdapter(new PodcastAdpater(this, PodcasttList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SportActivity.this, PodcasttList.get(position).getPodcastName(), Toast.LENGTH_LONG).show();
                Intent languageIntent = new Intent(SportActivity.this, PlayPodcastActivity.class);
                languageIntent.putExtra("PodcastName", PodcasttList.get(position).getPodcastName());
                languageIntent.putExtra("PodcastDate", PodcasttList.get(position).getPodcastDate());
                startActivity(languageIntent);
            }
        });
    }
}