package com.emp.qa.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

public class Employee_manually_checking_Check_in_Page extends BasePage {

	public Employee_manually_checking_Check_in_Page(WebDriver driver) {
		super(driver);
		
	}

	DataUtility du = new DataUtility();
	Helpers helper = new Helpers();

	/* Admin side Changes Manual Clock In and Clock Out Enable or Disabled */
	

	@FindBy(xpath = "//span[text()='Employee']/../i[2]")
	@CacheLookup
	WebElement Employee;

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	/* Change with employee Id */

	@FindBy(xpath = "//*[@id='fn25642']")
	@CacheLookup
	WebElement employee_select;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[1]/a[2]")
	@CacheLookup
	WebElement settings;

	@FindBy(xpath = "//*[@id='manual_clock_in']")
	@CacheLookup
	WebElement enable;

	@FindBy(xpath = "//*[@id='SaveButton']")
	@CacheLookup
	WebElement save;

	
	
	/*
	 * manager side login Check
	 */
	
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement user;
	@FindBy(xpath = "//*[@id='password']")
	WebElement pwd;

	@FindBy(xpath = "//*[@id='login-form']/button")
	WebElement login_button;

	@FindBy(xpath = "//i[@title='Change Role ']")
	WebElement role_change;

	// Select Role option
	@FindBy(xpath = "//a[text()='HOD-Bangalore']")
	WebElement HOD_Bangalore_click;
	@FindBy(xpath = "//a[text()='Employee']")
	WebElement employee;
	@FindBy(xpath = "//a[text()='Manager']")
	WebElement Manager;

	@FindBy(xpath = "//a[text()='Hrms']")
	WebElement hrm;

	@FindBy(xpath = "//*[@id='kt_aside_menu']/ul/li[2]/a/span")
	WebElement Attendance;

	public void Employeecheckin() throws InterruptedException {

		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee");
		Assert.assertTrue(true, "Failed to click on Employee");

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "2");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Show-Entries");
		Assert.assertTrue(true, "Failed to clicked on Show-Entries");

		Thread.sleep(3000);
		
		helper.waitFor(employee_select);
		helper.highLightElement(driver, employee_select);
		helper.Scrollintoview(employee_select);
		employee_select.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on employee_select");
		Assert.assertTrue(true, "Failed to click on employee_select");
		
		
		
		Thread.sleep(2000);
		
		helper.waitFor(settings);
		helper.highLightElement(driver, settings);
		settings.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on settings");
		Assert.assertTrue(true, "Failed to click on settings");
		
		Thread.sleep(3000);
		
		helper.waitFor(enable);
		helper.highLightElement(driver, enable);
		helper.Scrollintoview(enable);
		enable.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on enable");
		Assert.assertTrue(true, "Failed to click on enable");
		
		
		Thread.sleep(1000);
		
		helper.waitFor(save);
		helper.highLightElement(driver, save);
		save.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on save-button");
		Assert.assertTrue(true, "Failed to click on save-button");
		Thread.sleep(3000);
		
	
		
	}

	/*
	 * Login Manager TL Employee log side Check out
	 */

	public void _Employee_log_side_HRM_Check_in() throws Exception

	{ 
 
		HomePage s1 = new HomePage(driver);

		driver.switchTo().newWindow(WindowType.TAB);

		Reporter.log("<B><font color = 'blue'>Step8.</font></B>  Switch to New TAB - Login With Manager");
		Assert.assertTrue(true, "Switch to New TAB - Login With Manager");

		driver.get(du.Data_info("manager_TL_Employee_URL"));
		Reporter.log("<B><font color = 'blue'>Step9.</font></B>  Manager-TL-Employee - log-page-URL ");
		Assert.assertTrue(true, "Switch to New TAB - Manager-TL-Employee - log-page");

		helper.waitFor(user);
		helper.highLightElement(driver, user);
		user.sendKeys(du.Data_info("manager_TL_Employee_User"));
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Entered the User-name");
		Assert.assertTrue(true, "Failed to Entered the User-name");

		helper.waitFor(pwd);
		helper.highLightElement(driver, pwd);
		pwd.sendKeys(du.Data_info("manager_TL_Employee_password"));
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Entered the password");
		Assert.assertTrue(true, "Failed to Entered the password");

		helper.waitFor(login_button);
		helper.highLightElement(driver, login_button);
		login_button.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on login_button");
		Assert.assertTrue(true, "Failed to clicked on  login_button");

		helper.waitFor(role_change);
		helper.highLightElement(driver, role_change);
		role_change.click();
		role_change.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on  role_change-button");
		Assert.assertTrue(true, "Failed to clicked on  role_change-button");

		Thread.sleep(1000);
		helper.waitFor(employee);
		helper.highLightElement(driver, employee);
		employee.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Selected the employee");
		Assert.assertTrue(true, "Failed to Selected the employee");

		s1.Skip();
		Thread.sleep(2000);

		

		helper.waitFor(hrm);
		helper.highLightElement(driver, hrm);
		hrm.click();
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on hrm");
		Assert.assertTrue(true, "Failed to clicked on hrm");
		
		
		/*
		 *  Open New Tab - Display HRM 
		 */
		
		
		
		/*  selected particular TAB Selection **/
		
		// store parent window value in string
		String parentWindow = driver.getWindowHandle();

		// store the set of all windows
		Set<String> allwindows = driver.getWindowHandles();

		for (String childWindow : allwindows) { 
		driver.switchTo().window(childWindow);
		String title =driver.getTitle();
		System.out.println(title);
				
			if (!title.contains("HRMS | My Profile")) {
				driver.close();
			} 
		}
		
		Thread.sleep(2000);
		
		helper.waitFor(Attendance);
		helper.highLightElement(driver, Attendance);
		Attendance.click();
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Attendance");
		Assert.assertTrue(true, "Failed to click on Attendance");
		Thread.sleep(5000);		

	}

}
