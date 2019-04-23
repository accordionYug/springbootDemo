package com.springboot.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 过滤器 拦截器
 */

@RestController
@RequestMapping("userfilinter")
public class UserFilterInterController {

    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id){
        System.out.println(id);
    }
}
