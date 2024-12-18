package com.falkenbeast.mymcd;

import android.widget.ListView;

import androidx.annotation.NonNull;

public class Maindish {

    String name;
    String desc;
    int price;

    Maindish(String name, String desc, int price){
        this.name = name;
        this.desc = desc;
        this.price = price;

    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
