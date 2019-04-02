package com.example.countryprofile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bbtn,ibtn,pbtn;
    private AlertDialog.Builder alertdialogbulder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bbtn = findViewById(R.id.bngbtn);
        ibtn = findViewById(R.id.indbtn);
        pbtn = findViewById(R.id.pakbtn);

        bbtn.setOnClickListener(this);
        ibtn.setOnClickListener(this);
        pbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.bngbtn)
        {
            Intent i = new Intent(MainActivity.this,All_Information.class);
            i.putExtra("name","bangla");
            startActivity(i);
        }

        else if (v.getId()==R.id.indbtn)
        {
            Intent i = new Intent(MainActivity.this,All_Information.class);
            i.putExtra("name","india");
            startActivity(i);
        }

        else if(v.getId()==R.id.pakbtn)
        {
            Intent i = new Intent(MainActivity.this,All_Information.class);

            i.putExtra("name","pakistan");
            startActivity(i);
        }

    }

    @Override
    public void onBackPressed() {

        alertdialogbulder = new AlertDialog.Builder(MainActivity.this);
        alertdialogbulder.setTitle("Exit");
        alertdialogbulder.setMessage("Are want to exit?");
        alertdialogbulder.setIcon(R.drawable.ic_launcher_background);

        alertdialogbulder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                alertdialogbulder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });


                AlertDialog a = alertdialogbulder.create();

        a.show();
    }



}

