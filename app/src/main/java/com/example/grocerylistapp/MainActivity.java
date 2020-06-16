package com.example.grocerylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void launchAddItemsActivity(View view) {
        Intent intent = new Intent(this, AddItemsActivity.class);

        startActivityForResult(intent, TEXT_REQUEST);

    }
}