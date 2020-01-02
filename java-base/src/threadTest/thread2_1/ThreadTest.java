package threadTest.thread2_1;

/**
 * @Author: lsg
 * @Date: 2019/12/24 16:30
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();

        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();

    }
}
