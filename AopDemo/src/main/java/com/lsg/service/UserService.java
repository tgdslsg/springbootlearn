package com.lsg.service;

import com.lsg.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

/**
 * @Author: lsg
 * @Date: 2019/8/16 15:53
 * @Description:
 */

public class UserService {

    public User addUserAge(User user){
        User u = new User();
        u.setAge(user.getAge());
        return u;
    }

}
