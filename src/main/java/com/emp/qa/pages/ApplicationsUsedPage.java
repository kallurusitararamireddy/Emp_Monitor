package com.emp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;


public class ApplicationsUsedPage extends BasePage{
	
	
public ApplicationsUsedPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}




Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Reports Download')]")
	@CacheLookup
	WebElement ReportsDownload;
	
	@FindBy(xpath = "//select[@id='role']")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//*[@id=\"role\"]/option[1]")
	@CacheLookup
	WebElement SelectAll;
	
	
	@FindBy(xpath = "//select[@id='locations']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='departmentAppend']")
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
	
	@FindBy(xpath = "//option[contains(text(),'Application Used')]")
	@CacheLookup
	WebElement AppliationsUsed;
	
	@FindBy(xpath = "//option[contains(text(),'Browser History')]")
	@CacheLookup
	WebElement BrowserHistory;
	
	@FindBy(xpath = "//*[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF;
	
	@FindBy(xpath = "//*[@id='csvReportsDownload']/div/a/i")
	@CacheLookup
	WebElement CSV;
	
	
	@FindBy(xpath = "//li[@id='li_1']/a/i")
	@CacheLookup
	WebElement CSV_Drop_down;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[7]/ul[1]/li[16]/input[1]")
	@CacheLookup
	WebElement ApplicationsUsed;
	
	@FindBy(xpath = "//input[@id='optionsView']")
	@CacheLookup
	WebElement Submit_Button;
	
	@FindBy(xpath = "//a[contains(@class,'btn dropdown-toggle text-white')]")
	@CacheLookup
	WebElement DownloadFiles_Button;
	
	@FindBy(xpath = "//*[@id=\"li_1\"]/a")
	@CacheLookup
	WebElement ApplicationsUsageReport;

	
	
	
	public void ApplicationsUsedPage()throws InterruptedException{
		
		helper.waitFor(ReportsDownload);
		helper.highLightElement(driver, ReportsDownload);
		ReportsDownload.click();
		Reporter.log("<B><font color = 'blue'>SteP1 .</font></B> Clicked on Reports Module and Selected Reports Download Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected Reports Download Sub-Module");
		
		
		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Roles Drop-down and Selected any Role ");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected any Role");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Slected   Select All option ");
		Assert.assertTrue(true, "Failed to Select on Select All");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "2");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down and Select Any Location ");
		Assert.assertTrue(true, "Failed Click on Location Drop-down and Select Any Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "1");
		
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Slected Any Department");
		Assert.assertTrue(true, "Failed to Click  on Department Drop-down and Slected Any Department");
		
		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Calender Drop-down and Slected Day's");
		Assert.assertTrue(true, "Failed to Click on Calender Drop-down and Slected Day's");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Selected  on Last30days");
		Assert.assertTrue(true, "Failed to Select Last30days");
		
		helper.waitFor(DownloadOption);
		helper.highLightElement(driver, DownloadOption);
		DownloadOption.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Download-Option Drop-down ");
		Assert.assertTrue(true, "Failed to Select DownloadOption");
		
		helper.waitFor(AppliationsUsed);
		helper.highLightElement(driver, AppliationsUsed);
		AppliationsUsed.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Selected  Appliations-Used (Check Box Clicked ) ");
		Assert.assertTrue(true, "Failed to Select Appliations-Used  (Check Box Clicked )");
		Thread.sleep(2000);
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		helper.Double_click(CSV);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on CSV-Button");
		Assert.assertTrue(true, "Failed to Click on  CSV-Button");
		Thread.sleep(2000);
		
		
		helper.waitFor(CSV_Drop_down);
		helper.highLightElement(driver, CSV_Drop_down);
		helper.Double_click(CSV_Drop_down);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on CSV_Drop_down");
		Assert.assertTrue(true, "Failed to Click on  CSV_Drop_down");
		Thread.sleep(4000); 
	
	}
}
