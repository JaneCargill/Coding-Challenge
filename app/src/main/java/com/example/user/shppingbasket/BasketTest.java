package com.example.user.shppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/01/2017.
 */

public class BasketTest {
    Basket basket;
    Item item;
    Item item2;
    Item item3;

    @Before
    public void before() {
        basket = new Basket();
        item = new Item(10, "no deal");
        item2 = new Item(15, "no deal");
        item3 = new Item(13, "no deal");
    }

    @Test
    public void basketStartsEmpty() {
        assertEquals(0, basket.numberOfItemsInBasket());
    }

    @Test
    public void canAddItemsToBasket() {
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(2, basket.numberOfItemsInBasket());
    }

    @Test
    public void canRemoveItemsFromBasket() {
        basket.addItem(item);
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(1, basket.numberOfItemsInBasket());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item);
        basket.addItem(item);
        basket.emptyBasket();
        assertEquals(0, basket.numberOfItemsInBasket());
    }

    @Test
    public void canTotalPriceOfItemsInBasket() {
        basket.addItem(item);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(38, basket.getTotalCost());

    }

}
