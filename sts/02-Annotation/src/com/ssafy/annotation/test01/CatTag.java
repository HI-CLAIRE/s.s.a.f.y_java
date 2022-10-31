package com.ssafy.annotation.test01;

public @interface CatTag {
	String name() default ""; // default값이 있으면, 태그를 사용할 때 요소의 값을 지정하지 않아도 됨
	String address(); // 요소의 지정을 강제하고 싶으면 default를 삭제
	String phone() default "";
}
