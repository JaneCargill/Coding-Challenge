package com.example.user.shppingbasket;

/**
 * Created by user on 09/01/2017.
 */

public class Item implements Comparable<Item> {

    private int price;

    public Item(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) { this.price = newPrice; }


    @Override
    public int compareTo(Item compareItem){
        int comparePrice = compareItem.getPrice();
        return this.price-comparePrice;
    }
}
