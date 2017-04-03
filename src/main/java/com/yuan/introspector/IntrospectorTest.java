package com.yuan.introspector;

import java.beans.*;
import java.lang.reflect.Method;

/**
 * Created by 袁恩光 on 2017/4/3.
 */
public class IntrospectorTest {

    public static void main(String[] args) throws Exception {
        Bean bean = new Bean();
        bean.setName("袁恩光");
        bean.setAge("18");
        BeanInfo beanInfo = Introspector.getBeanInfo(Bean.class, Bean.class.getSuperclass());
        //开始自省

        /*
        * BeanInfo.getMethodDescriptors()
        * 用于获取该Bean中的所有允许公开的成员方法，以MethodDescriptor数组的形式返回
        *
        * MethodDescriptor类
        * 用于记载一个成员方法的所有信息
        * MethodDescriptor.getName()
        * 获得该方法的方法名字
        * MethodDescriptor.getMethod()
        * 获得该方法的方法对象（Method类）
        *
        * Method类
        * 记载一个具体的的方法的所有信息
        * Method.getParameterTypes()
        * 获得该方法所用到的所有参数，以Class数组的形式返回
        *
        * Class..getName()
        * 获得该类型的名字
        */
        String methodInfo = "";
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
        for (MethodDescriptor methodDescriptor : methodDescriptors) {
            System.out.println("方法名:" + methodDescriptor.getMethod().getName());
            System.out.println("displayName:" + methodDescriptor.getDisplayName());
            System.out.println("shortDescription:" + methodDescriptor.getShortDescription());
        }


        /*
        * BeanInfo.getPropertyDescriptors()
        * 用于获取该Bean中的所有允许公开的成员属性，以PropertyDescriptor数组的形式返回
        *
        * PropertyDescriptor类
        * 用于描述一个成员属性
        *
        * PropertyDescriptor.getName()
        * 获得该属性的名字
        *
        * PropertyDescriptor.getPropertyType()
        * 获得该属性的数据类型，以Class的形式给出
        *
        */
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            System.out.println(propertyDescriptor.getName());
            Method method = propertyDescriptor.getReadMethod();
            Object object = method.invoke(bean);
            System.out.println(object);
            Method method1 = propertyDescriptor.getWriteMethod();
            method1.invoke(bean, "小米");
            System.out.println(bean.toString());
        }


        EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();
        System.out.println(eventSetDescriptors.length);
        for (EventSetDescriptor eventSetDescriptor : eventSetDescriptors) {
            System.out.println(eventSetDescriptor.getName());
        }
    }


}
