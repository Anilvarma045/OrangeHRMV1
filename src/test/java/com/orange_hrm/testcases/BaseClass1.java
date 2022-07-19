package com.orange_hrm.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.orange.Utility.ReadConfig;



public class BaseClass1 {
	
	ReadConfig rconfig=new ReadConfig();
	String url=rconfig.getappurl();
	String username=rconfig.getusername();
	String password=rconfig.getpassword();
	
	//Logger Intialtisation
	Logger logger;
	
  
	public  WebDriver driver;
	@BeforeClass
	public void openApplication() {
		
		//log calling
		logger=Logger.getLogger("HRMS");
		   PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	logger.info("Application opned Sucessfully");
		
	}
	
	
	
	
}
