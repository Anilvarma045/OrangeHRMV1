package com.orange_hrm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseWithExtentreports extends BaseClass1 {

	@Test(priority = 0)
	public void loginTest() {
		
	test=extent.createTest("loginPageTest");
	WebElement logo=	driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]"));
	
	Assert.assertTrue(logo.isDisplayed());
	
	
	}
	
	@Test(priority = 1)
	public void loginapp() {
		test=extent.createTest("loginTest");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		
		String acctualtitle=driver.getTitle();
		Assert.assertEquals(acctualtitle, "OrangeHRM");
		
	}
}
