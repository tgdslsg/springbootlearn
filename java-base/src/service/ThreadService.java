package service;

import javax.security.auth.callback.CallbackHandler;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lsg
 * @Date: 2019/12/27 10:08
 * @Description:
 */
public class ThreadService {

    public void schedule(CallbacksHandler  callbacksHandler){
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(4);
        SomeTask someTask = new SomeTask();
        someTask.callbacksHandler = callbacksHandler;
        scheduledExecutorService.schedule(someTask,0, TimeUnit.SECONDS);
    }

    private class SomeTask implements Runnable{

        private CallbacksHandler  callbacksHandler;
        @Override
        public void run() {
            try {
                System.out.println("开始执行run方法");
                int[] ints = {1,2,3};
                System.out.println(Math.random());
                int i = (int) Math.floor(Math.random()*10)%3;
                int s = ints[i];
                System.out.println(i+"--"+s);
                if(s==1){
                    callbacksHandler.onSuccess(s);
                }else if(s==2){
                    callbacksHandler.onFail(s);
                }else {
                    callbacksHandler.onUnknown(s);
                }

            }catch (Exception e){
                System.out.println("打印RUN方法异常！");
                e.printStackTrace();
            }
        }
    }

}