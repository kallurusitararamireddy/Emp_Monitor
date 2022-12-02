package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class EmployeeAssignedPage extends BasePage {

	public EmployeeAssignedPage(WebDriver driver) {
		super(TestBase.getDriver());
	}

	Helpers helper = new Helpers();
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div[2]/div[2]/div/div/div[4]/div")
	@CacheLookup
	WebElement Scroller;

	@FindBy(xpath = "(//*[@id='editedId']/i)[2]")
	WebElement EmployeeAssigned;

	@FindBy(xpath = "//select[@id='CompletRoles1']")
	WebElement SelectRole_dropdown_list;

	@FindBy(xpath = "//*[@id='CompletRoles1']/option[@id='560']")
	WebElement select_role;

	@FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[7]")
	WebElement SelectEmployee;

	@FindBy(xpath = "//*[@id='AssignButton']")
	WebElement Assign_Button;

	public void EmployeeAssigned() throws InterruptedException, AWTException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employe Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employe Module and Selected  Employee_Details Sub-Module");

		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Any Employee  ");
		Assert.assertTrue(true, "Failed to Click on Any Employee  ");

		helper.waitFor(EmployeeAssigned);
		helper.highLightElement(driver, EmployeeAssigned);
		helper.Scrollintoview(EmployeeAssigned);
		EmployeeAssigned.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on  Employee Assigned Option ");
		Assert.assertTrue(true, "Failed to Click on  Employee Assigned Option");

		helper.waitFor(SelectRole_dropdown_list);
		helper.highLightElement(driver, SelectRole_dropdown_list);
		helper.Scrollintoview(SelectRole_dropdown_list);
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on  Role Drop-down and Selected Any Role ");
		Assert.assertTrue(true, "Failed to Click  on  Role Drop-down and Selected Any Role");

		helper.waitFor(select_role);
		helper.highLightElement(driver, select_role);
		select_role.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Selected Employee");
		Assert.assertTrue(true, "Failed to Select Employee");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		SelectEmployee.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		SelectEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Selected Any Employee");
		Assert.assertTrue(true, "Failed to Select Any Employee");

		helper.waitFor(Assign_Button);
		helper.highLightElement(driver, Assign_Button);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='AssignButton']"))).click();

		Assign_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Assign_Button");
		Assert.assertTrue(true, "Failed to Click on Assign_Button");

	}

}
