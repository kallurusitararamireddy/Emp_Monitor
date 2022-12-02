package com.emp.qa.pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class EditEmployeePage extends BasePage {

	public EditEmployeePage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//tbody[@id='fetch_Details']/tr[1]/td[10]/a[5]")
	@CacheLookup
	WebElement EditEmployee;

	@FindBy(xpath = "//input[@id='fullName']")
	@CacheLookup
	WebElement LastName;

	@FindBy(xpath = "//textarea[@id='Employeeaddress']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = "//button[@id='emp-edit']")
	@CacheLookup
	WebElement Update_Button;

	public void EditEmployee() throws InterruptedException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-module");

 

		helper.waitFor(EditEmployee);
		helper.Scrollintoview(EditEmployee);
		helper.highLightElement(driver, EditEmployee);
		helper.move_to_element_click(EditEmployee); 
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Edit-Employee Option");
		Assert.assertTrue(true, "Failed to Click on Edit-Employee Option ");


		helper.waitFor(LastName);
		helper.highLightElement(driver, LastName);
		LastName.clear();
		LastName.sendKeys("CODE"); 
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Edited  Modified  LastName");
		Assert.assertTrue(true, "Failed to Edit Modify  LastName");
		Thread.sleep(3000);

		Random d = new Random();
		int d_num = d.nextInt(10000);

		helper.waitFor(Address);
		helper.highLightElement(driver, Address);
		Address.clear();
		Address.sendKeys("HousNo:1234,Andhra" + d_num);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Edited  Modified  Address");
		Assert.assertTrue(true, "Failed to Edit Modify  Address");
		Thread.sleep(3000);

		helper.waitFor(Update_Button);
		helper.highLightElement(driver, Update_Button);
		helper.Scrollintoview(Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B>  Clicked on Update-Button");
		Assert.assertTrue(true, "Failed to Click On Update-Button");
		Thread.sleep(3000);

	}

}
