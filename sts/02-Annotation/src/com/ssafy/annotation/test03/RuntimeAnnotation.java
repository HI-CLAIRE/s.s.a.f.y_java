package com.ssafy.annotation.test03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeAnnotation {
	String value();
}
