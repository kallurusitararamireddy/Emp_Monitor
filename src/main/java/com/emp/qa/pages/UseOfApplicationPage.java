package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;


public class UseOfApplicationPage extends BasePage {

	public UseOfApplicationPage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}
	Helpers helper=new Helpers();

		
		@FindBy(xpath = "//a[contains(text(),'Web App Usage')]")
		@CacheLookup
		WebElement WebAPPusage;
		
		@FindBy(xpath = "//select[@id='LocationData']")
		@CacheLookup
		WebElement Location;
		
		@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
		@CacheLookup
		WebElement Department;
		
		
		@FindBy(xpath = "//span[@role='presentation']")
		@CacheLookup
		WebElement Employee;
		
		@FindBy(xpath = "//option[contains(text(),'See All Employee')]")
		@CacheLookup
		WebElement All_Employee;
		
		
		@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[3]/div[1]/i[2]")
		@CacheLookup
		WebElement reportrange;
		
		@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
		@CacheLookup
		WebElement Last30days;
		
		
		@FindBy(xpath = "//button[@id='BothButton']")
		@CacheLookup
		WebElement Both_Button;
		
		@FindBy(xpath = "//button[@id='WebButton']")
		@CacheLookup
		WebElement Website_Button;
		

		@FindBy(xpath = "//button[@id='AppButton']")
		@CacheLookup
		WebElement Aplication_Button;
		
		
		@FindBy(xpath = "//button[@id='ExportButton']")
		@CacheLookup
		WebElement ExceltButton;
		
		@FindBy(xpath = "//button[@id='PDFButton']")
		@CacheLookup
		WebElement PDFButton;
		

		@FindBy(xpath = "//select[@name='EmployeeReportTable_length']")
		@CacheLookup
		WebElement Show_entries_Dropdown;
		

		@FindBy(xpath = "//button[@id='exportReport']")
		@CacheLookup
		WebElement Export_Excel;
		
		
		public void UseOfApplicationPage()throws InterruptedException, AWTException{
			
			
			helper.waitFor(WebAPPusage);
			helper.highLightElement(driver, WebAPPusage);
			WebAPPusage.click();
			Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked WebAPPusage");
			Assert.assertTrue(true, "Failed To Select WebAPPusage");

			helper.waitFor(Location);
			helper.highLightElement(driver, Location);
			helper.move_to_element_click_target(Location);
			helper.robot_Zero_option_selectClick();
			Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Select Location DropDown & Select LOcation ");
			Assert.assertTrue(true, "Failed To Select Location DropDown & Select LOcation  ");
			
			helper.waitFor(Department);
			helper.highLightElement(driver, Department);
			helper.move_to_element_click_target(Department);
			helper.robot_Zero_option_selectClick();
			Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department DropDown & Select Department ");
			Assert.assertTrue(true, "Failed to Select Department DropDown & Select Department");
			
			helper.waitFor(Employee);
			helper.highLightElement(driver, Employee);
//			helper.selectDropDownValue(Employee, "visibletext", "See All Employee");
			Employee.click();
			helper.robot_Zero_option_selectClick();
			Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on employee DropDown & Select Employee");
			Assert.assertTrue(true, "Failed Select employee DropDown & Select Employee");
			

			
			
			helper.waitFor(reportrange);
			helper.highLightElement(driver, reportrange);
			helper.jsCLick(reportrange);
			Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on reportrange");
			Assert.assertTrue(true, "Failed to click   reportrange");
			
			helper.waitFor(Last30days);
			helper.highLightElement(driver, Last30days);
			Last30days.click();
			Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Last30days");
			Assert.assertTrue(true, "Failed to Select Last30days");
            Thread.sleep(2000);
			
			
			helper.waitFor(Aplication_Button);
			helper.highLightElement(driver, Aplication_Button);
			Aplication_Button.click();
			Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Aplication_Button");
			Assert.assertTrue(true, "Failed to Select Aplication_Button");
            Thread.sleep(2000);

			helper.waitFor(ExceltButton);
			helper.highLightElement(driver, ExceltButton);
			helper.Scrollintoview(ExceltButton);
			ExceltButton.click();
			Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on ExceltButton ");
			Assert.assertTrue(true, "Failed to click on ExceltButton");
			Thread.sleep(5000);
			
					

			
	}
}
