package com.wenyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wenyang.mapper")
public class JinchengApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinchengApplication.class, args);
    }

}
