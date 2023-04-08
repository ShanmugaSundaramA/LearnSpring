package com.sundar.CollectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	   ApplicationContext context=new ClassPathXmlApplicationContext("springIOC.xml");
	   
	   Question ques=context.getBean("que",Question.class);
	   ques.display();
	   
	   Question1M ques1=context.getBean("ques1",Question1M.class);
	   ques1.display();
   }
}
