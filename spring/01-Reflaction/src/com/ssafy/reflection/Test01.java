package com.ssafy.reflection;

public class Test01 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c1 = Cat.class;
		
		Cat cat = new Cat();
		Class<?> c2 = cat.getClass();
		
		Class<?> c3 = Class.forName("com.ssafy.reflection.Cat");
		
		System.out.println(c1.getName());
		System.out.println(c1 == c2);
		System.out.println(c3 == c2);
		
		
	}

}
