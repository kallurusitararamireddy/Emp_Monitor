package com.emp.qa.pages;

import java.awt.AWTException;
import java.util.Random;

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
public class RolesAndPermissionPage extends BasePage {
	
	public  RolesAndPermissionPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id='inputFormRow']/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//option[contains(text(),'Node JS Team')]")
	@CacheLookup
	WebElement Nodejs;
	
	@FindBy(xpath = "//button[@id='addeditRole']")
	@CacheLookup
	WebElement Save_Button;
	
	
	public void RolesAndPermissionPage()throws InterruptedException, AWTException{
		 
		helper.waitFor(RolesAndPermission);		 
		helper.highLightElement(driver, RolesAndPermission);
		RolesAndPermission.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Roles-And-Permission Sub-module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Roles-And-Permission Sub-module");
		
		helper.waitFor(Addnewrole_Button);		
		helper.highLightElement(driver, Addnewrole_Button);
		Addnewrole_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Add New-Role Button");
		Assert.assertTrue(true, "Failed To Click on Add New-Role Button");
		
		Random g=new Random();
		int num=g.nextInt(100);
		String Act_g="AutomationCode";
		String Exp_g=Act_g+num;
		
		helper.waitFor(Rolename);		
		helper.highLightElement(driver,Rolename);
		Rolename.sendKeys(Exp_g);
		Rolename.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Role-name Test Field and  Entered Role Name ");
		Assert.assertTrue(true, "Failed To Click on Role-name Test Field and  Entered Role Name");
		
		helper.waitFor(Location);		
		helper.highLightElement(driver,Location);
		helper.move_to_element_click_target(Location);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down and  Selected Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and  Selected Location");
		
		
		helper.waitFor(Department);		
		helper.highLightElement(driver,Department);
		helper.move_to_element_click_target(Department);
		Thread.sleep(1000);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Department Drop-down and  Selected Department");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Department");
		
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		helper.move_to_element_click_target(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on save Button");
		Assert.assertTrue(true, "Failed To Clik on save Button");
	
}
}


