package com.lsg.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

/**
 * @Author: lsg
 * @Date: 2019/8/16 15:53
 * @Description:
 */
@Slf4j
@Service
public class UserService {

    @Async
    public void  sendSMS(){
           log.info("------1-----");
        IntStream.range(0,5).forEach(d ->{
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        });


    }
}
