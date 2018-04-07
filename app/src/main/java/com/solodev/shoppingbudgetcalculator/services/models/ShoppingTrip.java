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

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    class Builder{

        private String newId;
        private Date newDate;
        private double newTotal = 0.0;
        private double newBudget = 0.0;
        private boolean newOverBudget = false;
        private ArrayList<Item> newItems = new ArrayList<>();

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

        public Builder items(ArrayList<Item> items){
            this.newItems = items;
            return this;
        }

        public ShoppingTrip build(){
            return new ShoppingTrip(newId, newDate, newTotal, newBudget, newOverBudget, newItems);
        }

    }

}
