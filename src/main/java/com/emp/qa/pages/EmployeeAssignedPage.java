package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class EmployeeAssignedPage extends BasePage {

	public EmployeeAssignedPage(WebDriver driver) {
		super(TestBase.getDriver());
	}
			 
		 
			Helpers helper=new Helpers();
			@FindBy(xpath = "//a[@title='Employee-Details']")
			@CacheLookup
			WebElement EmployeeDetails;
			
			@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
			@CacheLookup
			WebElement Scroller;
			
			@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[3]/i[1]")
			WebElement EmployeeAssigned;
			
			@FindBy(xpath = "//select[@id='CompletRoles1']")
			WebElement SelectRole;
			
			@FindBy(xpath = "//select[@id='CompletRoles1']//option[@id='340']")
			WebElement ABCDEFHKK;
			
			@FindBy(xpath = "//select[@id='AppendManagerList']")
			WebElement SelectEmployee;
			
			
			@FindBy(xpath = "//li[@id='select2-AppendManagerList-result-s02g-24614']")
			WebElement TestBulk;
			 
			 
			 
			 
			 public  void EmployeeAssigned() throws InterruptedException{
				 
				    helper.waitFor(EmployeeDetails);
					helper.highLightElement(driver, EmployeeDetails);
					EmployeeDetails.click();
					Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
					Assert.assertTrue(true, "Failed to click on EmployeeDetails");	 
		             
					
					helper.waitFor(Scroller);
					helper.highLightElement(driver,Scroller);
					helper.Scrollintoview(Scroller);
					Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Scroller");
					Assert.assertTrue(true, "Failed to click on Scroller");
					
					
					helper.waitFor(EmployeeAssigned);
					helper.highLightElement(driver, EmployeeAssigned);
					helper.Scrollintoview(EmployeeAssigned);
					EmployeeAssigned.click();
					Reporter.log("<B><font color = 'blue'>Step3.</font></B> Selected EmployeeAssigned");
					Assert.assertTrue(true, "Failed to Select EmployeeAssigned");
					
					helper.waitFor(SelectRole);
					helper.highLightElement(driver, SelectRole);
					helper.Scrollintoview(SelectRole);
					Reporter.log("<B><font color = 'blue'>Step26.</font></B> Selected The Role");
					Assert.assertTrue(true, "Failed to Select The Role");
					
					
					helper.waitFor(ABCDEFHKK);
					helper.highLightElement(driver, ABCDEFHKK);
					ABCDEFHKK.click();
					Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected ABCDEFHKK");
					Assert.assertTrue(true, "Failed to Select ABCDEFHKK");
					
					helper.waitFor(SelectEmployee);
					helper.highLightElement(driver, SelectEmployee);
					helper.selectDropDownValue(SelectEmployee, "value", "24614");
					//SelectEmployee.click();
					Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected SelectEmployee");
					Assert.assertTrue(true, "Failed to Select SelectEmployee");
				
		
					
				}
	

}
