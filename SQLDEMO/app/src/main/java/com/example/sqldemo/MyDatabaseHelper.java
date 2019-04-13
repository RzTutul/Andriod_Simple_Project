package com.example.sqldemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class MyDatabaseHelper extends SQLiteOpenHelper {


    private Context context;
    public static final String DB="student.db";
    public static final String Table_name="student_info";
    public static final String Name="Name";
    public static final String Dept="Dept";
    public static final String ID="_ID";
    public static final String AllData ="Select * FROM "+Table_name;


    public static final String sql ="Create Table " +Table_name+ "("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+Name+" VARCHAR(20),"+Dept+" VARCHAR(20));";





    public MyDatabaseHelper(Context context) {
        super(context,DB,null, 5);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {
            Toast.makeText(context,"table Created",Toast.LENGTH_SHORT).show();

            db.execSQL(sql);

        }
        catch (SQLException e) {
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


    public long insertData(String name, String department) {

      SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Name,name);
        contentValues.put(Dept,department);

        long rowId = sqLiteDatabase.insert(Table_name,null,contentValues);
        return rowId;

    }

    public Cursor displayAllData() {

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery(AllData,null);

        return cursor;
    }

    public Boolean UpdateData(String id, String name, String department) {

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(ID,id);
        contentValues.put(Name,name);
        contentValues.put(Dept,department);

         sqLiteDatabase.update(Table_name,contentValues, ID + " = ? ", new String[]{id});


        return true;
    }

    public int DeleteData(String id) {

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        return  sqLiteDatabase.delete(Table_name,ID+"= ?",new String[]{id});
    }
}
