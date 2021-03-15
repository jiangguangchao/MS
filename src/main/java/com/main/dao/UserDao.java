package com.main.dao;

import com.main.bean.User;

public interface UserDao {

    public User findUserById(String userId);
}
