package com.solodev.shoppingbudgetcalculator.services.models;

public class Item{

    private String id;
    private String shoppingTripId;
    private String name;
    private String section;
    private int quantity;
    private double price;
    private boolean sale;
    private String store;

    private Item(String id, String shoppingTripId, String name, String section, int quantity, double price, boolean sale, String store){
        this.id = id;
        this.shoppingTripId = shoppingTripId;
        this.name = name;
        this.section = section;
        this.quantity = quantity;
        this.price = price;
        this.sale = sale;
        this.store = store;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getShoppingTripId(){
        return shoppingTripId;
    }

    public void setShoppingTripId(String shoppingTripId){
        this.shoppingTripId = shoppingTripId;
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

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public boolean isSale(){
        return sale;
    }

    public void setSale(boolean sale){
        this.sale = sale;
    }

    public String getStore(){
        return store;
    }

    public void setStore(String store){
        this.store = store;
    }
}
