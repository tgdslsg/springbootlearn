package com.lsg.redis.controller;

import com.lsg.redis.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author: lsg
 * @Date: 2019/11/20 14:52
 * @Description:
 */
@Controller
@RequestMapping(value="/redis")
@Slf4j
public class RedisController{
    @Autowired
    RedisUtil redisUtil;

    /**
     * @Description: 执行redis写/读/生命周期
     */
    @RequestMapping(value = "/getRedis",method = RequestMethod.POST)
    @ResponseBody

    public String getRedis(){
        redisUtil.set("keya1","valuea1");
        log.info(redisUtil.get("keya1"));
        return ("执行成功");
    }


}
