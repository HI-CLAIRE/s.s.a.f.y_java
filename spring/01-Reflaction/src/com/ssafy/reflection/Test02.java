package com.ssafy.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class Test02 {

	public static void main(String[] args) {
		Class<?> c = Cat.class;
		System.out.println("Cat의 모든 메서드 출력");
		System.out.println("---");
		Method[] methods = c.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("메서드 이름 : " + method.getName());
			Class<?> returnType = method.getReturnType();
			System.out.println("반환 타입 : " + returnType.getName());

			Parameter[] params = method.getParameters();
			for(Parameter p : params) {
				Type t = p.getParameterizedType();
				System.out.println(" - 파라미터 이름 : " + p.);
			}
		}
		
	}

}
