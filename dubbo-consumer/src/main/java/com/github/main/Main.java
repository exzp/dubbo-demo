package com.github.main;

import java.io.IOException;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.api.service.TestService;

public class Main {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	             new String[] { "dubboConsumerConfig.xml" });
	     context.start();
	     TestService testService = (TestService) context.getBean("testService");
	     String msg = testService.queryUserInfo("admin");
	     System.out.println(msg);
	     try {
	         System.in.read();
	     } catch (IOException e) {       
	         e.printStackTrace();
	     }  
	}
}
