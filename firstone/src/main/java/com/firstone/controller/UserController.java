package com.firstone.controller;

import com.firstone.domain.User;
import com.firstone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    public static final String LOGINUSERKEY = "loginuserkey";
    @Autowired
    private UserService userService;

    @RequestMapping(value="/register", produces="text/html;charset=UTF-8")
    public String register(){
        return "/register/register.jsp";
    }

    @RequestMapping(value="/createuser", produces="text/html;charset=UTF-8")
    public String createUser(HttpServletRequest request){
        User user = new User();

        user.setPhone(request.getParameter("phone_number"));
        user.setName(user.getPhone());
        user.setPasswd(request.getParameter("password"));
        if("".equals(user.getPhone()) || "".equals(user.getPasswd() == null)){
            request.setAttribute("message","手机号和密码不能为空");
            return "/register";
        }

        User userInDB = userService.getUserByPhone(user.getPhone());
        if(userInDB != null){
            request.setAttribute("message","手机号系统中已经存在了，您看看输入的是否正确");
            return "/register";
        }

        user = userService.createUser(user);
        registerAsLoginUser(request,user);
        request.setAttribute("userName",user.getName());
        request.setAttribute("userPassword",user.getPasswd());
        request.setAttribute("userId",user.getId());
        return "/register/registermessage.jsp";
    }

    @RequestMapping(value="/user/info", produces="text/html;charset=UTF-8")
    public String getUserInfo(HttpServletRequest request){

        String id = (String.valueOf(request.getSession().getAttribute(LOGINUSERKEY)));

        User user = userService.getUser(id);
        if (user == null)
        {
            return "redirect:/";
        }
        request.setAttribute("userName", user.getName());

        return "/my/my.jsp";
    }

    @RequestMapping(value="/login", produces="text/html;charset=UTF-8")
    public String login(){
        return "/login/login.jsp";
    }

    @RequestMapping(value="/dologin", produces="text/html;charset=UTF-8")
    public String dologin(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        User user = userService.getUserByName(userName);

        if(user == null || !user.getPasswd().equals(password)){
            request.setAttribute("message","用户名或密码错误");
            return "/login/login.jsp";
        }

        registerAsLoginUser(request, user);
        return "redirect:/user/info";
    }

    private void registerAsLoginUser(HttpServletRequest request, User user) {
        request.getSession().setAttribute(LOGINUSERKEY, user.getId());
    }

    @RequestMapping(value="/logout", produces="text/html;charset=UTF-8")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/";
    }

}
