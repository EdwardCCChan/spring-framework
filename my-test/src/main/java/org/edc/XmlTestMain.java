package org.edc;

import org.edc.domain.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher bean = context.getBean(Teacher.class);
		System.out.println(bean.getAge());
	}

}
