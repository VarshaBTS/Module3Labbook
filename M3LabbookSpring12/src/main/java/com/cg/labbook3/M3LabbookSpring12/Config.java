package com.cg.labbook3.M3LabbookSpring12;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="emp")
	public Employee getSbuDetails(){
		Employee e=new Employee();
		e.setEmployeeId(12345);
		e.setEmployeeName("Harriet");
		e.setSalary(40000);
		e.setBusinessUnit(new SBU(2014,"Engineering Services","Kiran Rao"));
		return e;
	}
}
