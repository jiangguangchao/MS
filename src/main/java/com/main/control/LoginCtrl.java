package com.main.control;

import com.main.bean.User;
import com.main.dao.UserDao;
import com.main.response.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author:jgc
 * @create:2021-03-13 19:14
 */

@RestController
public class LoginCtrl {

    @Autowired
    private UserDao dao;

    @RequestMapping("/login")
    public Result login(@RequestBody User user){
        Result result = new Result();
        result.setCode("01");
        result.setMessage("登录失败");

        System.out.println(user);
        if (user == null || !StringUtils.hasText(user.getUserId())) {
            result.setMessage("请输入用户名");
            return result;
        }

        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUserId(), user.getPassword());
            subject.login(token);
            result.setCode("00");
            result.setMessage("登录成功");
        } catch(Exception e){
            System.out.println("登录认证失败，用户名或者密码错误");
            result.setMessage("登录认证失败，用户名或者密码错误");
        }

        return result;
    }

    @RequestMapping("/noLogin")
    public Result noLogin() {
        Result result = new Result();
        result.setCode("05");
        result.setMessage("请先登录");
        return result;
    }
}
