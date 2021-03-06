package com.solodev.shoppingbudgetcalculator.services.models;

import android.widget.CheckBox;

public class ItemList{

    // Database Table Name
    private static final String TABLE = "items";

    // Item table columns for this object
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String SECTIONS = "section";
    private static final String PRICE = "price";
    private static final String QUANTITY = "quantity";

    //
    private String id;
    private String name;
    private String section;
    private double price;
    private int quantity;
    private CheckBox checkBox;

    private ItemList(String id, String name, String section, double price, int quantity){
        this.id = id;
        this.name = name;
        this.section = section;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSection(){
        return section;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    class Builder{

        private String newId;
        private String newName = "";
        private String newSection = "";
        private double newPrice = 0.0;
        private int newQuantity = 0;

        public Builder(String newId){}

        public Builder name(String name){
            this.newName = name;
            return this;
        }

        public Builder section(String section){
            this.newSection = section;
            return this;
        }

        public Builder price(double price){
            this.newPrice = price;
            return this;
        }

        public Builder quantity(int quantity){
            this.newQuantity = quantity;
            return this;
        }

        public ItemList build(){
            return new ItemList(newId, newName, newSection, newPrice, newQuantity);
        }

    }
}
