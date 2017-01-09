package com.example.user.shppingbasket;

/**
 * Created by user on 09/01/2017.
 */

public class Person {

    private String name;
    private Boolean loyaltyCard;

    public Person(String name, boolean loyaltyCard) {
        this.name = name;
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasLoyaltyCard() {
        return this.loyaltyCard;
    }
}
