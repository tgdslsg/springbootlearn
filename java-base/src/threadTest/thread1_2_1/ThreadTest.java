package threadTest.thread1_2_1;

/**
 * @Author: lsg
 * @Date: 2019/12/17 14:41
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 10; i++) {
            int time = (int)Math.random()*1000;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main -> "+Thread.currentThread().getName());
        }


        System.out.println("--------程序结束--------");
    }
}
