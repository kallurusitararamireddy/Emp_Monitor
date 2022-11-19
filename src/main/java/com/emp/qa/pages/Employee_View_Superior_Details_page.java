package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class Employee_View_Superior_Details_page extends BasePage
{

	public Employee_View_Superior_Details_page(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//*[@id='act25617']/a[7]/i")
	WebElement superior_Details;
	
	@FindBy(xpath = "//*[@id='superiorRolesModal']/div/div/div[1]/button/span")
	WebElement Close;
	
	
	
	
	public  void View_Superior_Details() throws InterruptedException, AWTException {
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 </font></B> clicked on Employee Module and Selected Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected Employee Details Sub-Module");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller); 
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2 </font></B> clicked on Any  Employee");
		Assert.assertTrue(true, "Failed to click on Any  Employee");
		
		
		helper.waitFor(superior_Details);
		helper.highLightElement(driver, superior_Details);
		helper.jsCLick(superior_Details); 
		Reporter.log("<B><font color = 'blue'>Step3 </font></B> clicked on superior_Details icon");
		Assert.assertTrue(true, "Failed to Click  on superior_Details icon");
		
		   
		helper.waitFor(Close);
		helper.highLightElement(driver, Close);
		helper.jsCLick(Close);
		Reporter.log("<B><font color = 'blue'>Step4 </font></B> Clicked on Close Button");
		Assert.assertTrue(true, "Failed to Click on Close Button");
	
		
	}
	

}
