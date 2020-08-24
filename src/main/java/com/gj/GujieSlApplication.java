package com.gj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gj.mapper")
public class GujieSlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GujieSlApplication.class, args);
    }

}
