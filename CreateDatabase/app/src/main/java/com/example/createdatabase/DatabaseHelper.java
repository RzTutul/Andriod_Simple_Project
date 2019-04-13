package com.example.createdatabase;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DatabaseHelper extends SQLiteOpenHelper {
private Context context;

    public static final String DB="student.db";

    public static final String Table_name="student.db";
    public static final String sql ="Create Table " +Table_name+ "(_ID INTEGER PRIMARY KEY AUTOINCREMENT, Name VARCHAR(20), Dept VARCHAR(20));";

    public DatabaseHelper(Context context){

        super(context,DB,null,3);
           this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        try {
            Toast.makeText(context,"table Created",Toast.LENGTH_SHORT).show();

            db.execSQL(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            Toast.makeText(context,"table Created",Toast.LENGTH_SHORT).show();
            db.execSQL("DROP TABLE IF EXISTS "+Table_name);
               onCreate(db);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
