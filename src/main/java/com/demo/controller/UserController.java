package com.demo.controller;

import com.demo.bean.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserController {
    @Autowired
    public UserService service;

    @RequestMapping(value="/getUser", method = { RequestMethod.POST, RequestMethod.GET })
    public User getUser(User user) throws Exception {
        service.insertUser(user);
        service.deleteUser(user);
        service.updateUser(user);
        service.selectUser(user);
        return user;
    }
}
