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
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Monitoring_Control Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Monitoring_Control Sub-Module");
		
		helper.waitFor(Create_Group);		
		helper.highLightElement(driver, Create_Group);
		Create_Group.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Create_Group Button ");
		Assert.assertTrue(true, "Failed To Click on  Create_Group Button ");
		
		helper.waitFor(Group_Name);		 
		helper.highLightElement(driver, Group_Name);
		Group_Name.sendKeys("Automation code");
		Group_Name.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Group_Name Text Field and Entered Grop name ");
		Assert.assertTrue(true, "Failed To Click on Group_Name Text Field and Entered Grop name");
		
		helper.waitFor(Role);		
		helper.highLightElement(driver, Role);
		helper.selectDropDownValue(Role, "value","roles+2");
		helper.jsCLick(Role);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Role Drop-down and Selected Any role ");
		Assert.assertTrue(true, "Failed To Click on Role Drop-down and Selected Any role");
			
		
		helper.waitFor(Location);		
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "location+2");
		helper.jsCLick(Location);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and Selected Any Location");
		

		
		helper.waitFor(Department);		
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "285");
		helper.jsCLick(Department);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Any Department");

		helper.waitFor(Employees);		
		helper.highLightElement(driver,Employees);
		helper.selectDropDownValue(Employees, "values", "9342");
		helper.jsCLick(Employees);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Employees Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed To Click on Employees Drop-down and Selected Any Employee");
		

		
		helper.waitFor(CreateGroup_Button);		
		helper.highLightElement(driver, CreateGroup_Button);
		helper.Scrollintoview(CreateGroup_Button);
		helper.jsCLick(CreateGroup_Button);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Create-Group Button");
		Assert.assertTrue(true, "Failed To Click on  Create-Group Button");
	}
	
}
