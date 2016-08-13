package com.yuan.genericity.ginterface;

public class Test {
	
	public static void main(String[] args) {
		IHolder<String> h = new IHolderImpl<String>("hello world");
		System.out.println(h.next());
	}
	
}
