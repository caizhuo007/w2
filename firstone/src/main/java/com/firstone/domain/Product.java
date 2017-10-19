package com.firstone.domain;

import java.util.Date;

public class Product {

    private int id;
    private Date startDate;
    private int duration; //number of months
    private int price;

    public Product(int id, Date startDate, int duration, int price) {
        this.id = id;
        this.startDate = startDate;
        this.duration = duration;
        this.price = price;
    }

    public Date getStartDate() {

        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
