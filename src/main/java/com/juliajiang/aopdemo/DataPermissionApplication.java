package com.juliajiang.aopdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.juliajiang.aopdemo.*.domain.mapper")
public class DataPermissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataPermissionApplication.class, args);
    }

}
