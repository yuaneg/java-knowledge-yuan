package com.yuan.reflect.annotation;

public class AnnotationBase {
	
	@MyValue("袁恩光")
	private String name;
	
	@MyValue("18")
	private int age;

	@Override
	public String toString() {
		return "Base [name=" + name + ", age=" + age + "]";
	}
	
	
}
