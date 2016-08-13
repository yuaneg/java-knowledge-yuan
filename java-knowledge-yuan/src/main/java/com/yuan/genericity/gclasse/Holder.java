package com.yuan.genericity.gclasse;

public class Holder<T> {
	private T t;

	public Holder(T t) {
		this.t = t;
	}

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	@Override
	public String toString() {
		return "Holder [t=" + t + "]";
	}

}
