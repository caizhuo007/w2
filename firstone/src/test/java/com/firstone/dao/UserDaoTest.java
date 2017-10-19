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

        User user = userDao.getUser();
        Assert.assertTrue(user==null);
    }

}
