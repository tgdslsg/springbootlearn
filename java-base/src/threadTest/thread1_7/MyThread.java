package threadTest.thread1_7;

/**
 * @Author: lsg
 * @Date: 2019/12/23 11:27
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            System.out.println("i ->"+i);

        }
    }
}
