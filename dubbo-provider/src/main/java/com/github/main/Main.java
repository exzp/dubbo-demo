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
	            System.in.read();//�ô˳���һֱ�ܣ���ʾһֱ�ṩ����  
	        } catch (IOException e) {         
	            e.printStackTrace();  
	        }    
	}

}
