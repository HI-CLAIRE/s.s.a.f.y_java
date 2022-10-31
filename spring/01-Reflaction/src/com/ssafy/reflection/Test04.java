package com.ssafy.reflection;

import java.lang.reflect.Method;

public class Test04 {

	public static void main(String[] args) {
		Class<?> c = Cat.class;
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods) {
			Class<?> returnType = m.getReturnType();
			if(returnType == void.class) {
				System.out.println(m.getName());
			}
		}

	}

}
