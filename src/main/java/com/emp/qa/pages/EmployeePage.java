package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	/*
	 *   Change with
	 */
	
	
	
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
	
	
	@FindBy(xpath = "/html/body/div[7]/div/div[3]/button[1]")
	WebElement Invalid_Users_List;
	

	// @FindBy(xpath="//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
	// WebElement scroller;
	@FindBy(xpath = "//select[@id='roles']")
	WebElement Roles;

	@FindBy(xpath = "//select[@id='locations']")
	WebElement Locations;

//	@FindBy(xpath = "//button[@id='ExportButton']")
	@FindBy(id =  "ExportButton")
	WebElement Exports;
	
	@FindBy(id =  "checklocDownload")
	WebElement all_select;

	@FindBy(xpath =   "//*[@value='submit']")
	WebElement submit;

	public void BulkRegister() throws AWTException, InterruptedException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step 1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to clicked on EmployeeDetails");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step 2 .</font></B> clicked on ShowEntries");
		Assert.assertTrue(true, "Failed to clicked on ShowEntries");
		
       /*
        *   Deleted all Register Employees
        */
		
		
//		helper.waitForpage();
//		helper.waitFor(SelectAllCheckBox);
//		helper.highLightElement(driver, SelectAllCheckBox);
//		helper.jsCLick(SelectAllCheckBox);
//		Reporter.log("<B><font color = 'blue'>Step 3 .</font></B> clickedonSelectAllCheckBox");
//		Assert.assertTrue(true, "Failed to clickedonSelectAllCheckBox");
//
//		helper.waitForpage(); 
//		helper.waitFor(Deletebtn);
//		helper.highLightElement(driver, Deletebtn);
//		helper.jsCLick(Deletebtn);
//		Reporter.log("<B><font color = 'blue'>Step 4 .</font></B> clickedonDeletebtn");
//		Assert.assertTrue(true, "Failed to clickedonDeletebtn");
//
//		helper.waitForpage();
//		helper.waitFor(deleteModal);
//		helper.highLightElement(driver, deleteModal);
//		helper.jsCLick(deleteModal);
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Reporter.log("<B><font color = 'blue'>Step 5 .</font></B> clicked on deleteModal");
//		Assert.assertTrue(true, "Failed to clicked on deleteModal");

		helper.waitFor(BulkRegisterBtn);
		helper.highLightElement(driver, BulkRegisterBtn);
		BulkRegisterBtn.click();
		Reporter.log("<B><font color = 'blue'>Step 6 .</font></B> clicked on BulkRegisterBtn");
		Assert.assertTrue(true, "Failed to clicked on BulkRegisterBtn");
		

		helper.waitFor(Browse);
		helper.highLightElement(driver, Browse);
		Browse.click();
		Reporter.log("<B><font color = 'blue'>Step 7 .</font></B> clicked on Browse");
		Assert.assertTrue(true, "Failed to clickedonBrowse");
		helper.uploadFile("C:\\Users\\Official\\Downloads\\Employee Registration.xlsx");
		Thread.sleep(3000);
		

		helper.waitFor(add);
		helper.highLightElement(driver, add);
		add.click();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> clicked on add");
		Assert.assertTrue(true, "Failed to clicked on add");

		Thread.sleep(6000);
//		Browse.sendKeys("/C:/Users/Official/Desktop/200Licences.xlsx/");
//      helper.Scrollintoview(scroller);
		
		
		/** Repeated some Employee register Xml file  using click option
		 * 
		 *    Invalid_Users_List  
		 *    
		 **/
		
//		Invalid_Users_List.click();
		
		
		
		helper.waitFor(Roles);
		helper.highLightElement(driver, Roles);
		helper.selectDropDownValue(Roles, "visibletext", "Employee");
		Reporter.log("<B><font color = 'blue'>Step 9 .</font></B> clicked on Roles");
		Assert.assertTrue(true, "Failed to clicked on Roles");
		Thread.sleep(6000);

		helper.waitFor(Locations);
		helper.highLightElement(driver, Locations);
		helper.selectDropDownValue(Locations, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step 10 .</font></B> clicked on Locations");
		Assert.assertTrue(true, "Failed to clicked on ALocations");
		Thread.sleep(7000);
		
		helper.waitFor(Exports);
		helper.highLightElement(driver, Exports);
//		helper.selectDropDownValue( Exports, "type", "checkboxs");
//        Exports.click();

		Actions act=new Actions(driver);
		act.moveToElement(Exports).click().build().perform();
		
		Reporter.log("<B><font color = 'blue'>Step 11 .</font></B> clicked on Exports");
		Assert.assertTrue(true, "Failed to clicked on Exports");
		
		
		helper.waitFor(all_select);
		helper.highLightElement(driver, all_select);
		all_select.click();
		Reporter.log("<B><font color = 'blue'>Step 12 .</font></B> clicked all select");
		Assert.assertTrue(true, "Failed to clicked on submit");
	
		helper.waitFor(submit);
		helper.highLightElement(driver, submit);
		submit.click();
		Reporter.log("<B><font color = 'blue'>Step 13 .</font></B> clicked on submit");
		Assert.assertTrue(true, "Failed to clicked on submit");

		
		
	}

}
