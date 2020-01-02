package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static javax.print.attribute.standard.MediaSizeName.C;

/**
 * @Author: lsg
 * @Date: 2020/1/2 11:08
 * @Description:
 */
public  class PrintSuperUtil {
    /**
     * @param O 传入对象
     * @return  返回对象字段数组
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
