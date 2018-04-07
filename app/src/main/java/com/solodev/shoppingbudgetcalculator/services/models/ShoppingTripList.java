package com.solodev.shoppingbudgetcalculator.services.models;

import java.util.Date;

public class ShoppingTripList{

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

    public void setId(String id){
        this.id = id;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public boolean isOverBudget(){
        return overBudget;
    }

    public void setOverBudget(boolean overBudget){
        this.overBudget = overBudget;
    }

    public double getAdjustedBudget(){
        return adjustedBudget;
    }

    public void setAdjustedBudget(double adjustedBudget){
        this.adjustedBudget = adjustedBudget;
    }
}
