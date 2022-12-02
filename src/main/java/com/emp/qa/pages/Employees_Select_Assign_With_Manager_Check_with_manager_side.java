package com.emp.qa.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

public class Employees_Select_Assign_With_Manager_Check_with_manager_side extends BasePage {

	public Employees_Select_Assign_With_Manager_Check_with_manager_side(WebDriver driver) {
		super(driver);
	}

	static Properties pro;

	DataUtility du = new DataUtility();
	Helpers helper = new Helpers();

	/* (1) Employee module */
	@FindBy(xpath = "//i[@title='Employee']")
	WebElement employee;

	@FindBy(xpath = "//a[@title='Employee-Details']")
	WebElement Employee_Details;

	/*
	 * Select Employees
	 */

	@FindBy(xpath = "//input[@id='SelectCheckbox25678']")
	WebElement one_emp;
	@FindBy(xpath = "//input[@id='SelectCheckbox25679']")
	WebElement two_emp;
	@FindBy(xpath = "//input[@id='SelectCheckbox25677']")
	WebElement three_emp;
	@FindBy(xpath = "//input[@id='SelectCheckbox25676']")
	WebElement four_emp;

	@FindBy(xpath = "//button[@id='Manager_btn']")
	WebElement button_Assign_manager;

	@FindBy(xpath = "//select[@id='CompletRoles2']")
	WebElement select_role;
	@FindBy(xpath = "//select[@id='CompletRoles2']/option[58]")
	WebElement select_manager;

	@FindBy(xpath = "//select[@id='SingleAppendTLlist']")
	WebElement select_Employee;
	@FindBy(xpath = "//select[@id='SingleAppendTLlist']/option[3]")
	WebElement select_option_employee;

	@FindBy(xpath = "//button[@id='Manager-selectIcon']")
	WebElement assign;

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
	WebElement Employee;
	@FindBy(xpath = "//a[text()='Manager']")
	WebElement Manager;

	@FindBy(xpath = "//a[text()='Team Lead']")
	WebElement TL;

	@FindBy(xpath = "//span[text()='Employee']")
	WebElement employee_module;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/ul/li[2]/ul/li[2]/a")
	WebElement employee_Attendance;

	public void Assign_Manager_Check_with_manager_side() throws Exception {


		/* Admin side Assign one manager */
		
		helper.waitFor(employee);
		helper.highLightElement(driver, employee);
		employee.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> Clicked on Employee Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module ");

		helper.waitFor(Employee_Details);
		helper.highLightElement(driver, Employee_Details);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Employee-Details']"))).click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Employee_Details Sub-Modulen ");
		Assert.assertTrue(true, "Failed to Clicked on Employee_Details Sub-Module ");
		Thread.sleep(2000);

		helper.waitFor(one_emp);
		helper.highLightElement(driver, one_emp);
		one_emp.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Selected  Employee");
		Assert.assertTrue(true, "Failed to Select on Employee");

		helper.waitFor(two_emp);
		helper.highLightElement(driver, two_emp);
		two_emp.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Selected  Employee");
		Assert.assertTrue(true, "Failed to Select on Employee");

		helper.waitFor(three_emp);
		helper.highLightElement(driver, three_emp);
		three_emp.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Selected  Employee");
		Assert.assertTrue(true, "Failed to Select on Employee");

		helper.waitFor(four_emp);
		helper.highLightElement(driver, four_emp);
		four_emp.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Selected  Employee");
		Assert.assertTrue(true, "Failed to Select on Employee");

		helper.waitFor(button_Assign_manager);
		helper.highLightElement(driver, button_Assign_manager);
		button_Assign_manager.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Assign_manager Button");
		Assert.assertTrue(true, "Failed to Clicked on Assign_manager Button");

		helper.waitFor(select_role);
		helper.highLightElement(driver, select_role);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='CompletRoles2']"))).click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Role Drop-down ");
		Assert.assertTrue(true, "Failed to Clicked on Role Drop-down");

		helper.waitFor(select_manager);
		helper.highLightElement(driver, select_manager);
		select_manager.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Selected  manager");
		Assert.assertTrue(true, "Failed to Selected on manager");

		helper.waitFor(select_Employee);
		helper.highLightElement(driver, select_Employee);
		select_Employee.click();
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Clicked on select_Employee option");
		Assert.assertTrue(true, "Failed to Click on select_Employee option");

		Thread.sleep(4000);

		helper.waitFor(select_option_employee);
		helper.highLightElement(driver, select_option_employee);
		select_option_employee.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Selelected  employee");
		Assert.assertTrue(true, "Failed to Select on Employee");

		Thread.sleep(4000);

		helper.waitFor(assign);
		helper.highLightElement(driver, assign);
		assign.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Assign-button");
		Assert.assertTrue(true, "Failed to Click on Assign-button");

	}

	/*
	 * Login Manager TL Employee log side Check out
	 */

	public void Login_Manager_TL_Employee_log_side_Check_out() throws Exception

	{


		driver.switchTo().newWindow(WindowType.TAB);

		Reporter.log("<B><font color = 'blue'>Step13.</font></B>  Switch to New TAB - Login With Manager");
		Assert.assertTrue(true, "Switch to New TAB - Login With Manager");

		driver.get(du.Data_info("manager_TL_Employee_URL"));
		Reporter.log("<B><font color = 'blue'>Step14.</font></B>  Manager-TL-Employee - log-page-URL ");
		Assert.assertTrue(true, "Switch to New TAB - Manager-TL-Employee - log-page");

		helper.waitFor(user);
		helper.highLightElement(driver, user);
		user.sendKeys(du.Data_info("manager_TL_Employee_User"));
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked on User Text Field and Entered  User-name (Manager-TL-Employee)");
		Assert.assertTrue(true, "Failed to Click on User Text Field and Enter  User-name");

		helper.waitFor(pwd);
		helper.highLightElement(driver, pwd);
		pwd.sendKeys(du.Data_info("manager_TL_Employee_password"));
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Clicked on Password  Text Field and Entered the password (Manager-TL-Employee)");
		Assert.assertTrue(true, "Failed to Click on Password  Text Field and Enter  password");

		helper.waitFor(login_button);
		helper.highLightElement(driver, login_button);
		login_button.click();
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> Clicked on login_button");
		Assert.assertTrue(true, "Failed to Click on  login_button");

		helper.waitFor(role_change);
		helper.highLightElement(driver, role_change);
		role_change.click();
		role_change.click();
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on  role_change-button");
		Assert.assertTrue(true, "Failed to Clicked on  role_change-button");

		Thread.sleep(1000);
		helper.waitFor(Manager);
		helper.highLightElement(driver, Manager);
		Manager.click();
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> Selected the Manager");
		Assert.assertTrue(true, "Failed to Select the Manager");

		helper.waitFor(employee_module);
		helper.highLightElement(driver, employee_module);
		employee_module.click();
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> Clicked on  Employee Module");
		Assert.assertTrue(true, "Failed to Click on Employee Module");

		Thread.sleep(1000);
		helper.waitFor(employee_Attendance);
		helper.highLightElement(driver, employee_Attendance);
		employee_Attendance.click();
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> Clicked on  Employee_Attendance Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee_Attendance Sub-Module");

	}

}
