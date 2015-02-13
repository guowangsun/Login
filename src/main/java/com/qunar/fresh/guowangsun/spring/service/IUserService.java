package com.qunar.fresh.guowangsun.spring.service;

import com.qunar.fresh.guowangsun.spring.bean.User;

import java.util.List;

public interface IUserService {
    public boolean find(User user);

    public List<User> findAll();
}
