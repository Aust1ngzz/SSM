package com.aust1ng.service.Impl;

import com.aust1ng.dao.UserDao;
import com.aust1ng.entity.User;
import com.aust1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public User getByName(String name) {
        return userDao.getByName(name);
    }
}
