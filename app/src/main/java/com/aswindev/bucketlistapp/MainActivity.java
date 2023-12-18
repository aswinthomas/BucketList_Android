package com.aswindev.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView thingsToDoCard, placesToGoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thingsToDoCard = findViewById(R.id.card_view_thingstodo);
        placesToGoCard = findViewById(R.id.card_view_placestogo);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsToDoActivityIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsToDoActivityIntent);
            }
        });

        placesToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesToGoActivityIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(placesToGoActivityIntent);
            }
        });
    }
}