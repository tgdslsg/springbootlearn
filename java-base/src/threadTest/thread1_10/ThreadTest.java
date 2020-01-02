package threadTest.thread1_10;

/**
 * @Author: lsg
 * @Date: 2019/12/24 14:14
 * @Description:
 */
public class ThreadTest  {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.setPriority(9);
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.setPriority(1);
        thread2.start();
    }
}
