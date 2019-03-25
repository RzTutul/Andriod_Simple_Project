package com.example.datepicker;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


   private Button btn;
   private AlertDialog.Builder alertdialogbulder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


alertdialogbulder = new AlertDialog.Builder(MainActivity.this);
alertdialogbulder.setTitle("Exit");
alertdialogbulder.setMessage("Are want to exit?");
alertdialogbulder.setIcon(R.drawable.browser);

alertdialogbulder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        finish();
    }
});

alertdialogbulder.setNegativeButton("No", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        dialog.cancel();
    }
});


AlertDialog a = alertdialogbulder.create();

        a.show();
        }



}
