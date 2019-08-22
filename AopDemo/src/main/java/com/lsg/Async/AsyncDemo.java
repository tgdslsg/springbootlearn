package com.lsg.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @Author: lsg
 * @Date: 2019/8/20 15:38
 * @Description:
 */
@Component
public class AsyncDemo {

//  执行后输出为 [task-1]  不是 main  表明开辟了新线程在执行
    @Async
    public void noreturn(){
        System.out.println("当前线程名称："+Thread.currentThread().getName());
    }
    @Async
    public Future<String> asyncReturn(){
        System.out.println("当前线程名称："+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
            return new AsyncResult<String>("asyncReturn ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
