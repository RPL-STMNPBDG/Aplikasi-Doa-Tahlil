package com.example.ta_aplikasidoatahlil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    // Static Final Variable database meta information
    static final String DATABASE = "empapp.db";
    static final int VERSION = 1;
    static final String TABLE = "emp";

    static final String C_ID = "_id";
    static final String C_ENAME = "ename";

    // Override constructor
    public DBHelper (Context context) {
        super(context, DATABASE, null, VERSION);
    }

    // Override onCreate method
    @Override
    public void onCreate(SQLiteDatabase db){
        // Create Employee table with following fields
        // _ID, ENAME, DESIGNATION and SALARY
        db.execSQL("CREATE TABLE " + TABLE + " ( " + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + C_ENAME + " text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop old version table
        db.execSQL("Drop table " + TABLE);

        // Create New Version table
        onCreate(db);
    }
}