package com.ssafy.annotation.test02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// @Target 메타 어노테이션이 없으면, 그 어노테이션은 모든 곳에 붙을 수 있다.
// @Target(value=ElementType.TYPE)
@Target(value= {
//		ElementType.FIELD,
		ElementType.CONSTRUCTOR,
		ElementType.METHOD
})
public @interface MyAnnotation {

}
