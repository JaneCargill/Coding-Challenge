package com.example.user.shppingbasket;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 10/01/2017.
 */

public class BuyOneGetOneFree implements Deal{
    private Basket basket;
    private String deal;

    public BuyOneGetOneFree(String deal, Basket basket){
        this.basket = basket;
        this.deal = deal;
    }

    public String getDeal(){
        return deal;
    }

    public void bogof(){
        ArrayList<Item> shopping = basket.getItems();
         Collections.sort(shopping);
        int halfNoOfItems = basket.evenNumberOfItemsInBasket() / 2;
        for (int counter = 0; counter < halfNoOfItems; counter++ ){
            shopping.get(counter).setPrice(0);
                }
    }

}
