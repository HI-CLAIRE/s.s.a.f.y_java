package com.ssafy.annotation.test05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeAnnotation3 {
	String value();
}
