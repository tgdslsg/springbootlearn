package com.lsg.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: lsg
 * @Date: 2019/8/14 14:37
 * @Description:
 */

@Slf4j
@Aspect
@Component
public class LogAspect {

    /**
     * 抽取公共的切入点表达式
     * 1.本类的引用
     * 2.其他的切面引用
     */
    @Pointcut(value = "execution(public String first (..))")
    public void printlog(){}

//    @Before("printlog()")
//    public void logbefore() {
//        log.info("before -- 前置通知  我在first方法之前执行");
//    }


//    @After("printlog()")
//    public void logend(){
//        log.info("after -- 后置通知  我在first方乏之后执行");
//    }
//
//    @AfterReturning("printlog()")
//    public void logReturn(){
//        log.info("AfterReturning -- 返回通知");
//    }

    @AfterThrowing(throwing = "e",pointcut = "printlog()")
    public void logThrow(JoinPoint joinPoint, Throwable e){
        log.info("@AfterThrowing -- 异常返回  背锅侠");
        log.info("Method name"+joinPoint.getSignature().getName()+"   错误信息"+e.getMessage());
    }

//    ThreadLocal<Long> startTime = new ThreadLocal<>();
//    @Around("printlog()")
//    public String logStartAndEnd(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        startTime.set(System.currentTimeMillis());
//        log.info("----------环绕通知--------------");
//        String str;
//        try {
//            //执行
//            str = (String) proceedingJoinPoint.proceed();
//            log.info("方法返回值："+str);
//            log.info(proceedingJoinPoint.getSignature().getName()+"方法耗时为："+(System.currentTimeMillis()-startTime.get()));
//        }catch (Throwable throwable){
//            str = throwable.toString();
//        }
//        return str;
//    }

}
