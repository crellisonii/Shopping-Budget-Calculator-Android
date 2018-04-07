package com.solodev.shoppingbudgetcalculator.services.models;

public class Item{

    // Database Table Name
    private static final String TABLE = "items";

    // Database Column Names
    private static final String _ID = "_ID";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String SECTION = "section";
    private static final String Quantity = "quantity";
    private static final String PRICE = "price";
    private static final String SALE = "sale";
    private static final String STORE = "store";

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

    public String getShoppingTripId(){
        return shoppingTripId;
    }

    public String getName(){
        return name;
    }

    public String getSection(){
        return section;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public boolean isSale(){
        return sale;
    }

    public String getStore(){
        return store;
    }

    class Builder{

        private String newId;
        private String newShoppingTripId;
        private String newName = "";
        private String newSection = "";
        private int newQuantity = 0;
        private double newPrice = 0.0;
        private boolean newSale = false;
        private String newStore = "";

        public Builder(String id, String shoppingTripId){
            this.newId = id;
            this.newShoppingTripId = shoppingTripId;
        }

        public Builder name(String name){
            this.newName = name;
            return this;
        }

        public Builder section(String section){
            this.newSection = section;
            return this;
        }

        public Builder quantity(int quantity){
            this.newQuantity = quantity;
            return this;
        }

        public Builder price(double price){
            this.newPrice = price;
            return this;
        }

        public Builder sale(boolean sale){
            this.newSale = sale;
            return this;
        }

        public Builder store(String store){
            this.newStore = store;
            return this;
        }

        public Item build(){
            return new Item(newId, newShoppingTripId, newName, newSection, newQuantity, newPrice, newSale, newStore);
        }

    }
}
