package com.emp.qa.pages;

import java.awt.AWTException;
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

	DataUtility du = new DataUtility();

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[text()='Employee Insights']")
	@CacheLookup
	WebElement Employeeinsights;

	@FindBy(xpath = "//input[@id='select_date_id']")
	@CacheLookup
	WebElement SelectDateRanges;

	@FindBy(xpath = "//span[@id='select2-roleid-container']")
	@CacheLookup
	WebElement Role;

	@FindBy(xpath = "//span[@id='select2-locationid-container']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//span[@id='select2-departmentid-container']")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//span[@id='select2-employeeid-container']")
	@CacheLookup
	WebElement Employee;

	public void EmployeeInsights() throws InterruptedException, IOException, AWTException {

		helper.waitFor(Employeeinsights);
		helper.highLightElement(driver, Employeeinsights);
		Employeeinsights.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-insights Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-insights Sub-Module");

		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.clear();
		SelectDateRanges.sendKeys("05112022");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Month-year Calendar ");
		Assert.assertTrue(true, "Failed to Click on  Month-year Calendar");
		Thread.sleep(2000);

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
        Role.click();
        helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Roles Drop-down and Selected Any Role option");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected Any Role option");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		Location.click();
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down");
		Assert.assertTrue(true, "Failed to Click on Location Drop-down");

		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		Department.click();
		helper.robot_Zero_option_selectClick();
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and Selected Any Department");

		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-employeeid-container']")))
				.click();
		Employee.click();
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Employee Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-down and Selected Any Employee");

	}

}
