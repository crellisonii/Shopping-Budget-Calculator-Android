package com.solodev.shoppingbudgetcalculator.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager{

    private Integer openCounter = 0;
    private static DBManager instance;
    private static SQLiteOpenHelper databaseHelper;
    private SQLiteDatabase database;

    public static synchronized void initializeInstance(SQLiteOpenHelper helper){
        if (instance == null){
            instance = new DBManager();
            databaseHelper = helper;
        }
    }

    public static synchronized DBManager getInstance(){
        if (instance == null){
            throw new IllegalStateException(DBManager.class.getSimpleName() +
                    " is not initialized, call initializeInstance(..) method first.");
        }
        return instance;
    }

    public synchronized SQLiteDatabase openDatabase(){
        openCounter += 1;
        if(openCounter == 1){
            database = databaseHelper.getWritableDatabase();
        }
        return database;
    }

    public synchronized void closeDatabase(){
        openCounter -= 1;
        if(openCounter == 0){
            database.close();
        }
    }
}
