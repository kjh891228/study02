package org.hansung.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DiTest {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("di.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Car c1 = bf.getBean("car", Car.class);
		c1.go();
	}
}
