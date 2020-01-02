package threadTest.thread1_0;

/**
 * @Author: lsg
 * @Date: 2019/12/25 11:44
 * @Description:
 */
public class MyThread extends Thread {
    private int n = 5;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"---------");
            System.out.println(Thread.currentThread().getName()+"余票"+n+"张！！！");
            super.run();
            System.out.println(Thread.currentThread().getName()+"售第 "+(5-n+1)+" 张票！！！");
            n--;
        }
    }
}
