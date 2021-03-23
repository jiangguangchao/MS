package com.main.control;

import com.main.bean.User;
import com.main.dao.UserDao;
import com.main.response.Result;
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
    public String login(@RequestBody User user){

        System.out.println(user);
        if (user == null || !StringUtils.hasText(user.getUserId())) {
            return "请输入用户名";
        }

        User u = dao.findUserById(user.getUserId());
        if (u == null || !u.getPassword().equals(user.getPassword())) {
            return "用户名或者密码错误";
        }

        return "success";
    }

    @RequestMapping("/noLogin")
    public Result noLogin() {
        Result result = new Result();
        result.setCode("05");
        result.setMessage("请先登录");
        return result;
    }
}
