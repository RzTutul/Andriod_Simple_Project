package com.example.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class All_Information extends AppCompatActivity {


    TextView textView;
    ImageView imageView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__information);

        textView = findViewById(R.id.txtview);
        imageView = findViewById(R.id.image);

        Bundle b = getIntent().getExtras();

       String s = b.getString("name");

       if (s.equals("bangla"))
       {
           imageView.setImageResource(R.drawable.bangladesh);

           textView.setText(R.string.bangla_text);
       }


       else if (s.equals("india"))
        {
            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.india_text);
        }

        else if (s.equals("pakistan"))
        {
            imageView.setImageResource(R.drawable.pakistan);

            textView.setText(R.string.pakistan);
        }



    }
}
