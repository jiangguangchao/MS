package com.main.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author:jgc
 * @create:2021-03-13 19:14
 */

@RestController
public class LoginCtrl {

    @RequestMapping("/login")
    public String login(){
        return "login success,ok111";
    }
}
