package com.ssl.springbootvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssl.springbootvue.dao")
public class SpringbootvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootvueApplication.class, args);
    }
}
