package threadTest.thread2_1_4;

/**
 * @Author: lsg
 * @Date: 2019/12/25 11:14
 * @Description:
 */
public class MyObject {
    synchronized public void method(){
        try {
            System.out.println("begin method ThreadName "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
