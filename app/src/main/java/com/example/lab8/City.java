package com.example.lab8;

import androidx.annotation.Nullable;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        City toCompare = (City) obj;
        return this.city == toCompare.getCityName();
    }
}
