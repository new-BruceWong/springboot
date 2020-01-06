package com.demo.dao;

import com.demo.bean.User;

public interface UserDao {
    void insertUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    void selectUser(User user);
}
