package com.yuan.reflect.annotation;

public class AnnotationBase {

	@MyValue("袁恩光")
	private String name;

	@MyValue("18")
	private int age;

	@MyValue("119")
	private Long age2;

	@MyValue("119")
	private long age3;

	@MyValue("1")
	private byte byten;

	@MyValue("0")
	private boolean booleant;

	@MyValue("1")
	private boolean booleant2;

	@Override
	public String toString() {
		return "AnnotationBase [name=" + name + ", age=" + age + ", age2=" + age2 + ", age3=" + age3 + ", byten="
				+ byten + ", booleant=" + booleant + ", booleant2=" + booleant2 + "]";
	}

}
