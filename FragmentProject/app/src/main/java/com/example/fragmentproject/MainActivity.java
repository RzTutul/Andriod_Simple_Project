package com.example.fragmentproject;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] name={"Tutul","Shuvo","Shahrukh","Mamun"};

        listView = findViewById(R.id.listviewId);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;

        if (position == 0)
        {
            fragment = new TutulFragment();

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();

        }
        else if (position == 1)
        {
            fragment = new ShuvoFragment();

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();

        }

        else if (position == 3)
        {
            fragment = new MamunFragment();

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();

        }


    }
}
