package com.yuan.reflect;

import com.yuan.reflect.method.MethodMethod;
import org.junit.Test;

/**
 * Created by 袁恩光 on 2016/8/26.
 */
public class MethodTest {

    @Test
    public void testMethod() throws Exception{
        MethodMethod methodMethod = new MethodMethod();
        methodMethod.initMethodReflect();
    }
}
