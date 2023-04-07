package com.sundar.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("springIOC.xml");
       Sim sim=(Sim) context.getBean("sim");
       sim.call();
       sim.data();
    }
}
