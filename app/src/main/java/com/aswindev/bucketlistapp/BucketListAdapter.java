package com.aswindev.bucketlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {
    private final BucketListItem[] bucketListItems;

    public BucketListAdapter(BucketListItem[] bucketListItems) {
        this.bucketListItems = bucketListItems;
    }

    @Override
    public int getItemCount() {
        return bucketListItems.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list, parent, false);
        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListViewHolder holder, int position) {
        holder.bind(bucketListItems[position], position);
    }


    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemTitle;
        private final TextView itemDescription;
        private final ImageView itemImage;
        private final RatingBar itemRating;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_view_item_icon);
            itemDescription = itemView.findViewById(R.id.text_view_item_description);
            itemTitle = itemView.findViewById(R.id.text_view_item_title);
            itemRating = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(BucketListItem bucketListItem, int position) {
            itemImage.setImageResource(bucketListItem.image);
            String titleStr = position + 1 + ". " + bucketListItem.name;
            itemTitle.setText(titleStr);
            itemDescription.setText(bucketListItem.description);
            itemRating.setRating(bucketListItem.rating);
        }
    }
}
