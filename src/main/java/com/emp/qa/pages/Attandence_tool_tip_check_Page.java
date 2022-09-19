package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Attandence_tool_tip_check_Page extends BasePage
{

	public Attandence_tool_tip_check_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	Helpers helper = new Helpers();
	
	
	@FindBy(xpath = "//span[text()='Employee']/../i[2]")
	@CacheLookup
	WebElement Employee;

	@FindBy(xpath = "//a[@title='Employee-Attendance']")
	@CacheLookup
	WebElement EmployeeAttendance;
	
	@FindBy(xpath = "(//i[@data-toggle='tooltip'])[1]")
	@CacheLookup
	WebElement present_show;
	
	
	@FindBy(xpath = "(//i[@data-toggle='tooltip'])[2]")
	@CacheLookup
	WebElement absent_show;
	
	@FindBy(xpath = "(//i[@data-toggle='tooltip'])[3]")
	@CacheLookup
	WebElement half_day_show;
	
	@FindBy(xpath = "(//i[@data-toggle='tooltip'])[4]")
	@CacheLookup
	WebElement over_time;
	
	
	@FindBy(xpath = "(//i[@data-toggle='tooltip'])[5]")
	@CacheLookup
	WebElement day_off_show;
	
	@FindBy(xpath = "(//i[@data-toggle='tooltip'])[6]")
	@CacheLookup
	WebElement late_show;
	
	
	public void Tool_Tip_showing() throws InterruptedException
	{
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on employee_select");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		 
		helper.waitFor(EmployeeAttendance);
		helper.highLightElement(driver, EmployeeAttendance);
		EmployeeAttendance.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on EmployeeAttendance");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		Thread.sleep(4000);
		helper.waitFor(present_show);
		helper.highLightElement(driver, present_show);
		helper.move_to_element(present_show);
//		present_show.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> moveto on present_show");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		Thread.sleep(4000);
		helper.waitFor(absent_show);
		helper.highLightElement(driver, absent_show);
		helper.move_to_element(absent_show);
//		absent_show.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>  moveto on absent_show");
		Assert.assertTrue(true, "Failed to click on employee_select");
		Thread.sleep(4000);
		
		
		helper.waitFor(half_day_show);
		helper.highLightElement(driver, half_day_show);
		helper.move_to_element(half_day_show);
//		half_day_show.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B>  moveto on half_day_show");
		Assert.assertTrue(true, "Failed to click on employee_select");
		Thread.sleep(4000);
		
		
		helper.waitFor(over_time);
		helper.highLightElement(driver, over_time);
		helper.move_to_element(over_time);
//		over_time.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> moveto on over_time");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		Thread.sleep(4000);
		helper.waitFor(day_off_show);
		helper.highLightElement(driver, day_off_show);
		helper.move_to_element(day_off_show);
//		day_off_show.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> moveto on day_off_show");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		Thread.sleep(4000);
		helper.waitFor(late_show);
		helper.highLightElement(driver, late_show);
		helper.move_to_element(late_show);
//		late_show.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> moveto on late_show");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		Thread.sleep(4000);
	
		
	}

	

}
