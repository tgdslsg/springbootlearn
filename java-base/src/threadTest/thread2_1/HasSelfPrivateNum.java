package threadTest.thread2_1;

/**
 * @Author: lsg
 * @Date: 2019/12/24 16:19
 * @Description:
 */
public class HasSelfPrivateNum {
    private int unm = 0;
    public void addi(String name){
        if("a".equals(name)){
            System.out.println("a set over!");
            unm = 100;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("b set over!");
            unm = 200;
        }
        System.out.println(name+"num="+unm);
    }
}
