package com.yuan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.yuan.reflect.annotation.AnnotationBase;
import com.yuan.reflect.annotation.MyValue;

public class TestReflect {
	/**
	 * 通过反射的机制创建对象
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public void newClass() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class<?> cls = Class.forName("com.yuan.reflect.Base");
		System.out.println(cls.getSimpleName());
		// 对象创建
		Base base = (Base) cls.newInstance();
		base.method();
	}

	/**
	 * 通过反射获取方法名
	 */
	public void getMethodName() {
		Class<?> cls = Base.class;
		Method[] method = cls.getMethods();
		for (Method m : method) {
			System.out.println(m.getName());
		}
	}

	/**
	 * 通过反射给字段赋值
	 * 
	 * @throws Exception
	 */
	public void initAttributions() throws Exception {
		Class<?> cls = Class.forName("com.yuan.reflect.Base");
		Base base = (Base) cls.newInstance();
		Field field = cls.getDeclaredField("name");
		// 暴力访问私有属性
		field.setAccessible(true);
		// 给属性赋值
		field.set(base, "袁恩光");
		Field field2 = cls.getDeclaredField("age");
		field2.setAccessible(true);
		field2.set(base, "18");
		System.out.println(base.toString());
	}

	/**
	 * 通过反射 读取注解给字段赋值
	 * 
	 * @throws Exception
	 */
	public void annotationTest() throws Exception {
		Class<?> cls = AnnotationBase.class;
		Object obj = cls.newInstance();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			MyValue myvalue = field.getAnnotation(MyValue.class);
			if (null != myvalue) {
				// 暴力访问私有属性
				field.setAccessible(true);
				if (field.getGenericType().equals(String.class)) {
					field.set(obj, myvalue.value());
				}
				if (field.getGenericType().equals(int.class) || field.getGenericType().equals(Integer.class)) {
					field.set(obj, Integer.valueOf(myvalue.value()));
				}
			}
		}
		System.out.println(obj.toString());
	}
}
