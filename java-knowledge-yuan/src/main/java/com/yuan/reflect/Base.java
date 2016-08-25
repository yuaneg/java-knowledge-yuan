package com.yuan.reflect;

public class Base {

	private String name;
	private String age;

	public void method() {
		System.out.println("meijiao");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Base [name=" + name + ", age=" + age + "]";
	}
	
	

}
