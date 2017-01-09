package com.example.user.shppingbasket;

/**
 * Created by user on 09/01/2017.
 */

public class Item {

    private int price;
    private String deal;

    public Item(int price, String deal){
        this.price = price;
        this.deal = deal;
    }

    public int getPrice() {
        return price;
    }

    public String getDeal() {
        return deal;
    }
}
