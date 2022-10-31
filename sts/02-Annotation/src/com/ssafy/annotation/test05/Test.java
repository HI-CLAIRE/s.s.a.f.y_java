package com.ssafy.annotation.test05;

public class Test {
	public static void main(String[] args) {
		classtest();
		methodtest();
	}

	public static void classtest() {
		// Cat 클래스의 3개의 어노테이션의 이름과, 어노테이션이 갖고 있는 value를 출력하시오.
		Class<?> c = Cat.class;
		RuntimeAnnotation1 a1 = c.getAnnotation(RuntimeAnnotation1.class);
		RuntimeAnnotation2 a2 = c.getAnnotation(RuntimeAnnotation2.class);
		RuntimeAnnotation3 a3 = c.getAnnotation(RuntimeAnnotation3.class);
		System.out.println(a1 + "'s value: " + a1.value());
		System.out.println(a2 + "'s value: " + a2.value());
		System.out.println(a3 + "'s value: " + a3.value());
	}
	
	public static void methodtest() {
		// getName의 3개의 어노테이션의 이름과, 어노테이션이 갖고 있는 value를 출력하시오.
		
	}
}
