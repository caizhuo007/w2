package com.firstone.service;

import com.firstone.dao.UserDao;
import com.firstone.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDao userDao;

    public User getUser(String id){
        logger.debug("come to UserService");
        if (id==null) return null;
        int intId;
        try{
            intId = Integer.parseInt(id);
        }catch (Exception e)
        {
            return null;
        }

        return userDao.getUserById(intId);
    }

    public User getUserByName(String name){

        if (name == null) return null;

        User user = userDao.getUserByName(name);
        return user;
    }

    public User getUserByPhone(String phone){

        if (phone == null) return null;

        User user = userDao.getUserByPhone(phone);
        return user;
    }

    public User createUser(User user){
        userDao.insertUser(user);
        return user;
    }

}
