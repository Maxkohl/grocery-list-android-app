package com.example.grocerylistapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final int TEXT_REQUEST = 1;


    TextView startingPrompt;
    public ArrayList<String> mItemNames = new ArrayList<>();

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startingPrompt = findViewById(R.id.start_prompt);

        initRecyclerView();


    }

    public void launchAddItemsActivity(View view) {
        Intent intent = new Intent(this, AddItemsActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.item_list);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(mItemNames, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(AddItemsActivity.EXTRA_REPLY);
                mItemNames.add(reply);
                initRecyclerView();
            }
        }

        if (mItemNames.size() > 0) {
            startingPrompt.setText(R.string.your_list);
        }
    }
}