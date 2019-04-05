package com.example.framelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


   ImageView imageView1 ,imageView2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.image1)
        {
            Toast.makeText(MainActivity.this,"Tutul1",Toast.LENGTH_SHORT).show();

            imageView1.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);

        }
         if (v.getId()==R.id.image2)
        {
            imageView2.setVisibility(View.GONE);
            imageView1.setVisibility(View.VISIBLE);
        }

    }
}
