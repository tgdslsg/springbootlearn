package threadTest.thread2_1_5;

/**
 * @Author: lsg
 * @Date: 2019/12/24 17:14
 * @Description:
 */
public class PublicVar {
    public String name     = "a";
    public String password = "aa";

    public synchronized void setValue(String name, String password) {
        this.name = name;
        this.password = password;
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getPassword(){
        System.out.println("name:"+name+"-> password:"+password);
    }

}
