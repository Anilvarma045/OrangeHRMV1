package com.orange.pageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignLeavePage {
	WebDriver ldriver;

	public AssignLeavePage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(xpath="/html[1]/body[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")
		WebElement leavemenu;

		@FindBy(xpath="/html[1]/body[1]/div[4]/ul[1]/li[3]/ul[1]/li[4]/a[1]/span[1]")
		WebElement Assignleave;
		
		@FindBy(xpath="//input[@id='txtEmployeeId']")
		WebElement empname;
		
		@FindBy(xpath="//select[@id='sltLeaveType']")
		WebElement leavetype;
		
		@FindBy(xpath="//input[@id='txtLeaveFromDate']")
		WebElement fromdate;
		
		@FindBy(xpath="//input[@id='txtLeaveToDate']")
		WebElement todate;
		
		@FindBy(xpath="//select[@id='sltLeaveFromTime']")
		WebElement dropfromtime;
		
		@FindBy(xpath="//select[@id='sltLeaveToTime']")
		WebElement dropendtime;
		
		@FindBy(xpath="//input[@id='btToDate']")
		WebElement calender;
		
		@FindBy(xpath="//*[@id=\"cal1_cell4\"]/a")
		WebElement date5;
		
		@FindBy(xpath="//textarea[@id='txtComments']")
		WebElement txtcomment;
		
		@FindBy(xpath="//input[@id='saveBtn']")
		WebElement saveleave;
		
		public void selectleaveMenu() {
			
			 Actions ac=new Actions(ldriver);
			 ac.moveToElement(leavemenu).perform();
			 System.out.println("select leave menu");
			
		}
		
		public void selectAssingLeave() throws Exception{
			System.out.println("select Assing leave option from menu");
			Thread.sleep(2000);
			 Actions ac=new Actions(ldriver);
			 ac.moveToElement(Assignleave).click().build().perform();
		     Thread.sleep(2000);

		    System.out.print("Assing leave selected");
			}
		public void enterEmployeeFullname(String fullname) throws Exception{
			ldriver.switchTo().frame(0);
			System.out.println("enter into frame");
			empname.sendKeys(fullname);
		//	empname.sendKeys(Keys.TAB);
			Thread.sleep(2000);
         System.out.println("Enter full name");
		}
		
		public void selectLeaveType() {
			Select sc=new Select(leavetype);
			sc.selectByVisibleText("Casual");
			System.out.println("casuel leave Selected");
		}
		
		public void selectFromdate(String startdate) {
			fromdate.clear();
			fromdate.sendKeys(startdate);
		}
		
		public void selectToDate() throws Exception {
			
	//		todate.sendKeys(enddate);
           System.out.println("successfully Added TO Date");			
		    calender.click();
		    date5.click();
		//  ldriver.findElement(By.xpath("//td[@id='cal1_cell4']")).click();
		
        	
		}
		
		public void enterAnyComment(String comments) {
			txtcomment.sendKeys(comments);
			System.out.println("Comment Added Successfully");
		}
		
		public void clickAssingbtn() {
			
			saveleave.click();
			System.out.println("Successfully saved");
		}
		
	
	
}
