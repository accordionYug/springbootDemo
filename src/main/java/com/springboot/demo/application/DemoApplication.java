package com.springboot.demo.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableConfigurationProperties({TestConfigBean.class})
@MapperScan("com.springboot.demo.dao")
public class DemoApplication {

//    @RequestMapping("/")
//    String index(){
//        return "hello spring boot";
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
