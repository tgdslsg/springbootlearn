package threadTest.synchronized_;

/**
 * @Author: lsg
 * @Date: 2019/12/6 11:23
 * @Description:
 */
public class SynchronizedTest1 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("当前执行线程：" + Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            a++;
        }
        System.out.println("线程执行完成后，a值为：" + a);
    }

    static SynchronizedTest1 synchronizedTest1 = new SynchronizedTest1();
    static int a=0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(synchronizedTest1);
        Thread thread2 = new Thread(synchronizedTest1);
        thread1.start();
        thread2.start();



    }
}
