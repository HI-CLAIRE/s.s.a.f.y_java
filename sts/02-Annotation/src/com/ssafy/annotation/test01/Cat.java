package com.ssafy.annotation.test01;

//@CatTag(name="토비", address="...", phone="010-...")
//@CatTag(phone="010..")
public class Cat {
	private String name;
	private int age;
	
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
