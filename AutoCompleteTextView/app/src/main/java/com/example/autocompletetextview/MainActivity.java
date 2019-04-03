package com.example.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autocompleteId);
        String [] CountryName = getResources().getStringArray(R.array.countryName);

        ArrayAdapter adapter = new ArrayAdapter (MainActivity.this,android.R.layout.simple_list_item_1,CountryName);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name;
                name = autoCompleteTextView.getText().toString();
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
