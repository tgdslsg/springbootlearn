package threadTest.thread2_2_12;

/**
 * @Author: lsg
 * @Date: 2019/12/27 15:01
 * @Description:
 */
public class DealThread implements Runnable {

    public String userName;
    Object lock1 = new Object();
    Object lock2 = new Object();
    public void setUserName(String userName){
        this.userName = userName;
    }

    @Override
    public void run() {
        if("a".equals(userName)){
            synchronized (lock1){
                System.out.println("username ="+userName);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock1 --> lock2");
                }
            }
        }
        if ("b".equals(userName)){
            synchronized (lock2){
                System.out.println("username ="+userName);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("lock2 --> lock1");
                }
            }
        }

    }
}
