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

    class Builder{

        private String newId;
        private String newShoppingTripId;
        private String newName;
        private String newSection;
        private int newQuantity;
        private double newPrice;
        private boolean newSale;
        private String newStore;

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
