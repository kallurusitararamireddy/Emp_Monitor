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

	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
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
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Productivity-Reports");
		Assert.assertTrue(true, "Failed to click on Productivit-Reports");

		helper.waitFor(AllLocation);
		helper.highLightElement(driver, AllLocation);
		helper.move_to_element_click_target(AllLocation);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location Drop dwon & Select Location ");
		Assert.assertTrue(true, "Failed To  click on Location Drop dwon & Select Location ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.move_to_element_click_target(SelectDepartment);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department DropDown & Select Department ");
		Assert.assertTrue(true, "Failed to click on Department DropDown & Select Department");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		helper.move_to_element_click_target(SelectEmployee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Employee Drop-Down & Select Employee ");
		Assert.assertTrue(true, "Failed to clicked on Employee Drop-Down & Select Employee");

		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		DateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Date-Ranges");
		Assert.assertTrue(true, "Failed to Select  Date-Ranges");

		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");

		helper.waitFor(ExportPDF);
		helper.highLightElement(driver, ExportPDF);
		helper.Scrollintoview(ExportPDF);
		helper.jsCLick(ExportPDF);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Export-PDF Button ");
		Assert.assertTrue(true, "Failed to Select Export-PDF Button ");
		Thread.sleep(4000);
		
		helper.Productivity_Reports_pdf();
		Thread.sleep(3000);

	}

	public void ProductivityReports_CSV() throws InterruptedException, AWTException, IOException, CsvException {

		helper.waitFor(ProductivityReports);
		helper.highLightElement(driver, ProductivityReports);
		ProductivityReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Productivity-Reports");
		Assert.assertTrue(true, "Failed to click on Productivit-Reports");

		helper.waitFor(AllLocation);
		helper.highLightElement(driver, AllLocation);
		helper.move_to_element_click_target(AllLocation);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location Drop dwon & Select Location ");
		Assert.assertTrue(true, "Failed To  click on Location Drop dwon & Select Location ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.move_to_element_click_target(SelectDepartment);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department DropDown & Select Department ");
		Assert.assertTrue(true, "Failed to click on Department DropDown & Select Department");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		helper.move_to_element_click_target(SelectEmployee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Employee Drop-Down & Select Employee ");
		Assert.assertTrue(true, "Failed to clicked on Employee Drop-Down & Select Employee");

		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		DateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Date-Ranges");
		Assert.assertTrue(true, "Failed to Select  Date-Ranges");

		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");

		

		helper.waitFor(ExportCSV);
		helper.highLightElement(driver, ExportCSV);
		helper.jsScrollintoview(ExportCSV);
		helper.jsCLick(ExportCSV);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Export-CSV Button ");
		Assert.assertTrue(true, "Failed to Select Export-CSV");
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
