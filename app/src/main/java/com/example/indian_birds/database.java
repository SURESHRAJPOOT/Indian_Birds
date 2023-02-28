package com.example.indian_birds;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.style.SuperscriptSpan;

import androidx.annotation.Nullable;

import java.security.Key;

public class database extends SQLiteOpenHelper {

    private static String key_id ="id";
    private static String key_name ="name";
    private static String key_sname ="sname";
    private static String key_longitude ="longitide";
    private static String key_latitude ="latitude";
    private static String key_table ="table";



    public database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        //when the info will come from mainactivity.java class ,it will filled here and send to the sqliteopenhelper
        //through super keyword ,then sqopenhelper will create a database name as birds_db
        //after this database objects will give data to the oncreate method.
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table ="CREATE TABLE"+key_table+("+key_id+"INTEGER PRIMARY KEY,"+key_name+"TEXT,"+Key_sname+" TEXT ,"+key_longitude+" TEXT"+key_lattitude" TEXT"+");
        sqLiteDatabase.execSQL(create_table);
        //need to change it,totlly
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
