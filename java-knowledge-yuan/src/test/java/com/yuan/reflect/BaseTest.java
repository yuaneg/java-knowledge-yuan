package com.yuan.reflect;

import com.yuan.reflect.base.BaseMethod;
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
		BaseMethod t = new BaseMethod();
		t.newClass();
	}
	/**
	 * 通过反射获取方法名
	 */
	@Test
	public void methodName() {
        BaseMethod t = new BaseMethod();
		t.getMethodName();
	}


}
