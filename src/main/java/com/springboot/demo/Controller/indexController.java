package com.springboot.demo.Controller;


import com.springboot.demo.Bean.BlogProperties;
import com.springboot.demo.Bean.TestConfigBean;
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
        return testConfigBean.getName()+"---"+testConfigBean.getAge();
    }

}
