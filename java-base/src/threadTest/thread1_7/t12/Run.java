package threadTest.thread1_7.t12;

/**
 * @Author: lsg
 * @Date: 2019/12/23 17:43
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            System.out.println("begin ");
            Thread.sleep(20);
            myThread.interrupt();
            System.out.println("end!!");
        } catch (InterruptedException e) {
            System.out.println("catch");
            e.printStackTrace();
        }
    }
}
