package com.ssafy.annotation.test03;

import java.lang.annotation.Annotation;

public class Test {
	public static void main(String[] args) {
		Class<?> c = Cat.class;
		
//		Annotation[] annos = c.getAnnotations();
//		for(Annotation a : annos) {
//			System.out.println(a);
//		}
		
		// 클래스에서 reflection으로 어노테이션 정보를 얻어올 때는
		// 어노테이션의 타입을 그대로 사용
		RuntimeAnnotation ra = c.getAnnotation(RuntimeAnnotation.class);
		System.out.println(ra);
		System.out.println(ra.value());
		// @RequestMapping("/dsf")
		ClassAnnotation ca = c.getAnnotation(ClassAnnotation.class);
		System.out.println(ca);
		
	}
}
