package com.yuan.reflect.method;

import com.yuan.reflect.annotation.MyValue;

/**
 * Created by 袁恩光 on 2016/8/26.
 */
public class MethodBase {

    public void say(@MyValue("袁恩光") String name){
        System.out.println(name);
    }


    public String say(){
       return "hello world";
    }
}
