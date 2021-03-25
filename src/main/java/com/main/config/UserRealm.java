package com.main.config;

import com.main.bean.User;
import com.main.dao.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author:jgc
 * @create:2021-03-22 18:47
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserDao userDao;

    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


    //执行认证逻辑
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {

        System.out.println("开始执行认证逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String userId = token.getUsername();
        User uInDB = userDao.findUserById(userId);
        System.out.println("uInDB:" + uInDB);
        System.out.println("tokenp:" + token.getPassword());
        if (uInDB == null){
            System.out.println("用户不存在");
            return null;
        }

        return new SimpleAuthenticationInfo(userId, uInDB.getPassword(), getName());
    }
}
