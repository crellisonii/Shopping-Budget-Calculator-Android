package com.solodev.shoppingbudgetcalculator.services.models;

import java.util.Date;

public class ShoppingTripList{

    // Database Table Name
    private static final String TABLE = "shopping_trip";

    // Database Column Names
    private static final String ID = "id";
    private static final String DATE = "date";
    private static final String TOTAL = "total";
    private static final String BUDGET = "budget";
    private static final String OVER_BUDGET = "over_budget";

    private String id;
    private Date date;
    private boolean overBudget;
    private double adjustedBudget;

    private ShoppingTripList(String id, Date date, boolean overBudget, double adjustedBudget){
        this.id = id;
        this.date = date;
        this.overBudget = overBudget;
        this.adjustedBudget = adjustedBudget;
    }

    public String getId(){
        return id;
    }

    public Date getDate(){
        return date;
    }

    public boolean isOverBudget(){
        return overBudget;
    }

    public double getAdjustedBudget(){
        return adjustedBudget;
    }

    class Builder{

        private String newId;
        private Date newDate;
        private boolean newOverBudget;
        private double newTotal;
        private double newBudget;

        public Builder(String id, Date date){
            this.newId = id;
            this.newDate = date;
        }

        public Builder overBudget(boolean overBudget){
            this.newOverBudget = overBudget;
            return this;
        }

        public Builder total(double total){
            this.newTotal = total;
            return this;
        }

        public Builder budget(double budget){
            this.newBudget = budget;
            return this;
        }

        public ShoppingTripList build(){
            double adjustedBudget = newBudget - newTotal;
            return new ShoppingTripList(newId, newDate, newOverBudget, adjustedBudget);
        }

    }
}
