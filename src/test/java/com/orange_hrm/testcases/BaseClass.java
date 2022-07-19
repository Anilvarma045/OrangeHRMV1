package com.orange_hrm.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.orange.Utility.ReadConfig;

public class BaseClass {


	ReadConfig rconfig=new ReadConfig();
	String url=rconfig.getappurl();
	String username=rconfig.getusername();
	String password=rconfig.getpassword();
	String chromepath=rconfig.getchromepath();
	String firefoxpath=rconfig.getfirefoxpath();
	String iepath=rconfig.getchromepath();
	//Logger Intialtisation
	Logger logger;
	
  
	public  WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		//log calling
		logger=Logger.getLogger("HRMS");
		   PropertyConfigurator.configure("Log4j.properties");
		   
	
		   if(br.equals("chrome")) {
			   System.setProperty("webdriver.chrome.driver",chromepath);
			   driver=new ChromeDriver();
		   }
		   else if(br.equals("firefox")) {
			   System.setProperty("webdriver.gecko.driver",firefoxpath);
			   driver=new FirefoxDriver();
			    }
		   else if(br.equals("ie")){
			   System.setProperty("webdriver.ie.driver",iepath);
		   driver=new InternetExplorerDriver();
		   }
		   else {
			   System.out.println("please proivide valid browser name");
		   }
		   
   
	driver.get(url);
	logger.info("Application opned Sucessfully");
	
	}
	@AfterClass  
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
}
