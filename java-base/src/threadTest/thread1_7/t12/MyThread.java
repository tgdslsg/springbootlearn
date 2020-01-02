package threadTest.thread1_7.t12;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author: lsg
 * @Date: 2019/12/23 17:41
 * @Description:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 30000; i++) {
                System.out.println("i:"+i);
                if(this.isInterrupted()){

                }


            }
      Thread.sleep(200000);
            System.out.println("for下面的代码");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
