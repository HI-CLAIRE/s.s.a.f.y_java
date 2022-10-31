package com.ssafy.annotation.test02;

//@MyAnnotation
public class Cat {
//	@MyAnnotation
	private String name;
	
//	@MyAnnotation
	private int age;
	
	
	@MyAnnotation
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	@MyAnnotation
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
