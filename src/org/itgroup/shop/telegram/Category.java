package org.itgroup.shop.telegram;

import java.util.ArrayList;

/**
 * Created by inga on 20.06.2016.
 */
public class Category {
    private String name;
    private int id;
    public Category(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Product> ProductList;
}