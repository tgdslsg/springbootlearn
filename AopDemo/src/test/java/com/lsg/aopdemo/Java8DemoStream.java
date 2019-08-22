package com.lsg.aopdemo;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;
import javafx.print.Collation;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: lsg
 * @Date: 2019/8/19 14:15
 * @Description:
 */
public class Java8DemoStream {
    public static void main(String[] args) {
         /*
        stream  流
        两种stream的差别

        stream()是串行执行的，parallelStream()是并行执行的，
        所以如果parallelStream()执行对象是线程不安全的会有问题，
        可以选用线程安全的类使用  (时间用Java8的LocalDate和LocalDateTime)*/

        List<String> stringList = Arrays.asList("a", "b", "c", "d");
        List<String> filtered = stringList.stream().filter(String -> !String.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::print);

        List<Integer> nums = Arrays.asList(2,34,5,6,7,84,24,64);
        List<Integer> squaresList = nums.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
        System.out.println("-----------------   大于300  ------------------");
        List<Integer> numss = squaresList.stream().filter(integer -> integer>300).collect(Collectors.toList());
        numss.forEach(System.out::println);

        Random random = new Random();
        random.ints().limit(50).sorted().forEach(System.out::println);



          List<Integer> lists = Arrays.asList(5,6,7,8,2,3,1,3,7,0,7);
          int count1 = (int) lists.stream().filter(i -> i>5).count();
          int count2 = (int) lists.parallelStream().filter(i -> i>5).count();
        System.out.println(count1+"--"+count2);

        List<String> listss = Arrays.asList("a","b","c","d","e","f","0","","","2","");
        List<String> list1 = listss.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
        System.out.println(list1);
        String list2 = listss.stream().filter(i -> !i.isEmpty()).collect(Collectors.joining(","));
        System.out.println(list2);

    }

}