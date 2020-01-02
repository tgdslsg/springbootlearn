package threadTest.thread2_2_12;

/**
 * @Author: lsg
 * @Date: 2019/12/27 15:15
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        try {
            DealThread dealThread = new DealThread();
            dealThread.setUserName("a");
            Thread thread1  = new Thread(dealThread);
            thread1.start();
            Thread.sleep(200);

            dealThread.setUserName("b");
            Thread thread2 = new Thread(dealThread);
            thread2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
