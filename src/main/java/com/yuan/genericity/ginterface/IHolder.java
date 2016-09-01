package com.yuan.genericity.ginterface;

public interface IHolder<T> {
	//上面的 <T> 和下面的T 是同一种类型
	T next();
}
