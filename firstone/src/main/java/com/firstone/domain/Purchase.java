package com.firstone.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Purchase {

    private int id;
    private BigDecimal amount;
    private Date createDate;
    private User user;
    private Product product;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
