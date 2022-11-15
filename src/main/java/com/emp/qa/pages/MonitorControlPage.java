package com.emp.qa.pages;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class MonitorControlPage extends BasePage {

	public MonitorControlPage(WebDriver driver) {
		super(driver);
		
	}
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Monitoring Control')]")
	@CacheLookup
	WebElement MonitoringControl;
	
	@FindBy(xpath = "//a[contains(text(),'Create Group')]")
	@CacheLookup
	WebElement Create_Group;
	
	@FindBy(xpath = "//input[@id='groupsName']")
	@CacheLookup
	WebElement Group_Name;
	
	@FindBy(xpath = "//*[@id='select2-role0-container']")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//*[@id='select2-locationdept0-container']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//span[@id='select2-role0-container']")
	@CacheLookup
	WebElement Employee;

	
	@FindBy(xpath = "//*[@id=\"select2-getDepartments0-container\"]")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//*[@id=\"hide_Div\"]/div[4]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement Employees;
	
	@FindBy(xpath = "//option[contains(text(),'GLB-158-PC - GLB-158')]")
	@CacheLookup
	WebElement GLB;
	
	@FindBy(xpath = "//button[@id='addGroups']")
	@CacheLookup
	WebElement CreateGroup_Button;
	
	
	@FindBy(xpath = "/html/body/div[5]/div/div[3]/button[1]")
	@CacheLookup
	WebElement Assign_ok_button;
	
	@FindBy(xpath = "//iframe[@id='fc_push']")
	@CacheLookup
	WebElement Ok_Button;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	WebElement LastPageButton;
	
	/*
	 *  Change with X-path 
	 */
	
	@FindBy(xpath = "//tbody/tr[@id='726']/td[6]/a[3]/i")
	@CacheLookup
	WebElement GroupSettings;
	
	@FindBy(xpath = "//a[contains(@data-target,'#TrackingFeatures')]")
	@CacheLookup     
	WebElement TrackingFeatures;
	
	@FindBy(xpath = "//button[contains(text(),'Advanced Settings')]")
	@CacheLookup
	WebElement AdvanceSettings;
	
	
	@FindBy(xpath = "//select[@id='websiteMonitorWebsite']")
	@CacheLookup
	WebElement MonitorOnlyThis;
	
	@FindBy(xpath = "//*[@id='Websites_adv']/div/div/div[4]/a[1]")
	@CacheLookup
	WebElement Save_Website;
	
	@FindBy(xpath = "//button[@id='save_id_button']")
	@CacheLookup
	WebElement Save_Button;
	
	public void MonitorControlPage()throws InterruptedException, AWTException{
		
		helper.waitFor(MonitoringControl);		
		helper.highLightElement(driver, MonitoringControl);
		MonitoringControl.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on MonitoringControl");
		Assert.assertTrue(true, "Failed To Select MonitoringControl");
		
		helper.waitFor(Create_Group);		
		helper.highLightElement(driver, Create_Group);
		Create_Group.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Create_Group");
		Assert.assertTrue(true, "Failed To Select Create_Group");
		
		
		Random r=new Random();
		int num=r.nextInt(1000);
		String act_name="Automation code";
		String exp_name=act_name+num;
		
		helper.waitFor(Group_Name);		
		helper.highLightElement(driver, Group_Name);
		Group_Name.sendKeys(exp_name);
		Group_Name.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Group_Name");
		Assert.assertTrue(true, "Failed To Select Group_Name");
		
		helper.waitFor(Role);		
		helper.highLightElement(driver, Role);
	    helper.move_to_element_click_target(Role);  
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Role");
		Assert.assertTrue(true, "Failed To Select Role");
		
		
		
		helper.waitFor(Location);		
		helper.highLightElement(driver, Location);
	    helper.move_to_element_click_target(Location);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Location");
		Assert.assertTrue(true, "Failed To Select Location");
		

		helper.waitFor(Department);		
		helper.highLightElement(driver, Department);
	    helper.move_to_element_click_target(Department);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Department");
		Assert.assertTrue(true, "Failed To Select Department");
		
		helper.waitFor(Employees);		
		helper.highLightElement(driver,Employees);
	    helper.move_to_element_click_target(Employees);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Employees");
		Assert.assertTrue(true, "Failed To Select Employees");
		

		
		helper.waitFor(CreateGroup_Button);		
		helper.highLightElement(driver, CreateGroup_Button);
		helper.Scrollintoview(CreateGroup_Button);
		helper.jsCLick(CreateGroup_Button);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on CreateGroup_Button");
		Assert.assertTrue(true, "Failed To Select CreateGroup_Button");
		Thread.sleep(2000); 
		
		
//		helper.waitFor(Assign_ok_button);		
//		helper.highLightElement(driver, Assign_ok_button);
//		Assign_ok_button.click();
//		
//		helper.waitFor(Ok_Button);		
//		helper.highLightElement(driver, CreateGroup_Button);
//		helper.Scrollintoview(Ok_Button);
//		helper.jsCLick(Ok_Button);
//		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Ok_Button");
//		Assert.assertTrue(true, "Failed To Select Ok_Button");
		
		helper.waitFor(LastPageButton);		
		helper.highLightElement(driver, LastPageButton);
		helper.Scrollintoview(LastPageButton);
		helper.jsCLick(LastPageButton);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on LastPageButton");
		Assert.assertTrue(true, "Failed To Select LastPageButton");
		Thread.sleep(2000);
		
		helper.waitFor(GroupSettings);		
		helper.highLightElement(driver, GroupSettings);
		helper.Scrollintoview(GroupSettings);
		helper.jsCLick(GroupSettings);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on GroupSettings");
		Assert.assertTrue(true, "Failed To Select GroupSettings");
		
		helper.waitFor(TrackingFeatures);		
		helper.highLightElement(driver, TrackingFeatures);
		helper.Scrollintoview(TrackingFeatures);
		helper.jsCLick(TrackingFeatures);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on TrackingFeatures");
		Assert.assertTrue(true, "Failed To Select TrackingFeatures");
		
		
		helper.waitFor(AdvanceSettings);		 
		helper.highLightElement(driver, AdvanceSettings);
		helper.Scrollintoview(AdvanceSettings);
		helper.jsCLick(AdvanceSettings);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on AdvanceSettings");
		Assert.assertTrue(true, "Failed To Select AdvanceSettings");
		
//		Assert.assertEquals(AdvanceSettings.click(), "Failed to click on checkin_button",AdvanceSettings.isDisplayed() );
		 
		helper.waitFor(MonitorOnlyThis);		
		helper.highLightElement(driver, MonitorOnlyThis);
		helper.Scrollintoview(MonitorOnlyThis);
		//MonitorOnlyThis.sendKeys("www.youtube.com");
		helper.jsCLick(MonitorOnlyThis);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on MonitorOnlyThis");
		Assert.assertTrue(true, "Failed To Select MonitorOnlyThis");
		
		helper.waitFor(Save_Website);		
		helper.highLightElement(driver, Save_Website);
		helper.jsCLick(Save_Website);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Save_Website");
		Assert.assertTrue(true, "Failed To Select Save_Website");
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver, Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Select Save_Button");
		
		
	}
}
