package com.cg.labbook3.M3LabbookSpring12;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//run this
public class App {
	public static void main(String args[]){
		AbstractApplicationContext context=
				new AnnotationConfigApplicationContext(Config.class);
		Employee employee=(Employee)context.getBean("emp");
		System.out.println(employee);
	}
}
