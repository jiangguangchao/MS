package com.main.config;

import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2021/3/26.
 */
public class CustomeAuthorizationFilter extends AuthorizationFilter{
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        System.out.println("执行自定义授权过滤器的授权逻辑");
        Set<String> allowString = new HashSet<String>();
        allowString.add("/order");
        return false;
    }

    //认证失败
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        System.out.println("进入认证失败方法");
        try{
            request.getRequestDispatcher("/noLogin").forward(request,response);
        } catch(ServletException e){
            System.out.println("转发登录页失败");
        }
        return false;
    }

    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("服务器端口：" + req.getServerPort());
        System.out.println("content-type(req.getContentType):" + req.getContentType());
        System.out.println("content-length:" + req.getContentLength());
        System.out.println("authType:" + req.getAuthType());
        System.out.println("Method:" + req.getMethod());
        System.out.println("requestSessionId:" + req.getRequestedSessionId());
        System.out.println("Header(accetp):" + req.getHeader("Accept"));
        System.out.println("host:" + req.getHeader("Host"));
        System.out.println("origin:" + req.getHeader("Origin"));
        System.out.println("cookies:" + req.getCookies());
        System.out.println("Header(cookies):" + req.getHeader("Cookie"));
        System.out.println("Access-Control-Allow-Headers:" + req.getHeader("Access-Control-Allow-Headers"));

        HttpServletResponse resp = (HttpServletResponse) response;
        resp.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
        resp.setHeader("Access-Control-Allow-Methods", req.getMethod());
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        resp.setHeader("Access-Control-Allow-Headers","Content-Type");
        return super.preHandle(request, response);
    }
}
