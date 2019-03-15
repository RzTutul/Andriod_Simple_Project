package com.example.button;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button,button2;
    private TextView textView;
    private EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttn1);
        button2 = findViewById(R.id.buttn2);

        textView = findViewById(R.id.lavel);
        editText1 =findViewById(R.id.edittext1);
        editText2 = findViewById(R.id.edittext2);


    }
        public void showMeassage(View v)
        {
            if (v.getId()==R.id.buttn1)
            {
                textView.setText("It is clicked");
                editText1.setText("it is edit text 1");

                Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
            }
            if (v.getId()==R.id.buttn2)
            {
                textView.setText("you shouldn't click here ok");
                editText2.setText("it is edit text 2");
            }
        }



}
