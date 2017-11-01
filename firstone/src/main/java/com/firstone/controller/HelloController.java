package com.firstone.controller;

import com.firstone.domain.User;
import com.firstone.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value="/",produces="text/html;charset=UTF-8")
    public String sayHello(){

        return "index/index.jsp";
    }

}
