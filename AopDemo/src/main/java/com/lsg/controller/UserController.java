package com.lsg.controller;

import com.alibaba.fastjson.JSONObject;
import com.lsg.Async.AsyncDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Author: lsg
 * @Date: 2019/8/14 14:37
 * @Description:
 */

@RestController
@Slf4j
public class UserController  {

    @Autowired
    private AsyncDemo asyncDemo;

    @GetMapping("/hello")
    public String hello(){
        asyncDemo.noreturn();
        Future<String> stringFuture =  asyncDemo.asyncReturn();

        try {
            while (true){
                if(stringFuture.isDone()){
                    System.out.println(stringFuture.get());
                    break;
                }
                System.out.println("contenuer");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return stringFuture.toString();
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
