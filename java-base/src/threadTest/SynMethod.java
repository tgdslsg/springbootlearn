package threadTest;

/**
 * @Author: lsg
 * @Date: 2019/11/22 13:48
 * @Description:
 */
public class SynMethod {
    private static final Object staticLockObject = new Object();

    /**
     * 对象锁，代码级别，同一对象争用该锁，this是指调用method1的对象，synchronized的锁就绑定在该对象上
     */
    public void method1(){
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+ "synchrnized loop"+i);
            }
        }
    }

    /**
     * 对象锁，方法级别，同一对象争用该锁，
     */
    public synchronized void method2(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"synchrnized loop"+i);
        }
    }

}
