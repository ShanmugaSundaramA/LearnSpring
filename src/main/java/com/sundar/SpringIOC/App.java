package com.sundar.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       Sim sim=new Vodafone();
       sim.call();
       sim.data();
    }
}
