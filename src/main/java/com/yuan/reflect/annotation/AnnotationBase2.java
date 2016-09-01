package com.yuan.reflect.annotation;

public class AnnotationBase2 {
	@MyValue("袁恩光")
	private String name;
	@MyValue("123")
	private String pass;
	@MyValue("18")
	private Long age;
	@MyValue("1")
	private boolean gender;

	@Override
	public String toString() {
		return "AnnotationBase2 [name=" + name + ", pass=" + pass + ", age=" + age + ", gender=" + gender + "]";
	}

}
