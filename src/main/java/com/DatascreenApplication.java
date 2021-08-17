package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author lyh
 * @date 2021-08-10
 */
@MapperScan("com.sz.mapper")
@SpringBootApplication
public class DatascreenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatascreenApplication.class, args);
    }

}
