package com.main.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author:jgc
 * @create:2021-03-22 18:46
 */
@Configuration
public class ShrioConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(
            @Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        /*  添加shiro的内置过滤器
                anon 无需认证就可以访问
                authc  必须认证才能访问
                user  必须拥有记住我功能 才能用
                perms  拥有对某个用户资源才能访问
                role   拥有某个角色权限才能访问
         */
        Map<String, Filter> filters = new HashMap<String, Filter>();
        filters.put("authc",new CustomeAuthorizationFilter());
        shiroFilterFactoryBean.setFilters(filters);

        Map<String,String> map = new LinkedHashMap<String, String>();
        map.put("/login","anon");
        map.put("/noLogin", "anon");
        map.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);


        return shiroFilterFactoryBean;
    }

    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm realm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        return securityManager;
    }

    @Bean(name="userRealm")
    public UserRealm getRealm() {

        return new UserRealm();
    }
}
