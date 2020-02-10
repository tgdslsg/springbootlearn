package util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: lsg
 * @Date: 2020/1/2 11:08
 * @Description:  打印父类对象有值参数
 */
public  class PrintSuperUtil {
    /**
     * @param O 传入对象
     * @return  返回对象非空字段valuse
     */
    private static String[] getNames(Object O){
        Field[]  fields = O.getClass().getDeclaredFields();
        String[] strings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            strings[i]=fields[i].getName();
        }
        return strings;
    }

    private static Object getValueByName(Object o,String s) throws Exception {
        String firstWord = s.substring(0,1).toUpperCase();
        String getter = "get"+firstWord+s.substring(1);
        Method getMethod = o.getClass().getMethod(getter,new Class[] {});
        Object ro = getMethod.invoke(o,new Object[] {});
        return ro;
    }
    public static String printObject(Object o){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String[] strings = getNames(o);
            for (int i = 0; i < strings.length; i++) {
                Object object = getValueByName(o,strings[i]);
                if(object==null){
                    continue;
                }
                try {
                    stringBuffer.append(strings[i]+":"+object+",");
                } catch (Exception e) {
                    e.printStackTrace();
                    return "处理"+strings[i]+"字段出错";
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return  "PrintSuperUtil处理出错："+stringBuffer.toString();
        }
        return stringBuffer.toString();
    }
}
