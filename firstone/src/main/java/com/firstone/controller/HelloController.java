package com.firstone.controller;

import com.firstone.dao.UserDao;
import com.firstone.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
public class HelloController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping("/index")
    public String sayHello(){
        //输出日志文件
        logger.info("the first jsp pages");
        return "index";
    }


}
