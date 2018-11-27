package com.example.anrdoid.podcastapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by SandeepSinha on 25/11/18.
 */


public class PodcastAdpater extends ArrayAdapter<Podcast> {

    public PodcastAdpater(Activity context, ArrayList<Podcast> podcasts) {
        super(context, 0, podcasts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Podcast currentPodcast = getItem(position);

        TextView podcastNameTextView = (TextView) listItemView.findViewById(R.id.podcast_name);
        podcastNameTextView.setText(currentPodcast.getPodcastName());

        TextView podcastDateTextView = (TextView) listItemView.findViewById(R.id.podcast_date);
        podcastDateTextView.setText(currentPodcast.getPodcastDate());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentPodcast.getPodcastImageId());

        return listItemView;
    }

}

