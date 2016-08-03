package com.yuan.reflect;

import org.junit.Test;

public class BaseTest {
	
	/**
	 * 通过反射的机制创建对象
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void test() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		TestReflect t = new TestReflect();
		t.newClass();
	}
	/**
	 * 通过反射获取方法名
	 */
	@Test
	public void test2() {
		TestReflect t = new TestReflect();
		t.getMethodName();
	}

}
