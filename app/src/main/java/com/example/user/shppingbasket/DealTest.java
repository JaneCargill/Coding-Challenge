package com.example.user.shppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/01/2017.
 */

public class DealTest {
    Deal deal;
    Basket basket;
    Item item;

    @Before
    public void before() {

        basket = new Basket();
        item = new Item(10, "no deal");
        deal = new Deal(basket);
    }

    @Test
    public void discountWithLoyaltyCard() {
        basket.addItem(item);
        assertEquals(0.2f, deal.twoPercentDiscount());

    }



}
