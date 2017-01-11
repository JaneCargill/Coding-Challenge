package com.example.user.shppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 09/01/2017.
 */

public class Basket {

    private ArrayList<Item> items;


    public Basket(){
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public int numberOfItemsInBasket() {
        return items.size();
    }

    public int evenNumberOfItemsInBasket() {
        if (numberOfItemsInBasket() % 2 == 0)
            return numberOfItemsInBasket();
        else return numberOfItemsInBasket() - 1;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public int getTotalCost() {
        int sum = 0;
        for(Item item : items)
            sum += item.getPrice();
        return sum;
    }


}
