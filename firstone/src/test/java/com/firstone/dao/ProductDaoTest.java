package com.firstone.dao;

import com.firstone.domain.Product;
import com.firstone.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 如果要指定不一样的数据库，需要在test/java/resources/下面另做一个数据库配置文件，然后在@中引用
 * 测试编译时会把生产和测试的配置文件一同放到classpath下，因此要用不一样的配置文件名称
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/springmybatis.xml")
@Transactional
public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;


    @Test
    public void testInsertProduct(){
        Product product = new Product();
        product.setName("best one");
        product.setPrice(10);
        product.setDuration(1);
        productDao.insertProduct(product);
        Assert.assertTrue(product.getId()!=0);

        Product productFromDB = productDao.getProduct(product.getId());
        Assert.assertEquals(product.getId(),productFromDB.getId());
        Assert.assertEquals(product.getName(),productFromDB.getName());
        Assert.assertEquals(product.getPrice(),productFromDB.getPrice());
        Assert.assertEquals(product.getDuration(),productFromDB.getDuration());

    }

    @Test
    public void testUpdateProduct(){
        Product product = new Product();
        product.setName("best one");
        product.setPrice(10);
        product.setDuration(1);
        productDao.insertProduct(product);
        Assert.assertTrue(product.getId()!=0);

        product.setName("best one1");
        product.setPrice(11);
        product.setDuration(2);
        productDao.updateProduct(product);

        Product productFromDB = productDao.getProduct(product.getId());

        Assert.assertEquals("best one1",productFromDB.getName());
        Assert.assertEquals(11,productFromDB.getPrice());
        Assert.assertEquals(2,productFromDB.getDuration());
    }

}
