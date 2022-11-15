package com.emp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

@Listeners(ITestNGListener.class)
public class AddingFilterModulePage extends BasePage{

	public AddingFilterModulePage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExportButton;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement SelectAll;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	
	public  void AddingFilterModule() throws InterruptedException, IOException {
		
		
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected Employee Details Sub-Module");
		
		 
		helper.waitFor(ExportButton);
		helper.highLightElement(driver, ExportButton);
		ExportButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Export Button");
		Assert.assertTrue(true, "Failed to click on Export Button");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Select All check Box option");
		Assert.assertTrue(true, "Failed to Click on Select All check Box option");
		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Submit.click();

		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Submit button");
		Assert.assertTrue(true, "Failed to click on Submit button");
		Thread.sleep(6000);
		
		helper.Employees_List_Excel_data();
		
		Thread.sleep(6000);
		
	}
}
