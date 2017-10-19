package com.firstone.dao;


import com.firstone.domain.Purchase;

import java.util.List;

public interface PurchaseDao {

    Purchase getPurchase(int id);
    int insertPurchase(Purchase purchase);
    void updatePurchase(Purchase purchase);
    void deletePurchase(Purchase purchase);
    List getPurchasesByUser(int id);
}
