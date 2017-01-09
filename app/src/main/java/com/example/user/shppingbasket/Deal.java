package com.example.user.shppingbasket;

import android.util.Log;

/**
 * Created by user on 09/01/2017.
 */

public class Deal {

//    Item item;
    private Basket basket;

    public Deal(Basket basket) {
//        this.item = item;
        this.basket = basket;
    }


    public float twoPercentDiscount() {
        int total = basket.getTotalCost();
        float discountedPrice = total / 100.0f * 2.0f;
        return discountedPrice;
//        return total;
    }


}
