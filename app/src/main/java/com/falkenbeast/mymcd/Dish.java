package com.falkenbeast.mymcd;

import androidx.annotation.NonNull;

public class Dish {

    String title;
    String descr;
    int price;

    Dish(String  title, String descr, int price){
        this.title = title;
        this.descr = descr;
        this.price = price;

    }


    @NonNull
    @Override
    public String toString() {
       return title;

    }
}
