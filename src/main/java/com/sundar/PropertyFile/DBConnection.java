package com.sundar.PropertyFile;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBConnection {
	
	@Value("${mysql.driver}")
    private String driver;
	
	@Value("${mysql.url}")
    private String url;
	
	@Value("${mysql.userName}")
    private String userName;
	
	@Value("${mysql.password}")
    private String password;
	
	public void display() {
		System.out.println(driver+" "+url+" "+userName+" "+password);
	}
	
	private Connection con=null;
	
	public Connection getCon() {
		try{
			Class.forName(driver);
			con= DriverManager.getConnection(url,userName,password);
			System.out.println("created.");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
		
	}

}
