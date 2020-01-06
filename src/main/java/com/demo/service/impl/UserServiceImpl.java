package com.demo.service.impl;

import com.demo.bean.User;
import com.demo.dao.UserDao;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao dao;

    @Override
    public void insertUser(User user) throws Exception {
        dao.insertUser(user);
    }

    @Override
    public void deleteUser(User user) throws Exception {
        dao.deleteUser(user);
    }

    @Override
    public void updateUser(User user) throws Exception {
        dao.updateUser(user);
    }

    @Override
    public void selectUser(User user) throws Exception {
        dao.selectUser(user);
    }
}
