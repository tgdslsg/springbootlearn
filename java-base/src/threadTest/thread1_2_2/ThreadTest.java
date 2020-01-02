package threadTest.thread1_2_2;

import threadTest.thread1_2_1.MyThread;

/**
 * @Author: lsg
 * @Date: 2019/12/17 14:41
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {

        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();
        System.out.println("--------程序结束--------");
    }
}
