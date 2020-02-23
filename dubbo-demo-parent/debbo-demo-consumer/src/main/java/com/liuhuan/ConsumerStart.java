package com.liuhuan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuhuan.math.service.CalulateService;

class ConsumerStart {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicantionContext.xml");
		
		context.start();
		
		CalulateService calulateService = context.getBean(CalulateService.class);
		
		int n = calulateService.add(10, 20);
		System.out.println("加法为："+n);
		
		
		int m = calulateService.multiply(32, 2);
		System.out.println("乘法为："+m);
	}
}
