package com.ssafy.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		//테스트 코드 작성
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

		User generalUser = context.getBean("generalUser",User.class);
		User adminUser = context.getBean("adminUser",User.class);
		
		System.out.println("******1.GeneralUser");
		try {
			generalUser.useApp();
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("******2.AdminUser");
		try {
			adminUser.useApp();
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		
	}

}
