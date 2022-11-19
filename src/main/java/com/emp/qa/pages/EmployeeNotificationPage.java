package com.emp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

@Listeners(ITestNGListener.class)
public class EmployeeNotificationPage extends BasePage {
	public EmployeeNotificationPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Employee-Notification')]")
	@CacheLookup
	WebElement EmployeeNotification;

	@FindBy(xpath = "//select[@onchange='locChanged(this);']")
	@CacheLookup
	WebElement SelectLocation;

	@FindBy(xpath = "//select[@id='deptoption']")
	@CacheLookup
	WebElement SelectDepartment;

	@FindBy(xpath = "//select[@id='empoption']")
	@CacheLookup
	WebElement Allemployee;

	@FindBy(xpath = "//*[@id='empoption']/option[2]")
	@CacheLookup
	WebElement Allemploye;

	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement Date;

	@FindBy(xpath = "//li[contains(text(),'Last Month')]")
	@CacheLookup
	WebElement Lastmonth;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	WebElement CSV;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement PDF;

	public void EmployeeNotification() throws InterruptedException {
		helper.waitFor(EmployeeNotification);
		helper.highLightElement(driver, EmployeeNotification);
		EmployeeNotification.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on Employee Module and  Employee Notification Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and  Employee Notification Sub-Module");

		helper.waitFor(SelectLocation);
		helper.highLightElement(driver, SelectLocation);
		helper.selectDropDownValue(SelectLocation, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed To click on  Location Drop-down and Selected Any Location ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.selectDropDownValue(SelectDepartment, "index", "2");
		SelectDepartment.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to click on  Department Drop-down and Selected Any Department");

		helper.waitFor(Allemployee);
		helper.highLightElement(driver, Allemployee);
		Allemployee.click(); 
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Employee Drop-down  ");
		Assert.assertTrue(true, "Failed to click on Employee Drop-down a");

		helper.waitFor(Allemploye);
		helper.highLightElement(driver, Allemploye);
		Allemploye.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Selected Any Employee");
		Assert.assertTrue(true, "Failed to Select Any Employee");

		helper.waitFor(Date);
		helper.highLightElement(driver, Date);
		Date.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Calendar and Selected Day's");
		Assert.assertTrue(true, "Failed to click  on Calendar and Selected Day's");

		helper.waitFor(Lastmonth);
		helper.highLightElement(driver, Lastmonth);
		Lastmonth.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Last-month");
		Assert.assertTrue(true, "Failed to click on  Last-month");

		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']"))).click();
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on CSV Button");
		Assert.assertTrue(true, "Failed to click on CSV Button");

		helper.waitFor(PDF);
		helper.highLightElement(driver, PDF);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-danger']"))).click();
		PDF.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on PDF Button");
		Assert.assertTrue(true, "Failed to click on PDF Button");
		Thread.sleep(6000);

	}
}
