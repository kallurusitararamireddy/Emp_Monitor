package com.emp.qa.pages;

import java.awt.AWTException;

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
public class EmailMonitoringPage extends BasePage {
	
	public  EmailMonitoringPage(WebDriver driver) {
		super(TestBase.getDriver());

	}
	
	Helpers helper=new Helpers();
	
	@FindBy(css = ".employee > a")
	@CacheLookup
	WebElement Employe;
	
	
	@FindBy(css = "a[title=' Email Monitoring']")
	@CacheLookup
	WebElement EmailMonitoring;
	
	@FindBy(xpath = "//select[@id='LocationAppend']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='DepartmentAppend']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//select[@id='EmployeeData']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//select[@id='ClientData']")
	@CacheLookup
	WebElement Clients;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	WebElement Export;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement PDF;
	
	@FindBy(css=".introjs-tooltip-header > a[role='button']")
	WebElement SkipPopUP;
	
	

	
	public void EmailMonitoringPage()throws InterruptedException, AWTException{
		

		
		helper.waitFor(EmailMonitoring);
		helper.highLightElement(driver, EmailMonitoring);
		EmailMonitoring.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmailMonitoring");
		Assert.assertTrue(true, "Failed to click on EmailMonitoring ");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location Dropdown");
		Assert.assertTrue(true, "Failed To Select Location_DropDown");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "index", "1");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department_Dropdown");
		Assert.assertTrue(true, "Failed to Select Deartment_Dropdown");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.selectDropDownValue(Employee, "id", "7332");
		Employee.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Employee_DropDown");
		Assert.assertTrue(true, "Failed to Select Employee_DropDown");
		
		helper.waitFor(Clients);
		helper.highLightElement(driver, Clients);
//		helper.selectDropDownValue(Clients, "value", "gmail");
		Clients.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Clients Dropdown and Selected Gmail");
		Assert.assertTrue(true, "Failed to Select Clients Dropdown ");
		
		helper.waitFor(Export);
		helper.highLightElement(driver,Export);
		Export.click();
		Thread.sleep(4000);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Export_Button");
		Assert.assertTrue(true, "Failed to click on Export_Button");
		
		helper.waitFor(PDF);
		helper.highLightElement(driver,PDF);
		PDF.click();
		Thread.sleep(4000);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on PDF_Butto");
		Assert.assertTrue(true, "Failed to click on PDF_Button");
		
		
	}
	
	
}


