package com.sundar.PropertyFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAO {

	public static void main(String[] args){

		ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
		DBConnection db=(DBConnection)context.getBean("db");
		db.display();
		System.out.println(db.getCon());
	}
}
