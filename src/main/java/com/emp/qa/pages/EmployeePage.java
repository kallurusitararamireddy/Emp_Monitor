package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
public class EmployeePage extends BasePage {

	public EmployeePage(WebDriver driver) {
		super(TestBase.getDriver());
	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	@FindBy(xpath = "//input[@id='SelectAllCheckBox']")
	@CacheLookup
	WebElement SelectAllCheckBox;

	@FindBy(xpath = "//button[@id='delete_btn']")
	@CacheLookup
	WebElement Deletebtn;

	@FindBy(xpath = "//button[@id='deleteModal']")
	WebElement deleteModal;

	@FindBy(xpath = "//button[@id='addBulkRegBtn']")
	WebElement BulkRegisterBtn;

	@FindBy(xpath = "//label[contains(text(),'Bulk Register')]")
	WebElement Browse;

	@FindBy(xpath = "//button[@id='addBulkDomainBtn']")
	WebElement add;

	// @FindBy(xpath="//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
	// WebElement scroller;
	@FindBy(xpath = "//select[@id='roles']")
	WebElement Roles;   
	
	@FindBy(xpath = "//select[@id='locations']")
	WebElement Locations;

	@FindBy(xpath = "//button[@id='ExportButton']")
	WebElement Exports;
	
	@FindBy(xpath = "//input[contains(@value,'submit')]")
	WebElement submit;
	
	
	

	
	public void BulkRegister() throws AWTException, InterruptedException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>EmployeeDetails .</font></B> clickedonEmployeeDetails");
		Assert.assertTrue(true, "Failed to clickedonEmployeeDetails");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>ShowEntries .</font></B> clickedonShowEntries");
		Assert.assertTrue(true, "Failed to clickedonShowEntries");
		

		helper.waitForpage();
		helper.waitFor(SelectAllCheckBox);
		helper.highLightElement(driver, SelectAllCheckBox);
		helper.jsCLick(SelectAllCheckBox);
		Reporter.log("<B><font color = 'blue'>SelectAllCheckBox .</font></B> clickedonSelectAllCheckBox");
		Assert.assertTrue(true, "Failed to clickedonSelectAllCheckBox");

		helper.waitForpage();
		helper.waitFor(Deletebtn);
		helper.highLightElement(driver, Deletebtn);
		helper.jsCLick(Deletebtn);
		Reporter.log("<B><font color = 'blue'>Deletebtn .</font></B> clickedonDeletebtn");
		Assert.assertTrue(true, "Failed to clickedonDeletebtn");

		helper.waitForpage();
		helper.waitFor(deleteModal);
		helper.highLightElement(driver, deleteModal);
		helper.jsCLick(deleteModal);
		Thread.sleep(5000);
		driver.navigate().refresh();
		Reporter.log("<B><font color = 'blue'>deleteModal .</font></B> clickedondeleteModal");
		Assert.assertTrue(true, "Failed to clickedondeleteModal");

		helper.waitFor(BulkRegisterBtn);
		helper.highLightElement(driver, BulkRegisterBtn);
		BulkRegisterBtn.click();
		Reporter.log("<B><font color = 'blue'>BulkRegisterBtn .</font></B> clickedonBulkRegisterBtn");
		Assert.assertTrue(true, "Failed to clickedonBulkRegisterBtn");
		

		helper.waitFor(Browse);
		helper.highLightElement(driver, Browse);
		Browse.click();
		Reporter.log("<B><font color = 'blue'>Browse .</font></B> clickedonBrowse");
		Assert.assertTrue(true, "Failed to clickedonBrowse");
		helper.uploadFile("\"C:\\Users\\Official\\Downloads\\200Licences.xlsx\"");
		Thread.sleep(6000);
		

		helper.waitFor(add);
		helper.highLightElement(driver, add);
		add.click();
		Reporter.log("<B><font color = 'blue'>add .</font></B> clickedonadd");
		Assert.assertTrue(true, "Failed to clickedonadd");

		Thread.sleep(6000);
//		
		// Browse.sendKeys("/C:/Users/Official/Desktop/200Licences.xlsx/");
		// helper.Scrollintoview(scroller);
		helper.waitFor(Roles);
		helper.highLightElement(driver, Roles);
		helper.selectDropDownValue(Roles, "visibletext", "Employee");
		Reporter.log("<B><font color = 'blue'>Roles .</font></B> clickedonRoles");
		Assert.assertTrue(true, "Failed to clickedonRoles");
		Thread.sleep(6000);

		helper.waitFor(Locations);
		helper.highLightElement(driver, Locations);
		helper.selectDropDownValue(Locations, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Locations .</font></B> clickedonLocations");
		Assert.assertTrue(true, "Failed to clickedonALocations");
		Thread.sleep(7000);
		
		helper.waitFor(Exports);
		helper.highLightElement(driver, Exports);
		helper.selectDropDownValue( Exports, "type", "checkboxs");
		Exports.click();
		Reporter.log("<B><font color = 'blue'>Exports .</font></B> clickedonExports");
		Assert.assertTrue(true, "Failed to clickedonExports");
		
		helper.waitFor(submit);
		helper.highLightElement(driver, submit);
		Exports.click();
		Reporter.log("<B><font color = 'blue'>submit .</font></B> clickedonsubmit");
		Assert.assertTrue(true, "Failed to clickedonsubmit");

		
		
		
	}

}
