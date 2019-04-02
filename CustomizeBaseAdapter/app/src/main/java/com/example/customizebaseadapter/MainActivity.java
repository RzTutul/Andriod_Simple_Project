package com.example.customizebaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    ListView listView;
    String[] CountryName;
    int[] flag = {R.drawable.bangla, R.drawable.india, R.drawable.pakistan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CountryName = getResources().getStringArray(R.array.countryName);
        listView = findViewById(R.id.listItem);


        //Make user Define CustomeAdapter;

        CustomeAdapter adapter = new CustomeAdapter(MainActivity.this, CountryName, flag);

        listView.setAdapter(adapter);


    }
}
