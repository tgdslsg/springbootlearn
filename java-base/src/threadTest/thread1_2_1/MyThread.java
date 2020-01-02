package threadTest.thread1_2_1;

/**
 * @Author: lsg
 * @Date: 2019/12/17 14:39
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int time = (int)Math.random()*1000;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run ->"+Thread.currentThread().getName());
        }

        Thread.currentThread().setName("MyThread");
        System.out.println("执行"+Thread.currentThread().getName()+"线程！！！");
    }
}
