package org.hansung.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di2.xml");
		People p1 = ctx.getBean("people", People.class);
		System.out.println(p1);
		
		PeopleUse pu = ctx.getBean("pu", PeopleUse.class);
		pu.test();
		
		Car c = ctx.getBean("car", Car.class);
		System.out.println(c);
	}
}
