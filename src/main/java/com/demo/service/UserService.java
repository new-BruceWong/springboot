package com.demo.service;

import com.demo.bean.User;

public interface UserService {
    void insertUser(User user) throws Exception;
    void deleteUser(User user) throws Exception;
    void updateUser(User user) throws Exception;
    void selectUser(User user) throws Exception;
}
