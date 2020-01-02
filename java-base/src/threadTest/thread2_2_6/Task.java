package threadTest.thread2_2_6;

/**
 * @Author: lsg
 * @Date: 2019/12/30 17:41
 * @Description:
 */
public class Task {
    public void otherMethod(){
        System.out.println(":--run---otherMethod");
    }
    public void doMethod(){
        synchronized (this){
            for (int i = 0; i < 100000; i++) {
                System.out.println("synchronized thread Name:"+Thread.currentThread().getName()+"- i:"+i);
            }
        }
    }
}
