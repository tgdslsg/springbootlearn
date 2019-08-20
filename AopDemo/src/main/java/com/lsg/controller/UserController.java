package com.lsg.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lsg
 * @Date: 2019/8/14 14:37
 * @Description:
 */

@RestController
@Slf4j
public class UserController  {

    @GetMapping("/hello")
    public String hello(){
        return "hello!!!";
    }

    @PostMapping("/first")
    public String first(@RequestBody JSONObject jsonParam){
        log.info("执行first方法");
        return jsonParam.toJSONString();
    }
    @RequestMapping("/doError")
    public Object error() {
        try {
            int a = 1/0;
        }catch (Exception e){
            throw e;
        }
        return 1 / 0;
    }

    @RequestMapping("/second")
    public String second() {
        return "second controller";
    }
}
