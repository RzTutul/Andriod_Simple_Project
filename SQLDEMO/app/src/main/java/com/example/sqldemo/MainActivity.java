package com.example.sqldemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MyDatabaseHelper databaseHelper;

    EditText nametxt, depttxt, result, idtxt;
    Button savebtn, loadbtn, updatebtn, deletebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new MyDatabaseHelper(this);

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        nametxt = findViewById(R.id.nameEditID);
        depttxt = findViewById(R.id.depttextId);
        result = findViewById(R.id.resultID);
        idtxt = findViewById(R.id.idedittxtID);
        savebtn = findViewById(R.id.savebtnID);
        loadbtn = findViewById(R.id.loadbtnID);
        updatebtn = findViewById(R.id.UpdatebtnID);
        deletebtn = findViewById(R.id.DeletebtnID);

        savebtn.setOnClickListener(this);
        loadbtn.setOnClickListener(this);
        updatebtn.setOnClickListener(this);
        deletebtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String name = nametxt.getText().toString();
        String Department = depttxt.getText().toString();
        String id = idtxt.getText().toString();

        if (v.getId() == R.id.savebtnID) {
            long rowId = databaseHelper.insertData(name, Department);

            if (rowId == -1) {
                Toast.makeText(getApplicationContext(), "unsucessful", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplicationContext(), "Saved!!", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.loadbtnID) {
            Toast.makeText(getApplicationContext(), "working", Toast.LENGTH_SHORT).show();
            Cursor cursor = databaseHelper.displayAllData();

            if (cursor.getCount() == 0) {
                Toast.makeText(getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
                return;
            }

            StringBuffer stringBuffer = new StringBuffer();

            while (cursor.moveToNext()) {
                stringBuffer.append("ID: " + cursor.getString(0) + "\n");
                stringBuffer.append("Name: " + cursor.getString(1) + "\n");
                stringBuffer.append("Department: " + cursor.getString(2) + "\n");
            }

            showData("ResultSet", stringBuffer.toString());
        } else if (v.getId() == R.id.UpdatebtnID) {

            Boolean isUpdated = databaseHelper.UpdateData(id, name, Department);

            if (isUpdated == true) {
                Toast.makeText(getApplicationContext(), "updated", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "fail update", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.DeletebtnID) {

            int value = databaseHelper.DeleteData(id);

            if (value > 0) {
                Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Delete fail", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void showData(String resultSet, String Data) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(resultSet);
        builder.setMessage(Data);
        builder.setCancelable(true);
        builder.show();

    }
}
