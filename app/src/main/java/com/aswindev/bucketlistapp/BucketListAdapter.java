package com.aswindev.bucketlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {
    private BucketListItem[] bucketListItems;

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
        holder.bind(bucketListItems[position]);
    }


    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        private TextView itemTitle, itemDescription;
        private ImageView itemImage;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_view_item_icon);
            itemDescription = itemView.findViewById(R.id.text_view_item_description);
            itemTitle = itemView.findViewById(R.id.text_view_item_title);
        }

        public void bind(BucketListItem bucketListItem) {
            itemImage.setImageResource(bucketListItem.image);
            itemTitle.setText(bucketListItem.name);
            itemDescription.setText(bucketListItem.description);
        }
    }
}
