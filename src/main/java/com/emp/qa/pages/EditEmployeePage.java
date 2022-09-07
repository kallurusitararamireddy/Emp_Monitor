package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;


public class EditEmployeePage extends BasePage{

	public EditEmployeePage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='24768']/td[@id='act24768']/a[5]/i[1]")
	@CacheLookup
	WebElement EditEmployee;
	
	@FindBy(xpath = "//input[@id='fullName']")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(xpath = "//textarea[@id='Employeeaddress']")
	@CacheLookup
	WebElement Address;
	
	@FindBy(xpath = "//button[@id='emp-edit']")
	@CacheLookup
	WebElement Update_Button;
	
	public  void EditEmployee() throws InterruptedException {
		
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(EditEmployee);
		helper.highLightElement(driver,EditEmployee);
		helper.jsCLick(EditEmployee);
		helper.Scrollintoview(EditEmployee);
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on EditEmployee");
		Assert.assertTrue(true, "Failed to click on EditEmployee");
		
		helper.waitFor(LastName);
		helper.highLightElement(driver,LastName);
		LastName.clear();
		LastName.sendKeys("CODE");
		Reporter.log("<B><font color = 'blue'>Step4.</font></B>  Modified  LastName");
		Assert.assertTrue(true, "Failed to Modify  LastName");
		Thread.sleep(3000);
		
		helper.waitFor(Address);
		helper.highLightElement(driver,Address);
		Address.clear();
		Address.sendKeys("HousNo:1234,Andhra");
		Reporter.log("<B><font color = 'blue'>Step4.</font></B>  Modified  Address");
		Assert.assertTrue(true, "Failed to Modify  Address");
		Thread.sleep(3000);
		
		helper.waitFor(Update_Button);
		helper.highLightElement(driver,Update_Button);
		helper.Scrollintoview(Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B>  clicked on Update_Button");
		Assert.assertTrue(true, "Failed to Click On Update_Button");
		Thread.sleep(9000);
		
		
		 
		
	}

}
