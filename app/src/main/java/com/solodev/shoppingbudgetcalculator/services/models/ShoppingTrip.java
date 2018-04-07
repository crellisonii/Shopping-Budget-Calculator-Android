package com.solodev.shoppingbudgetcalculator.services.models;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingTrip{

    private String id;
    private Date date;
    private double total;
    private double budget;
    private boolean overBudget;
    private ArrayList<Item> items;

    private ShoppingTrip(String id, Date date, double total, double budget, boolean overBudget, ArrayList<Item> items){
        this.id = id;
        this.date = date;
        this.total = total;
        this.budget = budget;
        this.overBudget = overBudget;
        this.items = items;
    }

    public String getId(){
        return id;
    }

    public Date getDate(){
        return date;
    }

    public double getTotal(){
        return total;
    }

    public double getBudget(){
        return budget;
    }

    public boolean isOverBudget(){
        return overBudget;
    }

    public ArrayList<Item> getItems(){
        return items;
    }
}
