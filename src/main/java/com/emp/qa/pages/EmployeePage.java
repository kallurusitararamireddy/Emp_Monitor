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
	
	@FindBy(xpath = "//select[@id='roles']")
	WebElement Roles;

	@FindBy(xpath = "//select[@id='locations']")
	WebElement Locations;

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
		Reporter.log("<B><font color = 'blue'>Step 1 .</font></B> clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected  Employee-Details Sub-Module ");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step 2 .</font></B> clicked on Show-Entries Drop-down and Selected Any Value ");
		Assert.assertTrue(true, "Failed to click on Show-Entries Drop-down and Selected Any Value");
		
       /*
        *   Deleted all Register Employees
        */
		
		
//		helper.waitForpage();
//		helper.waitFor(SelectAllCheckBox);
//		helper.highLightElement(driver, SelectAllCheckBox);
//		helper.jsCLick(SelectAllCheckBox);
//		Reporter.log("<B><font color = 'blue'>Step 3 .</font></B> Selected All Select Option");
//		Assert.assertTrue(true, "Failed to Select All Select Option");
//
//		helper.waitForpage(); 
//		helper.waitFor(Deletebtn);
//		helper.highLightElement(driver, Deletebtn);
//		helper.jsCLick(Deletebtn);
//		Reporter.log("<B><font color = 'blue'>Step 4 .</font></B> clicked on Delete-Button");
//		Assert.assertTrue(true, "Failed to click on Delete-Button");
//
//		helper.waitForpage();
//		helper.waitFor(deleteModal);
//		helper.highLightElement(driver, deleteModal);
//		helper.jsCLick(deleteModal);
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Reporter.log("<B><font color = 'blue'>Step 5 .</font></B> clicked on Delete-Modal ");
//		Assert.assertTrue(true, "Failed to click on Delete-Modal");

		helper.waitFor(BulkRegisterBtn);
		helper.highLightElement(driver, BulkRegisterBtn);
		BulkRegisterBtn.click();
		Reporter.log("<B><font color = 'blue'>Step 6 .</font></B> clicked on Bulk-Register Button");
		Assert.assertTrue(true, "Failed to click on Bulk-Register Button ");
		

		helper.waitFor(Browse);
		helper.highLightElement(driver, Browse);
		Browse.click();
		Reporter.log("<B><font color = 'blue'>Step 7 .</font></B> clicked on Browse Text Field ");
		Assert.assertTrue(true, "Failed to click on Browse Text Field ");
		helper.uploadFile("C:\\Users\\Official\\Downloads\\Employee Registration.xlsx");
		Thread.sleep(3000);
		

		helper.waitFor(add);
		helper.highLightElement(driver, add);
		add.click();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> clicked on Add Button");
		Assert.assertTrue(true, "Failed to click on Add Button ");

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
		Reporter.log("<B><font color = 'blue'>Step 9 .</font></B> clicked on Roles Drop-down and Selected Any Employee ");
		Assert.assertTrue(true, "Failed to click on Roles Drop-down and Selected Any Employee");
		Thread.sleep(6000);

		helper.waitFor(Locations);
		helper.highLightElement(driver, Locations);
		helper.selectDropDownValue(Locations, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step 10 .</font></B> clicked on Locations Drop-down ans Selected Any Location ");
		Assert.assertTrue(true, "Failed to click on  Locations Drop-down ans Selected Any Location");
		Thread.sleep(7000);
		
		helper.waitFor(Exports);
		helper.highLightElement(driver, Exports);
		Actions act=new Actions(driver);
		act.moveToElement(Exports).click().build().perform();
		Reporter.log("<B><font color = 'blue'>Step 11 .</font></B> clicked on Exports Button ");
		Assert.assertTrue(true, "Failed to click on Exports Button");
		
		
		helper.waitFor(all_select);
		helper.highLightElement(driver, all_select);
		all_select.click();
		Reporter.log("<B><font color = 'blue'>Step 12 .</font></B> clicked on  Select All Option ");
		Assert.assertTrue(true, "Failed to click on click on  Select All Option ");
	
		helper.waitFor(submit);
		helper.highLightElement(driver, submit);
		submit.click();
		Reporter.log("<B><font color = 'blue'>Step 13 .</font></B> clicked on submit Button ");
		Assert.assertTrue(true, "Failed to click on submit Button ");

		
		
	}

}
