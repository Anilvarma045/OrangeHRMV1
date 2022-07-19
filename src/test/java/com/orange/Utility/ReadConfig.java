package com.orange.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig(){
		//1. upload file using File class and by using fileInputStream method to use in code
		//2. create object for Properties java class and by using object upload file ex: pro.load(fis)
		//3. then after create user defined methods for each property by .getProperty();
		
       File src=new File("./configurationfiles\\config.properties");
        try {
			FileInputStream fis=new FileInputStream(src);
			//FIleInputStream fis=new FileInputStream("./configurationfiles\\config.properties");
			  pro=new Properties();
		         pro.load(fis);   
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}
	
	//TO read data from property file
	public String getappurl() {
		String url=pro.getProperty("URL");
		return url;
	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password=pro.getProperty("password");
	    return password;
	}
	
	public String getchromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getiepath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	//next step is to create object in BaseClass and call each method what do you need acctually
}
