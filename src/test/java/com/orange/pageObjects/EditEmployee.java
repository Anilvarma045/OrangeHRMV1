package com.orange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditEmployee {
	
	WebDriver ldriver;
	public EditEmployee(WebDriver rdriver) {
	      ldriver=rdriver;
	  PageFactory.initElements(rdriver, this); 
	  }

     //After Search
	//click that Partucular Employee
	@FindBy(xpath="//input[@id='btnEditPers']")
	WebElement EditButton;
	
    @FindBy(xpath="//input[@id='txtNICNo']")
    WebElement SSNO;

    @FindBy(xpath="//input[@id='txtSINNo']")
    WebElement SINNO;
    
    @FindBy(xpath="//input[@id='txtOtherID']")
    WebElement OtherID;

    @FindBy(xpath="//input[@id='chkSmokeFlag']")
    WebElement Smoker;
    
      @FindBy(xpath="//input[@id='txtMilitarySer']")
      WebElement MilitaryService;
      
      @FindBy(xpath="//input[@id='DOB']")
      WebElement DatofBirth;
      
      @FindBy(xpath="//select[@id='cmbMarital']")
      WebElement MaritaialSDrop;
      

      @FindBy(xpath="//input[@id='gender1']")
      WebElement GenderMale;
      
      @FindBy(xpath="//input[@id='gender2']")
      WebElement GenderFemale;
      
      @FindBy(xpath="//input[@id='txtLicenNo']")
      WebElement LicNO;
      
      @FindBy(xpath="//input[@id='btnEditPers']")
      WebElement SaveButton;
      
public void clickEditButton() {
	EditButton.click();
}

public void enterOtherId(String OID) {
	OtherID.sendKeys(OID);
}
public void enterSSNNO(String snno) {
	SSNO.sendKeys(snno);

}
public void enterSINNO(String sinno) {
	SINNO.sendKeys(sinno);
}

public void selectIfSmoker() {
	Smoker.click();
	GenderMale.click();
}

public void enterDOB(String DOB) {
	DatofBirth.sendKeys(DOB);
}
public void selectMartialStatus() {
	Select sc=new Select(MaritaialSDrop);
	sc.selectByVisibleText("Unmarried");
}

public void enterLicienceNO(String licno) {
	LicNO.sendKeys(licno);
}

public void clickSaveButton() {
	SaveButton.click();
	System.out.println("Change happend in EMployee PRofile");
}
}



