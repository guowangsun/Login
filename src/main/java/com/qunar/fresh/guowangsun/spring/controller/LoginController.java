package com.qunar.fresh.guowangsun.spring.controller;

import com.qunar.fresh.guowangsun.spring.bean.User;
import com.qunar.fresh.guowangsun.spring.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private IUserService userService;

    @RequestMapping("/login")
    public ModelAndView login(User user) {
        for (User user1 : userService.findAll()) {
            System.out.println(user1);
        }
        if(userService.find(user)) {
            return new ModelAndView("redirect:index.jsp");
        } else {
            return new ModelAndView("redirect:login.jsp");
        }
    }
}
