package com.example.activitesforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secoundActivity extends AppCompatActivity {


    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        button = findViewById(R.id.btn2);
        editText = findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();

                Intent i = new Intent(secoundActivity.this,MainActivity.class);

                i.putExtra("key",s);

                setResult(1,i);
                finish();

            }
        });

    }
}
