package com.orange_hrm.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
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
	String newempname=rconfig.getnewempname();
	String newemplastname=rconfig.getemplname();
	String middlename=rconfig.getempmname();
	String editempname=rconfig.geteditname();
	String deletempname=rconfig.getdeleteempname();

	
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
	

public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
	

public void selectDropDown(WebElement elem, String value) {
	Select drop=new Select(elem);
	List<WebElement>alloptions=drop.getOptions();
	for(WebElement option:alloptions) {
		if(option.getText().equals(value)) {
			option.click();
			break;
		}
	}
}
	
	
}
