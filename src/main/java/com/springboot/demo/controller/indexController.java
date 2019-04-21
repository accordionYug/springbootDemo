package com.springboot.demo.controller;


import com.springboot.demo.bean.BlogProperties;
import com.springboot.demo.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index(){
       // return blogProperties.getName()+"---"+blogProperties.getTitle();
        return testConfigBean.getName()+"---"+testConfigBean.getAge();
    }

}
