package entity;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.Period;

import static util.PrintSuperUtil.printObject;

/**
 * @Author: lsg
 * @Date: 2020/1/2 15:54
 * @Description:
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Person person = new Person("TIM",16);

        System.out.println(printObject(person));

    }


}
