package com.example.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.image1)
        {
            Toast.makeText(MainActivity.this,"Rz Tutul at presentaion",Toast.LENGTH_SHORT).show();

        }

        if(v.getId()==R.id.image2)
        {
            Toast.makeText(MainActivity.this,"Rz Tutul at Lift",Toast.LENGTH_SHORT).show();

        }

    }
}
