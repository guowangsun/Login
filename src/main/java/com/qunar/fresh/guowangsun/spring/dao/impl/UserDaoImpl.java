package com.qunar.fresh.guowangsun.spring.dao.impl;

import com.qunar.fresh.guowangsun.spring.bean.User;
import com.qunar.fresh.guowangsun.spring.dao.IUserDAO;

import java.util.List;

/**
 * Created by sun on 14-12-27.
 */
public class UserDaoImpl implements IUserDAO {
    @Override public User find(User user) {
        return null;
    }

    @Override public int insert(User user) {
        return 1;
    }

    @Override public List<User> findAll() {
        return null;
    }
}
