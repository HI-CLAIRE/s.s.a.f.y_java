package com.ssafy.annotation.test05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeAnnotation1 {
	String value();
}
