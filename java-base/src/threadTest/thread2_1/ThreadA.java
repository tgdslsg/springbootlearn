package threadTest.thread2_1;

/**
 * @Author: lsg
 * @Date: 2019/12/24 16:25
 * @Description:
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum){
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addi("a");
    }

}
