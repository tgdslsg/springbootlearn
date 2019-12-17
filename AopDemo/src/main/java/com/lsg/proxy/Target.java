package com.lsg.proxy;

import com.lsg.entity.User;

/**
 * @Author: lsg
 * @Date: 2019/9/25 10:11
 * @Description:
 */
public class Target {
    public void userAddAge(User user){
        System.out.println("原年龄为"+user.getAge());
        user.setAge(user.getAge()+1);
        System.out.println("修改后为"+user.getAge());
    }
}
