package org.itgroup.shop.telegram;

/**
 * Created by inga on 20.06.2016.
 */
public class Product extends Category {
    private int price;
    private String content;
    public Product(String name,int id, int price, String content){
        super(name, id);
        this.price = price;
        this.content = content;
    }
}