package com.emp.qa.pages;

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
	
	@FindBy(xpath = "//select[@id='role0']")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//span[@id='select2-role0-container']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//select[@id='locationdept0']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//span[@title='Bangalore']")
	@CacheLookup
	WebElement Banglore;
	
	
	@FindBy(xpath = "//select[@id='getDepartments0']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//option[contains(text(),'Node JS Team')]")
	@CacheLookup
	WebElement NodeJs;
	
	@FindBy(xpath = "//select[@id='employee0']")
	@CacheLookup
	WebElement Employees;
	
	@FindBy(xpath = "//option[contains(text(),'GLB-158-PC - GLB-158')]")
	@CacheLookup
	WebElement GLB;
	
	@FindBy(xpath = "//button[@id='addGroups']")
	@CacheLookup
	WebElement CreateGroup_Button;
	
	@FindBy(xpath = "//iframe[@id='fc_push']")
	@CacheLookup
	WebElement Ok_Button;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	WebElement LastPageButton;
	
	@FindBy(xpath = "//tbody/tr[@id='699']/td[6]/a[3]/i[1]")
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
	
	@FindBy(xpath = "//a[contains(text(),'Save}')]")
	@CacheLookup
	WebElement Save_Website;
	
	@FindBy(xpath = "//button[@id='save_id_button']")
	@CacheLookup
	WebElement Save_Button;
	
	public void MonitorControlPage()throws InterruptedException{
		
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
		
		helper.waitFor(Group_Name);		
		helper.highLightElement(driver, Group_Name);
		Group_Name.sendKeys("Automation code");
		Group_Name.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Group_Name");
		Assert.assertTrue(true, "Failed To Select Group_Name");
		
		helper.waitFor(Role);		
		helper.highLightElement(driver, Role);
		//helper.jsCLick(Role);
		helper.selectDropDownValue(Role, "value","roles+2");
		helper.jsCLick(Role);
		//Role.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Role");
		Assert.assertTrue(true, "Failed To Select Role");
		
//		helper.waitFor(Employee);		
//		helper.highLightElement(driver, Employee);
//		helper.jsCLick(Employee);
//		//helper.Scrollintoview(Employee);
//		Employee.click();
//		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Employee");
//		Assert.assertTrue(true, "Failed To Select Employee");
//		
		
		helper.waitFor(Location);		
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "location+2");
		helper.jsCLick(Location);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Location");
		Assert.assertTrue(true, "Failed To Select Location");
		
//		helper.waitFor(Banglore);		
//		helper.highLightElement(driver,Banglore);
//		helper.jsCLick(Banglore);
//		//Banglore.click();
//		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Banglore");
//		Assert.assertTrue(true, "Failed To Select Banglore");
		
		helper.waitFor(Department);		
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "285");
		helper.jsCLick(Department);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Department");
		Assert.assertTrue(true, "Failed To Select Department");
		
//		helper.waitFor(NodeJs);		
//		helper.highLightElement(driver, NodeJs);
//		helper.jsScrollintoview(NodeJs);
//		NodeJs.click();
//		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on NodeJs");
//		Assert.assertTrue(true, "Failed To Select NodeJs");
//		
		helper.waitFor(Employees);		
		helper.highLightElement(driver,Employees);
		//Employees.clear();
		helper.selectDropDownValue(Employees, "values", "9342");
		helper.jsCLick(Employees);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Employees");
		Assert.assertTrue(true, "Failed To Select Employees");
		
//		helper.waitFor(GLB);		
//		helper.highLightElement(driver,  GLB);
//		 GLB.click();
//		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on  GLB");
//		Assert.assertTrue(true, "Failed To Select  GLB");
		
		helper.waitFor(CreateGroup_Button);		
		helper.highLightElement(driver, CreateGroup_Button);
		helper.Scrollintoview(CreateGroup_Button);
		helper.jsCLick(CreateGroup_Button);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on CreateGroup_Button");
		Assert.assertTrue(true, "Failed To Select CreateGroup_Button");
		
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
