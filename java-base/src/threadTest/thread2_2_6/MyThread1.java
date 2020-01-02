package threadTest.thread2_2_6;

import lombok.ToString;

/**
 * @Author: lsg
 * @Date: 2019/12/30 17:48
 * @Description:
 */
@ToString(callSuper = true)
public class MyThread1 extends Thread {
    private Task task;
    public MyThread1(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
    }
}
