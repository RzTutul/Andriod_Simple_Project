package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button addbtn,subbtn,resbtn;
    TextView restxt;
    EditText txtbox1,txtbox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addbtn = findViewById(R.id.addbtn);
        subbtn = findViewById(R.id.subbtn);
        resbtn = findViewById(R.id.resultbtn);

        txtbox1 =  findViewById(R.id.txbox1);
        txtbox2 =findViewById(R.id.txtbox2);

        restxt = findViewById(R.id.showresult);


    }

    int result =0;
    String a,b;

    public void buttonfunction(View v)
    {


try {

    if (v.getId()==R.id.addbtn)
    {
        a =  txtbox1.getText().toString();
        b = txtbox2.getText().toString();

        result = Integer.parseInt(a)+ Integer.parseInt(b);

        restxt.setText(Integer.toString(result));
    }

    if (v.getId()==R.id.subbtn)
    {
        a = txtbox1.getText().toString();
        b = txtbox2.getText().toString();

        result = Integer.parseInt(a)- Integer.parseInt(b);
        restxt.setText(Integer.toString(result));

    }

    if (v.getId()==R.id.showresult)
    {
        restxt.setText(Integer.toString(result));
    }




}
catch (Exception e)
{
    Toast.makeText(MainActivity.this,"Input values",Toast.LENGTH_SHORT).show();
}





    }

}
