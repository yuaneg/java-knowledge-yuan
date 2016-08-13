package com.yuan.genericity.ginterface;

// 第一个<T> 规定 IHolderImpl 的泛型    第二个<T> 是引用的第一个T  
public class IHolderImpl<T> implements IHolder<T> {
	
	
	//定义T 对象----- 第一个<T>
	private T t;
	
	
	public IHolderImpl(T t) {
		this.t= t;
	}
	
	@Override
	public T next() {
		
		return this.t;
	}
	

}
