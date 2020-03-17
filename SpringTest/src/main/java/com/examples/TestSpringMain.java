package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringMain {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean=(HelloBean)con.getBean("HelloWorldService");
		bean.sayHello();

	}

}
