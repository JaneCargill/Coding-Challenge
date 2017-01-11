package com.example.user.shppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/01/2017.
 */

public class ItemTest {
    Item item;
    Item item2;
    Item item3;

    @Before
    public void before() {
        item = new Item(10);
        item2 = new Item(15);
        item3 = new Item(13);
    }

    @Test
    public void hasPrice() {
        assertEquals(10, item.getPrice());
    }


}
