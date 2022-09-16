package com.emp.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

@Listeners(ITestNGListener.class)
public class EmployeeInsightsPage extends BasePage {

	public EmployeeInsightsPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	DataUtility du=new DataUtility();
	
	Helpers helper = new Helpers();

//	@FindBy(xpath = "//a[contains(text(),'Employee Insights')]")
	@FindBy(xpath = "//a[text()='Employee Insights']")
	@CacheLookup
	WebElement Employeeinsights;

	@FindBy(xpath = "//input[contains(@id,'select_date_id')]")
	@CacheLookup
	WebElement SelectDateRanges;

	@FindBy(xpath = "//select[@id='roleid']")
	@CacheLookup
	WebElement Role;

	@FindBy(xpath = "//select[@id='locationid']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//select[@id='departmentid']")
	@CacheLookup
	WebElement Department;

//	@FindBy(xpath = "//select[@id='employeeid']")
	@FindBy(xpath = "//span[@id='select2-employeeid-container']")

	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement user;
	@FindBy(xpath = "//*[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//*[@id='login-form']/button")
	WebElement login_button;
	
	

	public void EmployeeInsights() throws InterruptedException, IOException {

		helper.waitFor(Employeeinsights);
		helper.highLightElement(driver, Employeeinsights);
		Employeeinsights.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employeeinsights");
		Assert.assertTrue(true, "Failed to click on Employeeinsights");

		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.clear();
		SelectDateRanges.sendKeys("05062021");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Monthyear");
		Assert.assertTrue(true, "Failed to send data to Monthyear");

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		helper.selectDropDownValue(Role, "value", "roles+0");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Roles_Dropdown");
		Assert.assertTrue(true, "Failed to clicked on Roles_Drop_Down");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "locs+2");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location_Drop_Down");
		Assert.assertTrue(true, "Failed to click on Location_Drop_Down");

		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "depts+1");
		// Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Department_DropDown");
		Assert.assertTrue(true, "Failed to click on Department_Dropdown");

		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-employeeid-container']"))).click();

		Employee.click();
		
//		helper.selectDropDownValue(Employee, "value", "24712");

		// Employee.click();
		Reporter.log("<B><font color = 'blue'>Stepp6.</font></B> clicked on Employee_Dropdown");
		Assert.assertTrue(true, "Failed to click on Employee__Dropdown");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(du.Data_info("manager_TL_Employee_URL"));
		
		
		
		user.sendKeys(du.Data_info("manager_TL_Employee_User"));
		pwd.sendKeys(du.Data_info("manager_TL_Employee_password"));		
		login_button.click();
		
		
	}

}
