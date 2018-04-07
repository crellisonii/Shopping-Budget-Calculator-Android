package com.solodev.shoppingbudgetcalculator.app;

import android.app.Application;
import android.content.Context;

import com.solodev.shoppingbudgetcalculator.database.DBManager;
import com.solodev.shoppingbudgetcalculator.database.Database;

public class App extends Application{

    private static Context context;
    private static Database db;

    @Override
    public void onCreate(){
        super.onCreate();
        context = this.getApplicationContext();
        db = new Database();
        DBManager.initializeInstance(db);
    }

    public static Context getContext(){
        return context;
    }
}
