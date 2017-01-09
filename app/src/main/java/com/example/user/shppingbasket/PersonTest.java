package com.example.user.shppingbasket;

import org.junit.Before;
import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/01/2017.
 */

public class PersonTest {
    Person person;

    @Before
    public void before() {
        person = new Person("Jane", true);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", person.getName());
    }

    @Test
    public void hasLoyaltyCard() {
        assertEquals(true, person.hasLoyaltyCard());
    }
}
