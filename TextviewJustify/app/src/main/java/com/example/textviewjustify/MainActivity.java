package com.example.textviewjustify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class MainActivity extends AppCompatActivity {


    JustifyTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
