package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
public class SystemActivityLogsPage extends BasePage {

	public  SystemActivityLogsPage(WebDriver driver) {
		super(TestBase.getDriver());
	

}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'System Activity Logs')]")
	@CacheLookup
	WebElement SystemActivityLogs;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
	@CacheLookup
	WebElement Department;
	
	
	@FindBy(xpath = "//select[@id='EmployeeData']")
	@CacheLookup
	WebElement Employee;
	
	
	@FindBy(xpath = "//option[contains(text(),'All Employees')]")
	@CacheLookup
	WebElement Select_All_Employee;
	
	
	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement DateRange;
	
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last_30Days;
	
	@FindBy(xpath = "//button[@id='ExcelButton']")
	@CacheLookup
	WebElement Excel_Button;
	
	@FindBy(xpath = "//i[contains(text(),'PDF')]")
	@CacheLookup
	WebElement Pdf_Button;
	
	@FindBy(xpath = "//li[contains(text(),'This Month')]")
	@CacheLookup
	WebElement This_month;
	
	@FindBy(xpath = "//button[@id='ExcelButton']")
	@CacheLookup
	WebElement Excel_Button_1;
	
	@FindBy(xpath = "//i[contains(text(),'PDF')]")
	@CacheLookup
	WebElement Pdf_Button_1;
	
	
	
	
	
	public void SystemActivityLogsPage()throws InterruptedException, AWTException{
	
		helper.waitFor(SystemActivityLogs);		
		helper.highLightElement(driver, SystemActivityLogs);
		SystemActivityLogs.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected System-Activity-Logs Button ");
		Assert.assertTrue(true, "Failed To Click  on Reports Module and Selected System-Activity-Logs Button");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.move_to_element_click_target(Location);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and  Selected Location ");
		Assert.assertTrue(true, "Failed To Click  Location Drop-down and Selected Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department); 
		helper.move_to_element_click_target(Department);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Department Drop-down and Selected Department ");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
//		helper.explicitlyWait(Employee);
		helper.selectDropDownValue(Employee, "visibletext", "See All Employee");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed To Click on Employee Drop-down and Selected Any Employee");
		
		
		helper.waitFor(DateRange);
		helper.highLightElement(driver, DateRange);
		DateRange.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed To Click  on Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last_30Days);
		helper.highLightElement(driver,Last_30Days);
		Last_30Days.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Last-30-Days");
		Assert.assertTrue(true, "Failed To Click on  Last-30-Days");
		Thread.sleep(3000);
		
		 
		helper.waitFor(Excel_Button);
		helper.highLightElement(driver, Excel_Button);
		Excel_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Excel-Button");
		Assert.assertTrue(true, "Failed To Click on  Excel-Button");
		Thread.sleep(5000);
	
		
		helper.waitFor(Pdf_Button);
		helper.highLightElement(driver, Pdf_Button);
		Pdf_Button.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Pdf-Button");
		Assert.assertTrue(true, "Failed To  Click on  Pdf-Button");
		Thread.sleep(5000);
	
		
	
	
		
}
}


