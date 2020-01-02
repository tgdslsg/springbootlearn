package threadTest.thread1_7;

/**
 * @Author: lsg
 * @Date: 2019/12/23 11:33
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("启动线程！！！");
        myThread.start();
        try {
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main 中断 !!!");
            e.printStackTrace();
        }

    }
}
