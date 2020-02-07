package threadTest.thread2_3_3;

/**
 * @Author: lsg
 * @Date: 2020/1/9 14:21
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRuning(false);
            System.out.println("给run赋值未false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
