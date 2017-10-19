package com.firstone.dao;

import com.firstone.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    Product getProduct(int id);
    List getAllProduct();
    int insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
}
