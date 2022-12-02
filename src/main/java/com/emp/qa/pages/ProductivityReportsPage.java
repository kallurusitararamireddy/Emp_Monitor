package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
import com.opencsv.exceptions.CsvException;

@Listeners(ITestNGListener.class)
public class ProductivityReportsPage extends BasePage {

	public ProductivityReportsPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Productivity Reports')]")
	@CacheLookup
	WebElement ProductivityReports;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[3]/div[1]/div/div/div/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement AllLocation;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[3]/div[1]/div/div/div/div[2]/div/span/span[1]/span")
	@CacheLookup
	WebElement SelectDepartment;

	@FindBy(xpath = "//*[@id='select2-empoption-container']")
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
	WebElement DateRanges;

	@FindBy(xpath = "//li[text()='Last 30 Days']")
	@CacheLookup
	WebElement Last30days;

	@FindBy(xpath = "//button[contains(text(),'Export PDF')]")
	@CacheLookup
	WebElement ExportPDF;

	@FindBy(xpath = "//button[contains(text(),'Export CSV')]")
	@CacheLookup
	WebElement ExportCSV;

	public void ProductivityReports_pdf() throws InterruptedException, AWTException, IOException, CsvException {

		helper.waitFor(ProductivityReports);
		helper.highLightElement(driver, ProductivityReports);
		ProductivityReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected  Productivity-Reports Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected  Productivity-Reports Sub-Module");

		helper.waitFor(AllLocation); 
		helper.highLightElement(driver, AllLocation); 
		helper.move_to_element_click_target(AllLocation);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and Selected Any  Location ");
		Assert.assertTrue(true, "Failed To  Click on Location Drop-down and Selected Any  Location  ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.move_to_element_click_target(SelectDepartment);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Any  Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Any  Department");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		helper.move_to_element_click_target(SelectEmployee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any  Employee ");
		Assert.assertTrue(true, "Failed to Clicked on Employee Drop-down and  Selected Any  Employee ");

		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		DateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar and Selected Day's");

		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		helper.jsCLick(Last30days);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");

		helper.waitFor(ExportPDF);
		helper.highLightElement(driver, ExportPDF);
		helper.Scrollintoview(ExportPDF);
		helper.jsCLick(ExportPDF);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Export-PDF Button ");
		Assert.assertTrue(true, "Failed to Click on  Export-PDF Button ");
		Thread.sleep(2000);
		
		helper.Productivity_Reports_pdf();
		Thread.sleep(3000);

	}

	public void ProductivityReports_CSV() throws InterruptedException, AWTException, IOException, CsvException {

		helper.waitFor(ProductivityReports);
		helper.highLightElement(driver, ProductivityReports);
		ProductivityReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected  Productivity-Reports Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected  Productivity-Reports Sub-Module");

		helper.waitFor(AllLocation);
		helper.highLightElement(driver, AllLocation);
		helper.move_to_element_click_target(AllLocation);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and  Selected Any Location ");
		Assert.assertTrue(true, "Failed To  Click on Location Drop-down and  Selected Location ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.move_to_element_click_target(SelectDepartment);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Any  Department");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		helper.move_to_element_click_target(SelectEmployee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Employee ");
		Assert.assertTrue(true, "Failed to Clicked on Employee Drop-down and  Selected Employee");

		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		DateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar and Selected Day's");

		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		helper.jsCLick(Last30days);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");

		

		helper.waitFor(ExportCSV);
		helper.highLightElement(driver, ExportCSV);
		helper.jsScrollintoview(ExportCSV);
		helper.jsCLick(ExportCSV);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Export-CSV Button ");
		Assert.assertTrue(true, "Failed to Click on  Export-CSV Button");
		Thread.sleep(5000);
		
		helper.Productivity_Reports_CSV_Dot_files();
		Thread.sleep(3000);

	}

	@SuppressWarnings("unused")
	private Select select(WebElement s) {
		// TODO Auto-generated method stub
		return null;
	}

}
