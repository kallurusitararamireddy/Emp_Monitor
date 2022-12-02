package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

import antlr.collections.List;

public class Admin_Side_Collect_Email_and_Password_Non_Admin_side_Login_Page extends BasePage
{

	public  Admin_Side_Collect_Email_and_Password_Non_Admin_side_Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 *  HRMS Checking 
	 */

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

	@FindBy(xpath = "(//tbody[@id='fetch_Details']/tr[1]//a)[1]")
	@CacheLookup
	WebElement employee_select;
	
	/*
	 *  clicked on Edit option -- Collect G-mail id and Password
	 */
	
	@FindBy(xpath = "//div[@class='content-header']//a[text()='Edit ']")
	@CacheLookup
	WebElement edit_Option;
	
	@FindBy(xpath = "//input[@id='emp_emailAddress']")
	@CacheLookup
	WebElement Copy_email_id;
	
	@FindBy(xpath = "//span[@toggle='#password-editEmp']")
	@CacheLookup
	WebElement click_Eye_Icon;
		
	@FindBy(xpath = "//input[@id='password-editEmp']")
	@CacheLookup
	WebElement Copy_Password;
	
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement user;
	@FindBy(xpath = "//*[@id='password']")
	WebElement pwd;

	@FindBy(xpath = "//*[@id='login-form']/button")
	WebElement login_button;
	 
	
	public void Non_Employee_login() throws InterruptedException, AWTException, IOException {


		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module ");
        Thread.sleep(1000);
        
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		helper.jsCLick(EmployeeDetails);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Details Sub-Module ");

		helper.highLightElement(driver, ShowEntries);
		ShowEntries.click();
        helper.robot_fourth_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Show-Entries");
		Assert.assertTrue(true, "Failed to clicked on Show-Entries");

		Thread.sleep(6000);

		helper.waitFor(employee_select);
		helper.highLightElement(driver, employee_select);
		helper.Scrollintoview(employee_select);
		employee_select.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Any Employee Selected");
		Assert.assertTrue(true, "Failed to click on Any Employee selected");

		Thread.sleep(2000); 
		
		/*
		 *  Edit option Collect G-mail id and Password
		 */ 
		
		helper.waitFor(edit_Option);
		helper.highLightElement(driver,edit_Option );
		helper.Scrollintoview(edit_Option);
		edit_Option.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on edit_Option");
		Assert.assertTrue(true, "Failed to Click on edit_Option");
		
		
		helper.waitFor(Copy_email_id);
		helper.highLightElement(driver,Copy_email_id );
		helper.move_to_element(Copy_email_id);
		Copy_email_id.sendKeys(Keys.CONTROL,"A");
		Copy_email_id.sendKeys(Keys.CONTROL,"c");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on E-mail Text field and  Copy E-mail id");
		Assert.assertTrue(true, "Failed to Click on E-mail Text field and Copy E-mail id");
		Thread.sleep(1000);
		
		
		driver.switchTo().newWindow(WindowType.TAB);

		Reporter.log("<B><font color = 'blue'>Step8.</font></B>  Switch to New TAB - Login With Manager");
		Assert.assertTrue(true, "Switch to New TAB - Login With Manager");

		
		driver.get(du.Data_info("manager_TL_Employee_URL"));
		Reporter.log("<B><font color = 'blue'>Step9.</font></B>  Manager-TL-Employee - log-page-URL ");
		Assert.assertTrue(true, "Switch to New TAB - Manager-TL-Employee - log-page");
		Thread.sleep(1000);
		
		helper.waitFor(user);
		helper.highLightElement(driver, user);
		Thread.sleep(1000);
		user.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(1000);
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Entered Manager-TL-Employee User-name");
		Assert.assertTrue(true, "Failed to Enter Manager-TL-Employee User-name");
		
		
      

		
		
		
		
		
		helper.waitFor(click_Eye_Icon);
		helper.highLightElement(driver,click_Eye_Icon );
		helper.Scrollintoview(click_Eye_Icon);
		click_Eye_Icon.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Eye_Icon");
		Assert.assertTrue(true, "Failed to Click on Eye_Icon");
		Thread.sleep(1000);

		
		helper.waitFor(Copy_Password);
		helper.highLightElement(driver,Copy_Password );
		helper.move_to_element(Copy_Password);
		Copy_Password.sendKeys(Keys.CONTROL,"A");
		Copy_Password.sendKeys(Keys.CONTROL,"c");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Password Text field and Copy_Password");
		Assert.assertTrue(true, "Failed to Click on Password Text field and Copy_Password");
		Thread.sleep(1000);

		
		
		
		/*
		 *  Non-admin Side Login 
		 */
		
		
		 
		
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		Reporter.log("<B><font color = 'blue'>Step8.</font></B>  Switch to New TAB - Login With Manager");
//		Assert.assertTrue(true, "Switch to New TAB - Login With Manager");
//
//		
//		driver.get(du.Data_info("manager_TL_Employee_URL"));
//		Reporter.log("<B><font color = 'blue'>Step9.</font></B>  Manager-TL-Employee - log-page-URL ");
//		Assert.assertTrue(true, "Switch to New TAB - Manager-TL-Employee - log-page");
//		Thread.sleep(1000);


//		helper.waitFor(user);
//		helper.highLightElement(driver, user);
//		Thread.sleep(1000);
//		user.sendKeys(Keys.CONTROL,"v");
//		Thread.sleep(1000);
//		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Entered Manager-TL-Employee User-name");
//		Assert.assertTrue(true, "Failed to Enter Manager-TL-Employee User-name");

		helper.waitFor(pwd);
		helper.highLightElement(driver, pwd);
		Thread.sleep(1000);
		pwd.sendKeys(Keys.CONTROL,"v"); 
		Thread.sleep(1000);
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Entered Manager-TL-Employee password");
		Assert.assertTrue(true, "Failed to Enter Manager-TL-Employee password");

		helper.waitFor(login_button);
		helper.highLightElement(driver, login_button);
		login_button.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on login_button");
		Assert.assertTrue(true, "Failed to clicked on  login_button");
	
		
	}
	
}
