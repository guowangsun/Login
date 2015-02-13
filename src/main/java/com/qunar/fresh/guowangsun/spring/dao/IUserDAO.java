package com.qunar.fresh.guowangsun.spring.dao;

import com.qunar.fresh.guowangsun.spring.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface IUserDAO {
    public User find(User user);
    public int insert(User user);
    public List<User> findAll();
}
