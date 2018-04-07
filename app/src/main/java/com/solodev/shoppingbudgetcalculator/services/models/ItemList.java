package com.solodev.shoppingbudgetcalculator.services.models;

import android.widget.CheckBox;

public class ItemList{

    private String id;
    private String name;
    private String section;
    private double price;
    private int quantity;
    private CheckBox checkBox;

    public ItemList(String id, String name, String section, double price, int quantity){
        this.id = id;
        this.name = name;
        this.section = section;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSection(){
        return section;
    }

    public void setSection(String section){
        this.section = section;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
