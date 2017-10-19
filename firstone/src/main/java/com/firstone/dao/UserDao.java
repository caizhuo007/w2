package com.firstone.dao;

import com.firstone.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User getUser(int id);

    int insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
