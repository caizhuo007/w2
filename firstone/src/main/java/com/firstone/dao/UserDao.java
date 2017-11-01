package com.firstone.dao;

import com.firstone.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User getUserById(int id);

    User getUserByName(String name);

    User getUserByPhone(String phone);

    int insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
