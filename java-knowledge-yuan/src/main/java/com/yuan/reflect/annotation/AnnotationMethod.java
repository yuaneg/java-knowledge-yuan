package com.yuan.reflect.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.yuan.reflect.base.Base;
import com.yuan.reflect.annotation.MyValue;

public class AnnotationMethod {

	/**
	 * 通过反射给字段赋值
	 *
	 * @throws Exception
	 */
	public void initAttributions() throws Exception {
		Class<?> cls = Class.forName("com.yuan.reflect.base.Base");
		Base base = (Base) cls.newInstance();
		Field field = cls.getDeclaredField("name");
		// 暴力访问私有属性
		field.setAccessible(true);
		// 给属性赋值
		field.set(base, "袁恩光");
		Field field2 = cls.getDeclaredField("age");
		field2.setAccessible(true);
		field2.set(base, "18");
		System.out.println(base.toString());
	}

	/**
	 * 通过反射 读取注解给字段赋值
	 *
	 * @throws Exception
	 */
	private void annotationTest(Class<?> cls) throws Exception {
		Object obj = cls.newInstance();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			MyValue myvalue = field.getAnnotation(MyValue.class);
			if (null != myvalue) {
				// 暴力访问私有属性
				field.setAccessible(true);
				// String
				if (field.getGenericType().equals(String.class)) {
					field.set(obj, myvalue.value());
				}
				// Integer
				if (field.getGenericType().equals(int.class) || field.getGenericType().equals(Integer.class)) {
					field.set(obj, Integer.valueOf(myvalue.value()));
				}
				// Long
				if (field.getGenericType().equals(long.class) || field.getGenericType().equals(Long.class)) {
					field.set(obj, Long.valueOf(myvalue.value()));
				}
				// boolean
				if (field.getGenericType().equals(boolean.class) || field.getGenericType().equals(Boolean.class)) {
					if (Integer.valueOf(myvalue.value()) == 0) {
						field.set(obj, false);
					} else {
						field.set(obj, true);
					}
				}
				// Double
				if (field.getGenericType().equals(double.class) || field.getGenericType().equals(Double.class)) {
					field.set(obj, Double.valueOf(myvalue.value()));
				}
				// Float
				if (field.getGenericType().equals(float.class) || field.getGenericType().equals(Float.class)) {
					field.set(obj, Float.valueOf(myvalue.value()));
				}
				// byte
				if (field.getGenericType().equals(byte.class) || field.getGenericType().equals(Byte.class)) {
					field.set(obj, Byte.valueOf(myvalue.value()));
				}
				// short
				if (field.getGenericType().equals(short.class) || field.getGenericType().equals(Short.class)) {
					field.set(obj, Short.valueOf(myvalue.value()));
				}
			}
		}
		System.out.println(obj.toString());
	}

	public void annotation(Class<?> cls) throws Exception{
		annotationTest(cls);
	}
	public void annotation(String name) throws Exception {
		annotationTest(Class.forName(name));
	}


}
