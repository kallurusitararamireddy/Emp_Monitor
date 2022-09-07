package com.emp.qa.pages;

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
	
	
	
	
	
	public void SystemActivityLogsPage()throws InterruptedException{
	
		helper.waitFor(SystemActivityLogs);		
		helper.highLightElement(driver, SystemActivityLogs);
		SystemActivityLogs.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on SystemActivityLogs");
		Assert.assertTrue(true, "Failed To Select SystemActivityLogs");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "id", "2");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location");
		Assert.assertTrue(true, "Failed To Select Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "1");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Department");
		Assert.assertTrue(true, "Failed To Select Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Employee");
		Assert.assertTrue(true, "Failed To Select Employee");
		
		helper.waitFor(Select_All_Employee);
		helper.highLightElement(driver, Select_All_Employee);
		Select_All_Employee.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Select_All_Employee");
		Assert.assertTrue(true, "Failed To  Select_All_Employee");
		
		helper.waitFor(DateRange);
		helper.highLightElement(driver, DateRange);
		DateRange.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on DateRange");
		Assert.assertTrue(true, "Failed To Select DateRange");
		
		helper.waitFor(Last_30Days);
		helper.highLightElement(driver,Last_30Days);
		Last_30Days.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Last_30Days");
		Assert.assertTrue(true, "Failed To Select Last_30Days");
		
		helper.waitFor(Excel_Button);
		helper.highLightElement(driver, Excel_Button);
		Excel_Button.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Excel_Button");
		Assert.assertTrue(true, "Failed To Select Excel_Button");
		Thread.sleep(5000);
	
		
		helper.waitFor(Pdf_Button);
		helper.highLightElement(driver, Pdf_Button);
		Pdf_Button.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Pdf_Button");
		Assert.assertTrue(true, "Failed To  Select Pdf_Button");
		Thread.sleep(5000);
	
	
		
}
}


