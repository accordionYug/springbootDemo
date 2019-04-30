package com.springboot.demo;

import com.springboot.demo.config.RedisConfig;
import com.springboot.demo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() throws Exception{
        stringRedisTemplate.opsForValue().set("aaa","111");
        Assert.assertEquals("111",stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void testObj() throws Exception{
        User user = new User("geyu",1111);
        ValueOperations<String,User> operations = redisTemplate.opsForValue();

        operations.set("com.geyu",user);
        operations.set("com.accor",user,1, TimeUnit.SECONDS);
        Thread.sleep(1000);

        boolean exists = redisTemplate.hasKey("com.accor");
        if (exists){
            System.out.println("true");
            System.out.println(operations.get("com.accor"));
        }else{
            System.out.println("false");
            System.out.println(operations.get("com.geyu"));
        }
    }
}
