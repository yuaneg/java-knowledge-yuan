package com.yuan.genericity.gmethod;

public class GMethod {
	
	@SuppressWarnings("unchecked")
	//如果要用 T... 需要用到泛型方法  在方法前加上 <T>
	//参数T  是<T> 类型  
	//<T> 类似一个临时变量
	public <T> void next(T... t){
		//for 里面的T 是<T> 定义的临时变量
		for(T t1 : t){
			System.out.println(t1);
		}
	}

	//这种写法报错  T 未被定义
	/*public  void next2(T t){
		
	}*/
}
