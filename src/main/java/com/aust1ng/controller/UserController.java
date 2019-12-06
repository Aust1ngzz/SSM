package com.aust1ng.controller;

import com.aust1ng.entity.User;
import com.aust1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/info/{id}")
    public User getUser(@PathVariable Integer id) {
        User user = userService.getById(id);
        return user;
    }
}
