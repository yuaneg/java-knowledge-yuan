package com.yuan.reflect.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target(value = {ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface MyValue {

	String value() default "";

}
