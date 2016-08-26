package com.yuan.reflect.method;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by 袁恩光 on 2016/8/26.
 */
public class MethodMethod {

    public void initMethodReflect() throws Exception{
        Class cls = MethodBase.class;
        //获得方法实例
        Object object= cls.newInstance();
        //获得方法
        Method method = cls.getDeclaredMethod("say",String.class);
        //执行方法
        method.invoke(object,"hello world");
        Type returType = method.getReturnType();
        if(returType.equals(void.class)){
            System.out.println("方法无返回值");
        }

        Method method1 = cls.getDeclaredMethod("say");
        Object returnObject = method1.invoke(object);
        System.out.println(returnObject.toString());

    }

}
