package com.ssafy.annotation.test04;

public @interface FullValue {
	String url() default "/";
	String method() default "GET";
	String value();
	String value2() default "";
}
