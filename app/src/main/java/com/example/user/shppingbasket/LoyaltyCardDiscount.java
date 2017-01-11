package com.example.user.shppingbasket;

import android.util.Log;

/**
 * Created by user on 10/01/2017.
 */

public class LoyaltyCardDiscount implements Deal{
    private Basket basket;
    private String deal;

    public LoyaltyCardDiscount(String deal, Basket basket){
        this.deal = deal;
        this.basket = basket;
    }


    public String getDeal() {
        return deal;
    }

    public float twoPercentDiscount(TenPercentDiscount tenPercDisc, BuyOneGetOneFree bogof) {
        float total = tenPercDisc.tenPercentDiscount(bogof);
        float discountedPrice = total / 100.0f * 2.0f;
        return total - discountedPrice;

    }

    public float implementDealWithLoyaltyCard(Person person, TenPercentDiscount tenPercDisc, BuyOneGetOneFree bogof) {
        if (person.hasLoyaltyCard()) {
            return twoPercentDiscount(tenPercDisc, bogof);
        }
        return tenPercDisc.tenPercentDiscount(bogof);
    }

}