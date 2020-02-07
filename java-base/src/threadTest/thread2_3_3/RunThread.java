package threadTest.thread2_3_3;

/**
 * @Author: lsg
 * @Date: 2020/1/9 14:16
 * @Description:
 */
public class RunThread extends Thread {
    private volatile boolean isRuning=true;
    public boolean isRuning(){
        return isRuning;
    }
    public void setRuning(boolean runing){
        this.isRuning = runing;
    }

    @Override
    public void run() {
        System.out.println("进入run：");
        while (isRuning==true){
        }
        System.out.println("线程被停止了");
    }
}
