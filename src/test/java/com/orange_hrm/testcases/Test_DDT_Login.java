package com.orange_hrm.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.Utility.XLUtils;
import com.orange.pageObjects.Orange_LoginPage;

public class Test_DDT_Login  extends BaseClass {

    
	  @Test(dataProvider = "LoginData")
	  public void loginDDT(String usname, String pswd) throws Exception{
		 System.out.println(usname  +pswd);
		  
  System.out.println("we can login with multiple set of data");
		  Orange_LoginPage login=new Orange_LoginPage(driver);
		  login.setusername(usname);
		  login.setpassword(pswd);
		  login.clicksubmit();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.linkText("Logout")).click();
		  
		  
		  
	  }
		
	  
	  

		@DataProvider(name="LoginData")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/test/java/com/orange_testData/LoginData.xlsx";
			                                            //src\test\java\com\orange_testData\LoginData.xlsx
			int rownum=XLUtils.getRowCount(path, "Sheet1");
			int colcount=XLUtils.getCellCount(path,"Sheet1",1);
			
			String logindata[][]=new String[rownum][colcount];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
				}
					
			}
		return logindata;
		}
		
	  
	  
	  
	  
	  }
	
	  