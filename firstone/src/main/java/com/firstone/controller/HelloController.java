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

    @RequestMapping("/index")
    public String sayHello(){
        //输出日志文件
        logger.info("the first jsp pages");

        User user = userService.getUser("1");
        if(user == null) logger.debug("user is null");
        else logger.debug(user.getName());

        return "index";
    }

}
