package com.yuan.reflect;

import org.junit.Test;

import com.yuan.reflect.annotation.AnnotationBase;

public class BaseTest {
	
	/**
	 * 通过反射的机制创建对象
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void getClassName() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		TestReflect t = new TestReflect();
		t.newClass();
	}
	/**
	 * 通过反射获取方法名
	 */
	@Test
	public void methodName() {
		TestReflect t = new TestReflect();
		t.getMethodName();
	}
	
	
	/**
	 * 通过反射给字段赋值
	 * @throws Exception 
	 */
	@Test
	public void value() throws Exception {
		TestReflect t = new TestReflect();
		t.initAttributions();
	}
	
	/**
	 * 通过反射给字段赋值
	 * @throws Exception 
	 */
	@Test
	public void annotationValue() throws Exception {
		TestReflect t = new TestReflect();
		t.annotation(AnnotationBase.class);
		t.annotation("com.yuan.reflect.annotation.AnnotationBase");
	}
}
