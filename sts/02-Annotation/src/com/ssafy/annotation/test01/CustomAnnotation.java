package com.ssafy.annotation.test01;

// interface에서는 메서드를 정의했다면 (param, throws)
// annotation 요소(Element) (X)
// @CustomAnnotation(intType=3, classType=Cat.class, fruitType=Fruit.APPLE, ...)
public @interface CustomAnnotation {
	int intType(); // 요소의 이름: intType, 요소의 반환형: int
	String stringType() default "";
	Class<?> classType();
	Fruit frutType();
	
	int[] intArrayType();
	String[] stringArrayType() default {};
	Class<?>[] classArrayType();
	Fruit[] fruitArrayType();
	
	String[] stringArrayDefault() default {"a", "b"};
}
