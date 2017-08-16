package com.learning.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private String who = null;
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hl = (HelloWorld) factory.getBean("hello");
		System.out.println(hl.getInfo());
	}
}
