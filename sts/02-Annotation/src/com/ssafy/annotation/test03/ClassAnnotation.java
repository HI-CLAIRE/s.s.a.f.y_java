package com.ssafy.annotation.test03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS) // default이므로 지정 안해도 됨
public @interface ClassAnnotation {

}
