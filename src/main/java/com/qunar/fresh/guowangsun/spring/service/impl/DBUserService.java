package com.qunar.fresh.guowangsun.spring.service.impl;

import com.qunar.fresh.guowangsun.spring.bean.User;
import com.qunar.fresh.guowangsun.spring.dao.IUserDAO;
import com.qunar.fresh.guowangsun.spring.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class DBUserService implements IUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DBUserService.class);

    @Resource
    private IUserDAO userDAO;

    @Override public boolean find(User user) {
        try {
            return userDAO.find(user) == null ? false : true;
        } catch (DataAccessException e) {
            LOGGER.info("Can not found user", e);
            return false;
        }
    }

    @Override public List<User> findAll() {
        return userDAO.findAll();
    }
}
