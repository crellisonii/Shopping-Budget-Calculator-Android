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

    public void setId(String id){
        this.id = id;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double budget){
        this.budget = budget;
    }

    public boolean isOverBudget(){
        return overBudget;
    }

    public void setOverBudget(boolean overBudget){
        this.overBudget = overBudget;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}
