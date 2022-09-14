package com.emp.qa.pages;

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
public class MonitoringControlPage extends BasePage {
	
	public  MonitoringControlPage(WebDriver driver) {
		super(TestBase.getDriver());

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
	
	
	public void MonitoringControlPage()throws InterruptedException{
		
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
	}
	
}
