package service;

/**
 * @Author: lsg
 * @Date: 2019/12/27 10:37
 * @Description:
 */
public interface CallbacksHandler {
    public void onSuccess(int count) throws Exception;
    public void onFail(int count) throws Exception;
    public void onUnknown(int count) throws Exception;
}
