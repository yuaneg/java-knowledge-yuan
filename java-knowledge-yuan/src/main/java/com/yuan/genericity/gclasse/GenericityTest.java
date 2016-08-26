package com.yuan.genericity.gclasse;

public class GenericityTest {
	
	public static void main(String[] args) {
		Holder<String> holder = new Holder<String>("hello world");
		Holder<Integer> holder2 = new Holder<Integer>(1);
		System.out.println(holder.toString()+holder2.toString());
		
	}
}
