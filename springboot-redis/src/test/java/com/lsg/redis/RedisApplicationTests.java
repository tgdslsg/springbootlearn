//package com.lsg.redis;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class RedisApplicationTests {
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Test
//    public void set() {
//        redisTemplate.opsForValue().set("test1","value1_for_test1");
//        redisTemplate.opsForHash().put("hash1","hashkey1","hashvalue1");
//        System.out.println(redisTemplate.opsForValue().get("test1"));
//        System.out.println(redisTemplate.opsForHash().get("hash1","hashkey1"));
//
//    }
//
//}
