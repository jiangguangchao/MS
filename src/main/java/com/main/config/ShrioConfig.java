package com.main.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.ShiroFilter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
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
        Map<String, Filter> filterMap = new LinkedHashMap<String, Filter>();
        filterMap.put("authc", new MyFormAuthenticationFilter());
        shiroFilterFactoryBean.setFilters(filterMap);

        ConcurrentHashMap<String,String>  map = new ConcurrentHashMap<String, String>();
        map.put("/order","authc");
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
