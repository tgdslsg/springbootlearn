package service;

/**
 * @Author: lsg
 * @Date: 2019/12/27 10:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();
        for (int i = 0; i < 10; i++) {

            threadService.schedule(new CallbacksHandler() {
                @Override
                public void onSuccess(int count) throws Exception {
                    System.out.println("处理成功");
                }

                @Override
                public void onFail(int count) throws Exception {
                    System.out.println("处理失败");
                }

                @Override
                public void onUnknown(int count) throws Exception {
                    System.out.println("处理未知");
                }
            });
        }
    }
}
