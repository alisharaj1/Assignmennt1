package com.one.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	 public static void main(String[] args) {
	      @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

	      Employee e = (Employee) context.getBean("employee");
		     System.out.println("Employee"+"="+"["+ e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getAge()+"]");
		     System.out.println("sbu detail"+"="+"["+e.getSbu().getSbuID()+" "+e.getSbu().getSbuName()+" "+e.getSbu().getSbuHead()+"]");
	   }
	}
