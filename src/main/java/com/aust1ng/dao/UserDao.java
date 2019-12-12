package com.aust1ng.dao;

import com.aust1ng.entity.User;

public interface UserDao {
    User getById(Integer id);

    User getByName(String name);
}
