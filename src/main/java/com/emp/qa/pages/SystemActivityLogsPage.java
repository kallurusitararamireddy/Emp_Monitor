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
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on SystemActivityLogs");
		Assert.assertTrue(true, "Failed To Select SystemActivityLogs");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.move_to_element_click_target(Location);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location Drop-Down & Select Location ");
		Assert.assertTrue(true, "Failed To click  Location Drop-Down & Select Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department); 
		helper.move_to_element_click_target(Department);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Department Drop-Down & Select Department ");
		Assert.assertTrue(true, "Failed To click  Department Drop-Down & Select Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.selectDropDownValue(Employee, "visibletext", "See All Employee");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Employee Drop-down & Select Employee");
		Assert.assertTrue(true, "Failed To Select Employee");
		
		
		helper.waitFor(DateRange);
		helper.highLightElement(driver, DateRange);
		DateRange.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Date-Range");
		Assert.assertTrue(true, "Failed To click  DateRange");
		
		helper.waitFor(Last_30Days);
		helper.highLightElement(driver,Last_30Days);
		Last_30Days.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Last-30-Days");
		Assert.assertTrue(true, "Failed To Select Last-30-Days");
		Thread.sleep(3000);
		
		 
		helper.waitFor(Excel_Button);
		helper.highLightElement(driver, Excel_Button);
		Excel_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Excel-Button");
		Assert.assertTrue(true, "Failed To Select Excel-Button");
		Thread.sleep(5000);
	
		
		helper.waitFor(Pdf_Button);
		helper.highLightElement(driver, Pdf_Button);
		Pdf_Button.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Pdf-Button");
		Assert.assertTrue(true, "Failed To  Select Pdf-Button");
		Thread.sleep(5000);
	
		
		
		/*
		 *  this_month data
		 */
		
//		helper.waitFor(This_month);
//		helper.highLightElement(driver,This_month);
//		This_month.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on This_month");
//		Assert.assertTrue(true, "Failed To Select This_month");
//		
//		helper.waitFor(Excel_Button_1);
//		helper.highLightElement(driver, Excel_Button_1);
//		Excel_Button_1.click();
//		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Excel-Button-1");
//		Assert.assertTrue(true, "Failed To Select Excel-Button-1");
//		Thread.sleep(5000);
//	
//		
//		helper.waitFor(Pdf_Button_1);
//		helper.highLightElement(driver, Pdf_Button_1);
//		Pdf_Button_1.click();
//		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Pdf-Button-1");
//		Assert.assertTrue(true, "Failed To  Select Pdf-Button-1");
//		Thread.sleep(5000);
	
		
}
}


