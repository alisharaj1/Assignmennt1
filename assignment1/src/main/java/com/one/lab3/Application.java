package com.one.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.one.lab3.SBU;

@SuppressWarnings("unused")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      @SuppressWarnings("resource")
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Bean3.xml");
	      SBU s=(SBU) context1.getBean("sbu");
	      @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean4.xml");
	      Employee e = (Employee) context.getBean("employee");
	      System.out.println("sbu detail------------------");
	      System.out.println("sbu detail"+"= "+s.getSbuID()+" "+ s.getSbuName()+" "+s.getSbuHead());
        System.out.println("employee detail---------------");
        e.getEmployeelist();
	   }
	}
