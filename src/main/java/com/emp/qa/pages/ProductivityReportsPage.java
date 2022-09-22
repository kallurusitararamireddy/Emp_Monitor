package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
@Listeners(ITestNGListener.class)
public class ProductivityReportsPage extends BasePage {
	
		public  ProductivityReportsPage(WebDriver driver) {
			super(TestBase.getDriver());

	}
		Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Productivity Reports')]")
		@CacheLookup
		WebElement ProductivityReports;
		
//		@FindBy(xpath = "//select[contains(@onchange,'locChanged(this);')]")
		@FindBy(xpath = "//input[@placeholder='Select location']")
		@CacheLookup
		WebElement AllLocation;
		
//		@FindBy(xpath = "//select[@id='deptoption']")
		@FindBy(xpath = "//input[@placeholder='Select department']")
		@CacheLookup
		WebElement SelectDepartment;
		
//		@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")
		@FindBy(xpath = "//input[@placeholder='Select employee']")
		@CacheLookup
		WebElement SelectEmployee;
		
		@FindBy(xpath = "//option[contains(text(),'Select Employee')]")
		@CacheLookup
		WebElement Allemployee;
		
		
		@FindBy(xpath = "//input[@id='checkAll']")
		@CacheLookup
		WebElement Allcheckbox;
		
		
		
		@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")
		@CacheLookup
		WebElement 	DateRanges;
		
		@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
		@CacheLookup
		WebElement 	Last30days;
		
		@FindBy(xpath = "//button[contains(text(),'Export PDF')]")
		@CacheLookup
		WebElement 	ExportPDF;
		
		@FindBy(xpath = "//button[contains(text(),'Export CSV')]")
		@CacheLookup
		WebElement 	ExportCSV;
		
		
		
		
		public void ProductivityReportsPage()throws InterruptedException, AWTException{
			
			helper.waitFor(ProductivityReports);
			helper.highLightElement(driver, ProductivityReports);
			ProductivityReports.click();
			Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Productivity-Reports");
			Assert.assertTrue(true, "Failed to click on Productivit-Reports");
			
			helper.waitFor(AllLocation); 
			helper.highLightElement(driver, AllLocation);
//			helper.selectDropDownValue(AllLocation, "visibletext", "Bangalore");
			AllLocation.click();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_ENTER);
			
			Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on All-Location");
			Assert.assertTrue(true, "Failed To Select All-Location");
			
			helper.waitFor(SelectDepartment);
			helper.highLightElement(driver, SelectDepartment);
//			helper.selectDropDownValue(SelectDepartment, "value", "1");
			SelectDepartment.click();
			Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			
			Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department DropDown");
			Assert.assertTrue(true, "Failed to Select Department DropDown");
			
			
			
			
			helper.waitFor(SelectEmployee);
			helper.highLightElement(driver, SelectEmployee);
			SelectEmployee.click();
			Robot r11=new Robot();
			r11.keyPress(KeyEvent.VK_ENTER);
			r11.keyRelease(KeyEvent.VK_ENTER);
			
//			helper.jsCLick(SelectEmployee);
			Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Select-Employee");
			Assert.assertTrue(true, "Failed to Select-Employee");
			
			
//			helper.waitFor(Allcheckbox);
//			helper.highLightElement(driver, Allcheckbox);
//			Allcheckbox.click();
//			Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Allcheckbox");
//			Assert.assertTrue(true, "Failed to Select Allcheckbox");
			
			
			helper.waitFor(DateRanges);
			helper.highLightElement(driver, DateRanges);
			DateRanges.click();
			Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Date-Ranges");
			Assert.assertTrue(true, "Failed to Select  Date-Ranges");
			
			helper.waitFor(Last30days);
			helper.highLightElement(driver, Last30days);
			Last30days.click();
			Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Last-30-days");
			Assert.assertTrue(true, "Failed to Select Last-30-days");
			
			
			helper.waitFor(ExportPDF);
			helper.highLightElement(driver, ExportPDF);
			helper.Scrollintoview(ExportPDF);
			helper.jsCLick(ExportPDF);
			//ExportPDF.click();
			Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Export-PDF");
			Assert.assertTrue(true, "Failed to Select Export-PDF");
			Thread.sleep(6000);
			
			helper.waitFor(ExportCSV);
			helper.highLightElement(driver, ExportCSV);
			helper.Scrollintoview(ExportCSV);
			helper.jsCLick(ExportCSV);
			Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on Export-CSV");
			Assert.assertTrue(true, "Failed to Select Export-CSV");
			Thread.sleep(6000);
			
			
			
			
		}




		private Select select(WebElement s) {
			// TODO Auto-generated method stub
			return null;
		}
		

}
