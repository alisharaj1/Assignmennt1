package com.one.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	 public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");

	      Employee e = (Employee) context.getBean("employee");
		     System.out.println("Employee Id"+": "+e.getId());
	        System.out.println("Employee Name "+" :"+e.getName());
	        System.out.println("Employee Salary "+": "+e.getSalary());
	        System.out.println("Employee Age "+": "+e.getAge());
	        System.out.println("Employee SBU "+": "+e.getSbu());
}
}
