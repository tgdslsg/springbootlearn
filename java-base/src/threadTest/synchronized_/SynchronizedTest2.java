package threadTest.synchronized_;

/**
 * @Author: lsg
 * @Date: 2019/12/6 14:01
 * @Description:
 */
public class SynchronizedTest2 implements Runnable {
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
        for (int i = 0; i < 1000; i++) {
            a++;
        }
    }
    static int a;
    public static void main(String[] args) {
        Thread ta = new Thread();
        Thread tb = new Thread();
        ta.start();
        tb.start();
        System.out.println("a:"+a);
    }

}
