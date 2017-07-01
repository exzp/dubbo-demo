package com.github.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
	                new String[]{"dubboProviderConfig.xml"});    
	        context.start();   
	        try {  
	            System.in.read();//让此程序一直跑，表示一直提供服务  
	        } catch (IOException e) {         
	            e.printStackTrace();  
	        }    
	}

}
