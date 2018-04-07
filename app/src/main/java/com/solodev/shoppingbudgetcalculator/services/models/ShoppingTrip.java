package com.solodev.shoppingbudgetcalculator.services.models;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingTrip{

    // Database Table Name
    private static final String TABLE = "shopping_trip";

    // Database Column Names
    private static final String _ID = "_id";
    private static final String ID = "id";
    private static final String DATE = "date";
    private static final String TOTAL = "total";
    private static final String BUDGET = "budget";
    private static final String OVER_BUDGET = "over_budget";


    private String id;
    private Date date;
    private double total;
    private double budget;
    private boolean overBudget;
    private ArrayList<ItemList> items;

    private ShoppingTrip(String id, Date date, double total, double budget,
                         boolean overBudget, ArrayList<ItemList> items){
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

    public ArrayList<ItemList> getItems(){
        return items;
    }

    class Builder{

        private String newId;
        private Date newDate;
        private double newTotal = 0.0;
        private double newBudget = 0.0;
        private boolean newOverBudget = false;
        private ArrayList<ItemList> newItems = new ArrayList<>();

        public Builder(String id, Date date){
            this.newId = id;
            this.newDate = date;
        }

        public Builder total(double total){
            this.newTotal = total;
            return this;
        }

        public Builder budget(double budget){
            this.newBudget = budget;
            return this;
        }

        public Builder overBudget(boolean overBudget){
            this.newOverBudget = overBudget;
            return this;
        }

        public Builder items(ArrayList<ItemList> items){
            this.newItems = items;
            return this;
        }

        public ShoppingTrip build(){
            return new ShoppingTrip(newId, newDate, newTotal, newBudget,
                    newOverBudget, newItems);
        }

    }

}
