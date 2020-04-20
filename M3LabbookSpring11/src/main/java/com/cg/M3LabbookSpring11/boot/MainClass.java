package com.cg.M3LabbookSpring11.boot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.M3LabbookSpring11.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("MyBean.xml");
		
		Employee e=(Employee)con.getBean("emp");
		System.out.println("Employee Details");
		System.out.println("----------------------------");
		System.out.println("Employee ID : "+e.getEmployeeId());
		System.out.println("Employee Name : "+e.getEmployeeName());
		System.out.println("Employee Salary : "+e.getSalary());
		System.out.println("Employee BU : "+e.getBusinessUnit());
		System.out.println("Employee Age : "+e.getAge());
	}

}
