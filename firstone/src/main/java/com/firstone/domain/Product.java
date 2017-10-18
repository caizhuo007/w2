package com.firstone.domain;

import java.util.Date;

public class Product {

    private Date startDate;
    private int duration; //number of months

    public Product(Date startDate, int duration) {
        this.startDate = startDate;
        this.duration = duration;
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
}
