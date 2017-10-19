package com.firstone.service;

import com.firstone.dao.UserDao;
import com.firstone.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDao userDao;

    public User getUser(String id){
        logger.debug("come to UserService");

        return userDao.getUser();
    }

}
