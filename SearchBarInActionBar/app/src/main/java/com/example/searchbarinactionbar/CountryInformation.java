package com.example.searchbarinactionbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CountryInformation extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_information);

        textView = findViewById(R.id.infotext);

        Bundle bundle = getIntent().getExtras();


        if (bundle !=null)
        {
            String text = bundle.getString("name");

            if (text.equals("Afganstan"))
            {
                textView.setText(R.string.afganstanText);
            }




        }
    }
}
