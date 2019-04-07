package com.example.capconnect20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        Intent i = new Intent(this, PersonInfo.class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(this, AboutUs.class);
        startActivity(i);
    }
}
