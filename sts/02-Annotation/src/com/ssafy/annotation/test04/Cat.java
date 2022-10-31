package com.ssafy.annotation.test04;

@Marker
@SingleValue1("aa")
@SingleValue2(name="bb")
@SingleValue3(value="cc")
@SingleValue4(name="aa")
@FullValue("cc")
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
