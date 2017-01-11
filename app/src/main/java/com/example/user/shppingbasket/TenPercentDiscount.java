package com.example.user.shppingbasket;

/**
 * Created by user on 11/01/2017.
 */

public class TenPercentDiscount implements Deal{
    private String deal;
    private Basket basket;
    private BuyOneGetOneFree bogof;


    public TenPercentDiscount(String deal, Basket basket){
        this.basket = basket;
        this.deal = deal;
        bogof = new BuyOneGetOneFree("bogof", basket);
    }

    public String getDeal() {
        return deal;
    }

    public float tenPercentDiscount() {
        bogof.bogof();
        float cost = basket.getTotalCost();
        if (cost > 20.00f) {
            float discount = cost / 10.00f;

            return cost - discount;
        }
        return cost;
    }
}
