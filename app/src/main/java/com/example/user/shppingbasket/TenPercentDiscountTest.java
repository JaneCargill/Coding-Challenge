package com.example.user.shppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/01/2017.
 */

public class TenPercentDiscountTest {
    private TenPercentDiscount tenPercDisc;
    private Basket basket;
    private Item item;
    private Item item1;
    private Item item2;
    private Item item3;

    @Before
    public void before() {
        basket = new Basket();
        item = new Item(10, "no deal");
        item1 = new Item(5, "no deal");
        item2 = new Item(7, "no deal");
        item3 = new Item(11, "no deal");
        tenPercDisc = new TenPercentDiscount("10% off", basket);
    }

    @Test
    public void canGetDeal() {
        assertEquals("10% off", tenPercDisc.getDeal());
    }

}
