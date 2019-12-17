package com.lsg;

import java.io.File;

/**
 * @Author: lsg
 * @Date: 2019/9/5 18:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String pathname;
        File file = new File("tt/conn");
        System.out.println(file.isFile());
    }
}
