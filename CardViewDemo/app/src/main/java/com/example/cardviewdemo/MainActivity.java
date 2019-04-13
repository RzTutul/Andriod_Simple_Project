package com.example.cardviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    CardView schoolView,hospitalView,traveView,bankView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolView= findViewById(R.id.schoolId);
        hospitalView = findViewById(R.id.HospitalId);
        traveView = findViewById(R.id.travelId);
        bankView = findViewById(R.id.bankId);

        schoolView.setOnClickListener(this);
        hospitalView.setOnClickListener(this);
        traveView.setOnClickListener(this);
        bankView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.schoolId);
        {
            Intent intent = new Intent(MainActivity.this,Allinformation.class);
            startActivity(intent);

        }
    }
}
