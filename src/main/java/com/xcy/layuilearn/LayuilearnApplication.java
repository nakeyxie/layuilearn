package com.xcy.layuilearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xcy.layuilearn.mapper")
public class LayuilearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuilearnApplication.class, args);
    }

}
