package com.springboot.demo.controller;

import com.springboot.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserCacheController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    @Autowired
    public UserCacheController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    //使用@Cacheable注解 将数据库查询出来的值放入缓存中
    @Cacheable(value = "users",key = "#userId", unless = "#result.money<10000")
    @RequestMapping(value = "/userchche/{userId}",method = RequestMethod.GET)
    public Object getUser(@PathVariable Long userId){
        logger.info("获取user信息根据ID->{}",userId);
        return userRepository.findById(userId);
    }

    //使用@CachePut注解 数据库值更新时  缓存也更新

    //使用@CacheEvict注解 数据库值删除时 缓存中也删除
}
