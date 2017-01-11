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
    TenPercentDiscount tenPercDisc;
    Person person;
    Person person2;

    @Before
    public void before() {

        basket = new Basket();
        item = new Item(10, "no deal");
        item1 = new Item(5, "no deal");
        item2 = new Item(7, "no deal");
        item3 = new Item(11, "no deal");
        deal = new LoyaltyCardDiscount("2% off total", basket);
        bogof = new BuyOneGetOneFree("bogof", basket);
        tenPercDisc = new TenPercentDiscount("tenPerc", basket);
        person = new Person("Jane", true);
        person2 = new Person("Bob", false);
    }

    @Test
    public void twoPercentDiscount() {
        basket.addItem(item);
        assertEquals(9.8f, deal.twoPercentDiscount(tenPercDisc, bogof));

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

    @Test
    public void bogofDeal() {
        basket.addItem(item2);
        basket.addItem(item1);
        basket.addItem(item);
        basket.addItem(item3);
        bogof.bogof();
        assertEquals(21, basket.getTotalCost());
    }

    @Test
    public void tenPercDisc() {
        basket.addItem(item2);
        basket.addItem(item1);
        basket.addItem(item);
        basket.addItem(item3);
        assertEquals(18.9f, tenPercDisc.tenPercentDiscount(bogof));
    }

    @Test
    public void discountWithLoyaltyCard() {
        basket.addItem(item2);
        basket.addItem(item1);
        basket.addItem(item);
        basket.addItem(item3);
        assertEquals(18.522f, deal.implementDealWithLoyaltyCard(person, tenPercDisc, bogof));

    }

    @Test
    public void shopperWithoutLoyaltyCard() {
        basket.addItem(item2);
        basket.addItem(item1);
        basket.addItem(item);
        basket.addItem(item3);
        assertEquals(18.9f, deal.implementDealWithLoyaltyCard(person2, tenPercDisc, bogof));
    }




}
