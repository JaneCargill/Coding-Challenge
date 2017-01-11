package com.example.user.shppingbasket;

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


//    public Basket getBasket() {
//        return this.basket;
//    }

    public String getDeal() {
        return deal;
    }

    public float twoPercentDiscount() {
        int total = basket.getTotalCost();
        float discountedPrice = total / 100.0f * 2.0f;
        return discountedPrice;
//        return total;
    }


}