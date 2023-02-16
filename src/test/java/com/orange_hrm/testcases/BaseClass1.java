//package com.orange_hrm.testcases;
//
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
//
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//
//import com.orange.Utility.ReadConfig;
//
//
//
//
//
//
//
//public class BaseClass1 extends {
//	
//	
//	
//	ReadConfig rconfig=new ReadConfig();
//	String url=rconfig.getappurl();
//	String username=rconfig.getusername();
//	String password=rconfig.getpassword();
//	
//	
//	
//	
//	//Logger Intialtisation
//	Logger logger;
//	
//  
//	public  WebDriver driver;
//	@BeforeClass
//	public void openApplication() {
//		
//		//log calling
//		logger=Logger.getLogger("HRMS");
//		   PropertyConfigurator.configure("Log4j.properties");
//		
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
//	driver=new ChromeDriver();
//	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
//	logger.info("Application opned Sucessfully");
//		
//	}
//	@AfterMethod
//	public void teardown(ITestResult result) throws Exception{
//		if(result.getStatus()==ITestResult.FAILURE) {
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +"Test case failed",ExtentColor.RED));
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test case failed", ExtentColor.RED));
//			//above get throw the Error
//		}
//			else if(result.getStatus()==ITestResult.SKIP) {
//				test.log(Status.SKIP, "Skipped Test Case is : " +result.getName());
//			}else if(result.getStatus()==ITestResult.SUCCESS) {
//				test.log(Status.PASS,"Pass Test Case is: " +result.getName());		
//					}
//	        
//		driver.close();
//	}
//
//	
//	
//	@AfterSuite
//	public static void beforeSuite() {
//		ExtentManager.setExtent();
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		ExtentManager.endExtent();
//	}
//	
//}
