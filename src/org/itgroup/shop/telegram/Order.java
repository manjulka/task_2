package org.itgroup.shop.telegram;

import java.util.ArrayList;

/**
 * Created by inga on 20.06.2016.
 */
public class Order {
    private int id;
    private boolean status;
    public Order(int id, boolean status){
        this.id = id;
        this.status = status;
    }
    public String getStatus(){
        if (status) return "Yes";
        else return "No";
    }
    public int getId() {
        return id;
    }
    public ArrayList<Product> ProductList;
}
