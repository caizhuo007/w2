package com.firstone.dao;

import com.firstone.domain.Product;
import com.firstone.domain.Purchase;
import com.firstone.domain.User;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 如果要指定不一样的数据库，需要在test/java/resources/下面另做一个数据库配置文件，然后在@中引用
 * 测试编译时会把生产和测试的配置文件一同放到classpath下，因此要用不一样的配置文件名称
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/springmybatis.xml")
@Transactional
public class PurchaseDaoTest {

    @Autowired
    private PurchaseDao purchaseDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInsertpurchase(){
        User user = createUser();
        Product product = createProduct();

        Purchase purchase = new Purchase();

        purchase.setUser(user);
        purchase.setProduct(product);
        purchase.setPaidPrice(100);
        purchase.setCreateDate(new Date());
        purchaseDao.insertPurchase(purchase);
        Assert.assertTrue(purchase.getId()!=0);

        Purchase purchaseFromDB = purchaseDao.getPurchase(purchase.getId());


        Assert.assertNotNull(purchaseFromDB.getCreateDate());
        Assert.assertEquals(purchase.getPaidPrice(),purchaseFromDB.getPaidPrice());
        Assert.assertEquals(purchase.getUser().getId(),purchaseFromDB.getUser().getId());
        Assert.assertEquals(purchase.getProduct().getId(),purchaseFromDB.getProduct().getId());

    }

    @Test
    public void testUpdatePurchase(){

        User user = createUser();
        Product product = createProduct();

        Purchase purchase = new Purchase();

        purchase.setUser(user);
        purchase.setProduct(product);
        purchase.setPaidPrice(100);
        purchase.setCreateDate(new Date());
        purchaseDao.insertPurchase(purchase);
        Assert.assertTrue(purchase.getId()!=0);

        purchase.setPaidPrice(101);
        Product newProduct = createProduct();
        purchase.setProduct(newProduct);
        purchase.setCreateDate(new Date());

        purchaseDao.updatePurchase(purchase);
        Purchase purchaseFromDB = purchaseDao.getPurchase(purchase.getId());


        Assert.assertEquals(101,purchaseFromDB.getPaidPrice());
        Assert.assertEquals(newProduct.getId(),purchaseFromDB.getProduct().getId());

    }

    private User createUser(){
        User user = new User();
        user.setName("jenny");
        user.setPasswd("123");
        user.setPhone("13817");
        userDao.insertUser(user);
        Assert.assertTrue(user.getId()!=0);
        return user;
    }

    private Product createProduct(){
        Product product = new Product();
        product.setName("best one");
        product.setPrice(10);
        product.setDuration(1);
        productDao.insertProduct(product);
        Assert.assertTrue(product.getId()!=0);
        return product;
    }

}
