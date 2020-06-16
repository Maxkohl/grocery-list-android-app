package com.example.grocerylistapp;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter {

    private static final String TAG = "RecyclerViewAdapter";

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView  itemName;
        RelativeLayout;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
        }
    }
}
