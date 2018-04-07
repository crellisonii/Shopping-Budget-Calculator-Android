package com.solodev.shoppingbudgetcalculator.services.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.solodev.shoppingbudgetcalculator.app.App;

public class Database extends SQLiteOpenHelper{

    private static final String DB_NAME = "shopping_budget.db";
    private static final int DB_VERSION = 1;


    public Database(){
        super(App.getContext(), DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db){

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
