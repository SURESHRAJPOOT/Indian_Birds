package com.example.indian_birds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database db = new database(getApplicationContext(),"birds_db",null,1);
        //when the main activity call,then this all info will send to the database.java class
    }
}