package com.dingdang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dingdang.mapper")
public class SpringBootPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootPlusApplication.class,args);
    }
}
