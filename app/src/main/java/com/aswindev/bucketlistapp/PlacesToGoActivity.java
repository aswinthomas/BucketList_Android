package com.aswindev.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        RecyclerView list = findViewById(R.id.recycler_view_placestogo);

        BucketListItem[] bucketListItems = {
                new BucketListItem("Santorini, Greece", "Visit this picturesque island known for its stunning sunsets, white-washed buildings, and crystal-clear waters", R.drawable.santorini,4.8f),
                new BucketListItem("Aurora Borealis, Iceland", "Witness the Northern Lights, one of nature’s most spectacular displays, in the Icelandic skies", R.drawable.auroraborealis, 2.8f),
                new BucketListItem("Machu Picchu, Peru", "Explore the ancient Incan city set high in the Andes Mountains, offering breathtaking views and a rich history", R.drawable.machupicchu, 3.0f),
                new BucketListItem("Tokyo, Japan", "Immerse yourself in the vibrant culture, futuristic technology, and diverse cuisine of Japan's bustling capital", R.drawable.tokyo, 1.2f),
                new BucketListItem("Galápagos Islands, Ecuador", "Encounter unique wildlife and pristine nature on these islands, pivotal in Darwin's evolution theory", R.drawable.gal_pagosislands, 3.0f)
        };
        BucketListAdapter adapter = new BucketListAdapter(bucketListItems);
        list.setAdapter(adapter);
    }
}