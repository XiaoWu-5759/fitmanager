package com.simba.fitmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.simba.fitmanager.mapper")
public class FitmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitmanagerApplication.class, args);
    }

}
