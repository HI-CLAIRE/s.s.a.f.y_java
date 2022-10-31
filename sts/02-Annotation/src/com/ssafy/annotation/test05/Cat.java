package com.ssafy.annotation.test05;

@RuntimeAnnotation1("a")
@RuntimeAnnotation2(value="b")
@RuntimeAnnotation3("c")
public class Cat {
	private String name;
	private int age;
	
	@RuntimeAnnotation1("aa")
	@RuntimeAnnotation2(value="bb")
	@RuntimeAnnotation3("cc")
	public String getName() {
		return name;
	}
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
