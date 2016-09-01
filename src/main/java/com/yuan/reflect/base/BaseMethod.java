package com.yuan.reflect.base;

import java.lang.reflect.Method;

public class BaseMethod {
	/**
	 * 通过反射的机制创建对象
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public void newClass() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class<?> cls = Class.forName("com.yuan.reflect.base.Base");
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




}
