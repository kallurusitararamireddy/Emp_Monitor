package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class RolesPermissionPage extends BasePage {

	public RolesPermissionPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Roles and Permission')]")
	@CacheLookup
	WebElement RolesAndPermission;
	
	@FindBy(xpath = "//a[@href='#'][contains(.,'Add New Role')]")
	@CacheLookup
	WebElement Addnewrole_Button;
	
	@FindBy(xpath = "//input[@id='roleNameInput']")
	@CacheLookup
	WebElement Rolename;
	
	@FindBy(xpath = "//select[@name='locationDept[1][location]']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//option[contains(text(),'Node JS Team')]")
	@CacheLookup
	WebElement Nodejs;
	
	@FindBy(xpath = "//button[@id='addeditRole']")
	@CacheLookup
	WebElement Save_Button;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Showentries;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	WebElement LastpageButton;
	
	@FindBy(xpath = "//input[@id='writeC']")
	@CacheLookup
	WebElement write_CheckBox;
	
	@FindBy(xpath = "//input[@id='deleteC']")
	@CacheLookup
	WebElement Delete_CheckBox;
	
	
	
	@FindBy(xpath = "//tbody/tr[@id='role451']/td[7]/a[3]/i[1]")
	@CacheLookup
	WebElement Settings;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[1]")
	@CacheLookup
	WebElement EmployeeWebsiteusage;
	
	
	@FindBy(xpath = "//input[@id='check-EmployeeWebUsageView-1']")
	@CacheLookup
	WebElement checkbox;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement save;
	
	
	
	
	public void RolesPermissionPage()throws InterruptedException{
		
		helper.waitFor(RolesAndPermission);		
		helper.highLightElement(driver, RolesAndPermission);
		RolesAndPermission.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on RolesAndPermission");
		Assert.assertTrue(true, "Failed To Select RolesAndPermission");
		
		helper.waitFor(Addnewrole_Button);		
		helper.highLightElement(driver, Addnewrole_Button);
		Addnewrole_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Addnewrole_Button");
		Assert.assertTrue(true, "Failed To Select Addnewrole_Button");
		
		helper.waitFor(Rolename);		
		helper.highLightElement(driver,Rolename);
		Rolename.sendKeys("ABCcode");
		Rolename.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Rolename");
		Assert.assertTrue(true, "Failed To Select Rolename");
		
		helper.waitFor(Location);		
		helper.highLightElement(driver,Location);
		helper.selectDropDownValue(Location, "value", "2");
		//helper.waitFor(Location);
		helper.jsCLick(Location);
		//Location.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location");
		Assert.assertTrue(true, "Failed To Select Location");
		
		
		helper.waitFor(Department);		
		helper.highLightElement(driver,Department);
		Department.click();
		//helper.selectDropDownValue(Department, "value", "1");
		//helper.jsCLick(Department);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Department");
		Assert.assertTrue(true, "Failed To Select Department");
		
		helper.waitFor(Nodejs);		
		helper.highLightElement(driver,Nodejs);
		helper.jsCLick(Nodejs);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> selected nodejs");
		Assert.assertTrue(true, "Failed To Select NodeJs value");
		Thread.sleep(5000);
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on save button");
		Assert.assertTrue(true, "Failed To clik on save button");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		
//		helper.highLightElement(driver, Showentries);
//		helper.selectDropDownValue(Showentries, "index", "3");
//		Showentries.click();
//		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clickedonShowEntries");
//		Assert.assertTrue(true, "Failed to clickedonShowEntries");
		
		helper.highLightElement(driver, LastpageButton);
		helper.Scrollintoview(LastpageButton);
		LastpageButton.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked LastpageButton");
		Assert.assertTrue(true, "Failed to click LastpageButton");
		
		
		helper.highLightElement(driver, write_CheckBox);
		helper.Scrollintoview(write_CheckBox);
		write_CheckBox.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked write_CheckBox");
		Assert.assertTrue(true, "Failed to click write_CheckBox");
		
		helper.highLightElement(driver, Delete_CheckBox);
		helper.Scrollintoview(Delete_CheckBox);
		Delete_CheckBox.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked Delete_CheckBox");
		Assert.assertTrue(true, "Failed to click Delete_CheckBox");
		
		
		helper.waitFor(Settings);		
		helper.highLightElement(driver,Settings);
		helper.Scrollintoview(Settings);
		helper.jsCLick(Settings);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> selected Settings");
		Assert.assertTrue(true, "Failed To Select Settings");
		
		
		helper.waitFor(EmployeeWebsiteusage);		
		helper.highLightElement(driver,EmployeeWebsiteusage);
		helper.jsCLick(EmployeeWebsiteusage);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> selected EmployeeWebsiteusage");
		Assert.assertTrue(true, "Failed To Select EmployeeWebsiteusage");
		
		
		helper.waitFor(checkbox);		
		helper.highLightElement(driver,checkbox);
		helper.jsCLick(checkbox);
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> selected checkbox");
		Assert.assertTrue(true, "Failed To Select checkbox");
		
		
		helper.waitFor(save);		
		helper.highLightElement(driver,save);
		helper.jsCLick(save);
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> selected save");
		Assert.assertTrue(true, "Failed To Select save");
		
	
}

}
