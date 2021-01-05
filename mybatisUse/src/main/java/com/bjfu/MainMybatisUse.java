package com.bjfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bjfu")
public class MainMybatisUse {
    public static void main(String[] args) {
        SpringApplication.run(MainMybatisUse.class, args);
    }
}
