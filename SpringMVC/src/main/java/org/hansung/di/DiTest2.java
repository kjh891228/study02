package org.hansung.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di.xml");
		People p1 = ctx.getBean("people", People.class);
		People p2 = ctx.getBean("people2", People.class);
		People p3 = ctx.getBean("people2", People.class);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		System.out.println(System.identityHashCode(p3));
		System.out.println(p2==p3);
	}

}
