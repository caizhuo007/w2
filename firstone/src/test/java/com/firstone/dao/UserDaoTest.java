package com.firstone.dao;

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
public class UserDaoTest{

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUser(){

        User user = userDao.getUserById(1);
        Assert.assertTrue(user==null);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setName("jenny");
        user.setPasswd("123");
        user.setPhone("13817");
        userDao.insertUser(user);
        Assert.assertTrue(user.getId()!=0);

        User userFromDB = userDao.getUserById(user.getId());
        Assert.assertEquals(user.getId(),userFromDB.getId());
        Assert.assertEquals(user.getName(),userFromDB.getName());
        Assert.assertEquals(user.getPasswd(),userFromDB.getPasswd());
        Assert.assertEquals(user.getPhone(),userFromDB.getPhone());

    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setName("jenny");
        user.setPasswd("123");
        user.setPhone("13817");
        userDao.insertUser(user);
        Assert.assertTrue(user.getId()!=0);

        user.setName("jenny1");
        user.setPasswd("1231");
        user.setPhone("138171");
        userDao.updateUser(user);

        User userFromDB = userDao.getUserById(user.getId());

        Assert.assertEquals("jenny1",userFromDB.getName());
        Assert.assertEquals("1231",userFromDB.getPasswd());
        Assert.assertEquals("138171",userFromDB.getPhone());
    }

}
