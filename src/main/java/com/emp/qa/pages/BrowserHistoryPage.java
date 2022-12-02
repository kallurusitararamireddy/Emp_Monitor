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


public class BrowserHistoryPage extends BasePage {

public BrowserHistoryPage(WebDriver driver) {
		super(TestBase.getDriver());
		// TODO Auto-generated constructor stub
	}



   Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Reports Download')]")
	@CacheLookup
	WebElement ReportsDownload;
	
	@FindBy(xpath = "//*[@id='role']")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//*[@id='role']/option[1]")
	@CacheLookup
	WebElement SelectAll;
	
	
	@FindBy(xpath = "//*[@id='locations']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//*[@id='departmentAppend']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")
	@CacheLookup
	WebElement SelectDateRanges;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//select[@id='download']")
	@CacheLookup
	WebElement DownloadOption;
	
//	@FindBy(xpath = "//option[contains(text(),'Application Used')]")
//	@CacheLookup
//	WebElement AppliationsUsed;
	
	@FindBy(xpath = "//option[contains(text(),'Browser History')]")
	@CacheLookup
	WebElement BrowserHistory;
	
	@FindBy(xpath = "//button[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF;
	
	@FindBy(xpath = "//div[@id='csvDropdown']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//*[@id=\"mytimesheetdataDownload\"]/li[16]/input")
	@CacheLookup
	WebElement Domain;
	
	@FindBy(xpath = "//*[@id=\"mytimesheetdataDownload\"]/li[17]/input")
	@CacheLookup
	WebElement Browser;
	
	@FindBy(xpath = "//*[@id=\"mytimesheetdataDownload\"]/li[18]/input")
	@CacheLookup
	WebElement URL;
	
	@FindBy(xpath = "//input[@id='optionsView']")
	@CacheLookup
	WebElement Submit_Button;
	
	@FindBy(xpath = "//a[contains(@class,'btn dropdown-toggle text-white')]")
	@CacheLookup
	WebElement DownloadFiles_Button;
	
	@FindBy(xpath = "//*[@id=\"li_1\"]/a")
	@CacheLookup
	WebElement ApplicationsUsageReport;

	
	
	
	public void BrowserHistoryPage()throws InterruptedException, AWTException{
		
		helper.waitFor(ReportsDownload);
		helper.highLightElement(driver, ReportsDownload);
		ReportsDownload.click();
		Reporter.log("<B><font color = 'blue'>SteP1 .</font></B> Clicked on ReportsDownload");
		Assert.assertTrue(true, "Failed to Click on ReportsDownload");
		
		
		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Roles Drop-down and Selected Any Role");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected Any Role");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on  Select-All");
		Assert.assertTrue(true, "Failed to Click on Select-All");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.robot_Zero_option_selectClick();
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location Drop-down and Slected Any Location");
		Assert.assertTrue(true, "Failed clicke on Location Drop-down and Slected Any Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.robot_Zero_option_selectClick();
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Selcted Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and Selcted Any Department");
		
		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.click();
		//SelectDateRanges.sendKeys("26-05-2021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Click on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Selected  on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");
		
		helper.waitFor(DownloadOption);
		helper.highLightElement(driver, DownloadOption);
		DownloadOption.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Download-Option");
		Assert.assertTrue(true, "Failed to Click on Download-Option");
		
		helper.waitFor(BrowserHistory);
		helper.highLightElement(driver, BrowserHistory);
		BrowserHistory.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Browser-History");
		Assert.assertTrue(true, "Failed to Click on Browser-History");
		
		 
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on CSV-Button");
		Assert.assertTrue(true, "Failed to  Click on CSV-Button");
		
		
		helper.waitFor(Domain);
		helper.highLightElement(driver, Domain);
		helper.jsScrollintoview(Domain);
		helper.jsCLick(Domain);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Domain");
		Assert.assertTrue(true, "Failed to click on Domain");
		
		
		helper.waitFor(Browser);
		helper.highLightElement(driver, Browser);
		helper.jsScrollintoview(Browser);
		helper.jsCLick(Browser);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Browser");
		Assert.assertTrue(true, "Failed to Click on Browser");
		
		
		helper.waitFor(URL);
		helper.highLightElement(driver, URL);
		helper.jsScrollintoview(URL);
		helper.jsCLick(URL);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on URL");
		Assert.assertTrue(true, "Failed to click on URL");
		
		
		
		helper.waitFor(Submit_Button);
		helper.highLightElement(driver, Submit_Button);
		helper.Scrollintoview(Submit_Button);
		Submit_Button.click();
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Submit_Button");
		Assert.assertTrue(true, "Failed to Click Submit_Button");
		
		driver.navigate().refresh();
		
		helper.waitFor(DownloadFiles_Button);
		helper.highLightElement(driver, DownloadFiles_Button);
		helper.jsCLick(DownloadFiles_Button);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on DownloadFiles_Button");
		Assert.assertTrue(true, "Failed to Click on DownloadFiles_Button");
		//driver.navigate().refresh();
		
		helper.waitFor(ApplicationsUsageReport);
		helper.highLightElement(driver, ApplicationsUsageReport);
		helper.jsCLick(ApplicationsUsageReport);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on Applications-Usage-Report");
		Assert.assertTrue(true, "Failed to Click on Applications-Usage-Report");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		
		
	


	}
	
}
