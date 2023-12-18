package com.aswindev.bucketlistapp;

import androidx.annotation.DrawableRes;

public class BucketListItem {
    String name, description;
    int image;
    float rating;

    public BucketListItem(String name, String description, @DrawableRes int image, float rating) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
