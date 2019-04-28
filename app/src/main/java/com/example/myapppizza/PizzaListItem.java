package com.example.myapppizza;

import java.io.Serializable;

public class PizzaListItem implements Serializable {
    public String storeName;
    public String openTime;
    public String logoImgUrl;

    public PizzaListItem(String storeName, String openTime, String logoImgUrl) {
        this.storeName = storeName;
        this.openTime = openTime;
        this.logoImgUrl = logoImgUrl;
    }
}
