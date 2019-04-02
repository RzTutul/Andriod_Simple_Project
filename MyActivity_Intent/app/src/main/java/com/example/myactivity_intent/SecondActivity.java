package com.example.myactivity_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t = findViewById(R.id.level);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
           String text= bundle.getString("key");

           t.setText(text);
        }

    }



}
