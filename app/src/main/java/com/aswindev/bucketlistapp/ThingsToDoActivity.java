package com.aswindev.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView list = findViewById(R.id.recycler_view_thingstodo);

        BucketListItem[] bucketListItems = {
                new BucketListItem("Skydiving", "Experience the thrill of free-falling from thousands of feet in the air. Ideal for adrenaline junkies", R.drawable.skydiving),
                new BucketListItem("Learn a New Language", "Set a goal to become fluent in a new language, enhancing your communication skills and cultural understanding", R.drawable.language),
                new BucketListItem("Run a Marathon", "Train for and complete a full marathon, a testament to physical endurance and mental perseverance", R.drawable.marathon),
                new BucketListItem("Scuba Diving in the Great Barrier Reef", "Explore the underwater world and witness the vibrant marine life of this iconic location", R.drawable.scubadiving),
                new BucketListItem("Write a Book", "Channel your creativity and experiences into writing a book, whether it’s a novel, memoir, or a collection of personal essays", R.drawable.writing)
        };
        BucketListAdapter adapter = new BucketListAdapter(bucketListItems);
        list.setAdapter(adapter);
    }
}