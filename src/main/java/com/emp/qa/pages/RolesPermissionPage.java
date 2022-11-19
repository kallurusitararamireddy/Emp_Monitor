package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class RolesPermissionPage extends BasePage {

	public RolesPermissionPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Roles and Permission')]")
	@CacheLookup
	WebElement RolesAndPermission;

	@FindBy(xpath = "//a[@href='#'][contains(.,'Add New Role')]")
	@CacheLookup
	WebElement Addnewrole_Button;

	@FindBy(xpath = "//input[@id='roleNameInput']")
	@CacheLookup
	WebElement Rolename;

	@FindBy(xpath = "//*[@id='inputFormRow']/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//body/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//span[@class='select2-results']/ul/li[2]")
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


	@FindBy(xpath = "//*[@id='role559']/td[7]/a[3]/i")
	@CacheLookup
	WebElement Settings;

	@FindBy(xpath = "//div[@id='EmployeeWebUsageSettings']/a/i")
	@CacheLookup
	WebElement EmployeeWebsiteusage;

	@FindBy(xpath = "//input[@id='check-EmployeeWebUsageView-1']")
	@CacheLookup
	WebElement checkbox;

	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement save;

	public void RolesPermissionPage() throws InterruptedException, AWTException {

		helper.waitFor(RolesAndPermission);
		helper.highLightElement(driver, RolesAndPermission); 
		RolesAndPermission.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Sttings Module and Selected  Roles-And-Permission Sub-module ");
		Assert.assertTrue(true, "Failed To click on  Sttings Module and Selected  Roles-And-Permission Sub-module");

		helper.waitFor(Addnewrole_Button);
		helper.highLightElement(driver, Addnewrole_Button);
		Addnewrole_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Add New-Role Button");
		Assert.assertTrue(true, "Failed To Select Add New-Role Button");

		Random g=new Random();
		int num=g.nextInt(100);
		String Act_g="AutomationCode";
		String Exp_g=Act_g+num;
		
		helper.waitFor(Rolename);		
		helper.highLightElement(driver,Rolename);
		Rolename.sendKeys(Exp_g);
		Rolename.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Role-name Test field and  Entered Role Name ");
		Assert.assertTrue(true, "Failed To click on Role-name Test field and  Entered Role Name");
		
		helper.waitFor(Location);		
		helper.highLightElement(driver,Location);
		helper.move_to_element_click_target(Location);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location Drop-down and  Selected Location ");
		Assert.assertTrue(true, "Failed To click on Location Drop-Down & Select Location");
		
		
		helper.waitFor(Department);		
		helper.highLightElement(driver,Department);
		helper.move_to_element_click(Department);
		Thread.sleep(1000);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Department Drop-down and  Select Department");
		Assert.assertTrue(true, "Failed To click on Department Drop-down and  Select Department");
		
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		Thread.sleep(5000);
		helper.jsCLick(Save_Button);
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on save Button");
		Assert.assertTrue(true, "Failed To clik on save Button");
		
		driver.navigate().refresh();

		Thread.sleep(2000);


		helper.highLightElement(driver, LastpageButton);
		helper.Scrollintoview(LastpageButton);
        helper.move_to_element_click(LastpageButton);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on  Last-page Button");
		Assert.assertTrue(true, "Failed to click on Last-page Button");
		Thread.sleep(3000);

		helper.highLightElement(driver, write_CheckBox);
		helper.Scrollintoview(write_CheckBox);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked write_CheckBox");
		Assert.assertTrue(true, "Failed to click write_CheckBox");

		helper.highLightElement(driver, Delete_CheckBox);
		helper.Scrollintoview(Delete_CheckBox);

		List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@id='deleteC']"));

		int size = AllCheckboxes.size();

		System.out.println(size);

		for (int i = 0; i < size; i++) {

			AllCheckboxes.get(i).click();

		}

		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on  Delete Check Box");
		Assert.assertTrue(true, "Failed to click on Delete Check-Box");

		helper.waitFor(Settings);
		helper.highLightElement(driver, Settings);
		helper.Scrollintoview(Settings);
		helper.jsCLick(Settings);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on  Settings");
		Assert.assertTrue(true, "Failed To click on  Settings");
		Thread.sleep(2000);

		helper.waitFor(EmployeeWebsiteusage);
		helper.highLightElement(driver, EmployeeWebsiteusage);
		EmployeeWebsiteusage.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on  Employee-Website-usage Button ");
		Assert.assertTrue(true, "Failed To click on  Employee-Website-usage Button");

		helper.waitFor(checkbox);
		helper.highLightElement(driver, checkbox);
		helper.jsCLick(checkbox);
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> selected All option (check-box )");
		Assert.assertTrue(true, "Failed To select All option (check-box )");

		helper.waitFor(save);
		helper.highLightElement(driver, save);
		helper.jsCLick(save);
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on  save Button");
		Assert.assertTrue(true, "Failed To click on  save Button ");

	}

}
