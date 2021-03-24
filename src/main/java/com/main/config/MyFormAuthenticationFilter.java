package com.main.config;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by Administrator on 2021/3/24.
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter{
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        System.out.println("验证失败，进入验证失败逻辑");
        request.getRequestDispatcher("/noLogin").forward(request,response);
        System.out.println("转发到未登录页面");
        return false;
    }
}
