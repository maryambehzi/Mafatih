package com.example.button.mafatih;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String Tag = "DatabaseHelper";

    private static final String TABLE_NAME = "favorits";
    private static final String COL1 = "ID";
    private static final String COL2 = "name";


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String createtable = "CREATE_TABLE"+ TABLE_NAME+"(ID STRING PRIMARY KEY AUTOINCREMENT,"+ COL2+"TEXT)";

//        db.exeCSQL(createtable);

    }





    public DatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }



}
