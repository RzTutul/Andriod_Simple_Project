package com.example.imageview;

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

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.img1)
        {
            Toast.makeText(MainActivity.this,"Presentaion 2.03.18",Toast.LENGTH_SHORT).show();

        }

        if(v.getId()==R.id.img2)
        {
            Toast.makeText(MainActivity.this,"Lift 5.03.18",Toast.LENGTH_SHORT).show();

        }

    }
}
