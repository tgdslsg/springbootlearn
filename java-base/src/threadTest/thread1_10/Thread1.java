package threadTest.thread1_10;

import java.util.Random;

/**
 * @Author: lsg
 * @Date: 2019/12/24 14:10
 * @Description:
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        super.run();
        long s = 0;
        long beginTime = System.currentTimeMillis();
        System.out.println("当前线程"+Thread.currentThread().getName()+"的优先级为："+Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                Random random = new Random();
                int tmp = random.nextInt();
                s+=tmp;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime));
    }
}
