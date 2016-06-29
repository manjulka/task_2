package org.itgroup.shop.telegram;

import java.util.ArrayList;

/**
 * Created by inga on 20.06.2016.
 */
public class StockRecord {
    private boolean stock;
    private int id;
    private int quantity;
    public StockRecord(int id, int quantity){
        this.id = id;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setStock(){
        stock=quantity>0;
    }
    public String getStock(){
        setStock();
        if (stock) return "In stock";
        else return "Off stock";
    }
    public ArrayList<Product> ProductList;
}