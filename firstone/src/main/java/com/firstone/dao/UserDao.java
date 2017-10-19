package com.firstone.dao;

import com.firstone.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User getUser();
}
