package com.example.capconnect20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);
    }

    public void submitinfo(View view) {
        /* what to do when user submits information? */

        //post request,

        Intent i = new Intent(this, Interests.class);
        startActivity(i);
    }
}
