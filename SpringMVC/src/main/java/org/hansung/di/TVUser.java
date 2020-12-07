package org.hansung.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TVUser {

	public static void main(String[] args) {
		//method2();
		method3();
	}
	private static void method1() {
		
	}

	private static void method2() {
		Resource r = new ClassPathResource("di.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		SamsungTV tv = bf.getBean("samsung", SamsungTV.class);
		//tv.show();
		//tv.hide();
		//System.out.println(tv.model);
		//System.out.println(tv.price);
	}

	private static void method3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di.xml");
		//SamsungTV tv = ctv.getBean("samsung", SamsungTV.class);
		
	}

}
