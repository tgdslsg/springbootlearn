package threadTest.thread1_0;

/**
 * @Author: lsg
 * @Date: 2019/12/25 11:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThreada = new MyThread();
        myThreada.setName("aaa");
        myThreada.start();
        MyThread myThreadb = new MyThread();
        myThreadb.setName("bbb");
        myThreadb.start();
        MyThread myThreadc = new MyThread();
        myThreadc.setName("ccc");
        myThreadc.start();
    }
}
