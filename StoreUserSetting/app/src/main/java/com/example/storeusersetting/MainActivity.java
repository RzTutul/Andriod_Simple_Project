package com.example.storeusersetting;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layoutID);

        if (loadColor()!=getResources().getColor(R.color.colorPrimary))
        {
            layout.setBackgroundColor(loadColor());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.redId)
        {
            layout.setBackgroundColor(getResources().getColor(R.color.red));
            storeColor(getResources().getColor(R.color.red));

        }
          if (item.getItemId()==R.id.blueId)
        {
            layout.setBackgroundColor(getResources().getColor(R.color.blue));
            storeColor(getResources().getColor(R.color.blue));

        }
          if (item.getItemId()==R.id.blackId)
        {
            layout.setBackgroundColor(getResources().getColor(R.color.Dark));
            storeColor(getResources().getColor(R.color.Dark));

        }

        return super.onOptionsItemSelected(item);
    }

    private void storeColor(int color) {

        SharedPreferences sharedPreferences = getSharedPreferences("BackgroundColor", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("myColor",color);
        editor.commit();

    }

    private int loadColor()
    {


        SharedPreferences sharedPreferences = getSharedPreferences("BackgroundColor", Context.MODE_PRIVATE);
        int SelectColor = sharedPreferences.getInt("myColor",getResources().getColor(R.color.colorPrimary));


        return SelectColor;
    }


}
