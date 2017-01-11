package com.example.user.shppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/01/2017.
 */

public class DealTest {
    LoyaltyCardDiscount deal;
    BuyOneGetOneFree bogof;
    Basket basket;
    Item item;
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before() {

        basket = new Basket();
        item = new Item(10, "no deal");
        item1 = new Item(5, "no deal");
        item2 = new Item(7, "no deal");
        item3 = new Item(11, "no deal");
        deal = new LoyaltyCardDiscount("2% off total", basket);
    }

    @Test
    public void discountWithLoyaltyCard() {
        basket.addItem(item);
        assertEquals(0.2f, deal.twoPercentDiscount());

    }

    @Test
    public void canSortBasketByPrice() {
        basket.addItem(item2);
        basket.addItem(item1);
        basket.addItem(item);
        basket.addItem(item3);
        ArrayList<Item> basketItems = basket.getItems();
        Collections.sort(basketItems);
        assertEquals(5, basketItems.get(0).getPrice());
    }



}
