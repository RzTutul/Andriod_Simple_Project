package com.example.sharedprefereddemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText username,pass;
    Button savebtn,loadbtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.usertxtID);
        pass = findViewById(R.id.passwordtxtID);
        savebtn = findViewById(R.id.savebtnId);
        loadbtn = findViewById(R.id.loadbtnId);

        textView = findViewById(R.id.detailsId);

        savebtn.setOnClickListener(this);
        loadbtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.savebtnId)
        {
            String userName  = username.getText().toString();
            String password = pass.getText().toString();

            SharedPreferences sharedPreferences = getSharedPreferences("UserDetails", Context.MODE_PRIVATE);

            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString("usernameKey",userName);
            editor.putString("passwordKey",password);
            editor.commit();

            Toast.makeText(MainActivity.this,"Save Succesfully",Toast.LENGTH_SHORT).show();

            username.setText("");
            pass.setText("");


        }

        else if (v.getId()==R.id.loadbtnId)
        {
            SharedPreferences sharedPreferences = getSharedPreferences("UserDetails", Context.MODE_PRIVATE);

            if (sharedPreferences.contains("usernameKey") && sharedPreferences.contains("passwordKey"))
            {
                String username = sharedPreferences.getString("usernameKey","Data not Found");
                String password = sharedPreferences.getString("passwordKey","Data not Found");


                textView.setText("username: "+username+"\n"+"password: "+password);
            }
        }
    }
}
