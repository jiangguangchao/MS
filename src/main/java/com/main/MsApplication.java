package com.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author:jgc
 * @create:2021-03-13 19:10
 */

@MapperScan("com.main.dao")
@SpringBootApplication
public class MsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsApplication.class, args);
    }
}
