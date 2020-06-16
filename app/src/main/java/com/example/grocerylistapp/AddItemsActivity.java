package com.example.grocerylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AddItemsActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.grocerylistapp.extra.REPLY";
    private static final String LOG_TAG = AddItemsActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);
    }

    public void returnItem(View v){
        Button b = (Button)v;
        String itemName = b.getText().toString();

        Intent replyIntent = new Intent();

        replyIntent.putExtra(EXTRA_REPLY, itemName);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, itemName);
        finish();



    }
}