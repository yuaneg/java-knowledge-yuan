package com.yuan.reflect;

import com.yuan.reflect.annotation.AnnotationBase;
import com.yuan.reflect.annotation.AnnotationBase2;
import com.yuan.reflect.annotation.AnnotationMethod;
import org.junit.Test;

/**
 * Created by 袁恩光 on 2016/8/26.
 */
public class AnnotationTest {

    /**
     * 通过反射给字段赋值
     * @throws Exception
     */
    @Test
    public void value() throws Exception {
        AnnotationMethod t = new AnnotationMethod();
        t.initAttributions();
    }

    /**
     * 通过反射给字段赋值
     * @throws Exception
     */
    @Test
    public void annotationValue() throws Exception {
        AnnotationMethod t = new AnnotationMethod();
        t.annotation(AnnotationBase.class);
        t.annotation("com.yuan.reflect.annotation.AnnotationBase");
        t.annotation(AnnotationBase2.class);
    }

}
