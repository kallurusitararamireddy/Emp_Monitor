package com.emp.qa.pages;

import javax.swing.JScrollBar;

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
public class ReportsDownloadPage extends BasePage {
	public  ReportsDownloadPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//button[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF;
	
	@FindBy(xpath = "//div[@id='csvDropdown']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//input[@id='checkAllCheckboxes']")
	@CacheLookup
	WebElement Select_All_checkBox;
	
	@FindBy(xpath = "//input[@id='optionsView']")
	@CacheLookup
	WebElement Submit_Button;
	
	@FindBy(xpath = "//a[contains(@class,'btn dropdown-toggle text-white')]")
	@CacheLookup
	WebElement DownloadFiles_Button;
	
	@FindBy(xpath = "//*[@id=\"li_1\"]/a")
	@CacheLookup
	WebElement ApplicationsUsageReport;

	
	
	
	public void ReportsDownloadPage()throws InterruptedException{
		
		helper.waitFor(ReportsDownload);
		helper.highLightElement(driver, ReportsDownload);
		ReportsDownload.click();
		Reporter.log("<B><font color = 'blue'>SteP1 .</font></B> clicked on ReportsDownload");
		Assert.assertTrue(true, "Failed to click on ReportsDownload");
		
		
		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clickedonRoles");
		Assert.assertTrue(true, "Failed to clickedonRole");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  SelectAll");
		Assert.assertTrue(true, "Failed to click on SelectAll");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "2");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clickedonSelectLocation");
		Assert.assertTrue(true, "Failed clickeonSelectLocation");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "1");
		
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Department");
		Assert.assertTrue(true, "Failed to clicked on Department");
		
		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.click();
		//SelectDateRanges.sendKeys("26-05-2021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> click on SelectDateRanges");
		Assert.assertTrue(true, "Failed to Click on SelectDateRanges");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Last30days");
		Assert.assertTrue(true, "Failed to Select Last30days");
		
		helper.waitFor(DownloadOption);
		helper.highLightElement(driver, DownloadOption);
		DownloadOption.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on DownloadOption");
		Assert.assertTrue(true, "Failed to Select DownloadOption");
		
		helper.waitFor(AppliationsUsed);
		helper.highLightElement(driver, AppliationsUsed);
		AppliationsUsed.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on AppliationsUsed");
		Assert.assertTrue(true, "Failed to Select AppliationsUsed");
		
		helper.waitFor(PDF);
		helper.highLightElement(driver,PDF);
		PDF.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PDF");
		Assert.assertTrue(true, "Failed to Select PDF");
		Thread.sleep(30000);
	
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on CSV");
		Assert.assertTrue(true, "Failed to Select CSV");
		
		
		helper.waitFor(Select_All_checkBox);
		helper.highLightElement(driver, Select_All_checkBox);
		//helper.jsCLick(Select_All_checkBox);
		helper.jsScrollintoview(Select_All_checkBox);
		helper.jsCLick(Select_All_checkBox);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Select_All_checkBox");
		Assert.assertTrue(true, "Failed to Select Select_All_checkBox");
		
		
		helper.waitFor(Submit_Button);
		helper.highLightElement(driver, Submit_Button);
		helper.Scrollintoview(Submit_Button);
		Submit_Button.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Submit_Button");
		Assert.assertTrue(true, "Failed to Click Submit_Button");
		//driver.navigate().refresh();
		
		helper.waitFor(DownloadFiles_Button);
		helper.highLightElement(driver, DownloadFiles_Button);
		//helper.Scrollintoview(Submit_Button);
		helper.jsCLick(DownloadFiles_Button);
		//DownloadFiles_Button.click();
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on DownloadFiles_Button");
		Assert.assertTrue(true, "Failed to Click DownloadFiles_Button");
		//driver.navigate().refresh();
		
		helper.waitFor(ApplicationsUsageReport);
		helper.highLightElement(driver, ApplicationsUsageReport);
		//helper.Scrollintoview(Submit_Button);
		helper.jsCLick(ApplicationsUsageReport);
		//ApplicationsUsageReport.click();
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on ApplicationsUsageReport");
		Assert.assertTrue(true, "Failed to Click ApplicationsUsageReport");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		
		
		
//		helper.waitFor(ReportsDownload);
//		helper.highLightElement(driver, ReportsDownload);
//		ReportsDownload.click();
//		Reporter.log("<B><font color = 'blue'>SteP16 .</font></B> clicked on ReportsDownload");
//		Assert.assertTrue(true, "Failed to click on ReportsDownload");
////		
//		helper.waitFor(DownloadOption);
//		helper.highLightElement(driver, DownloadOption);
//		DownloadOption.click();
//		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on DownloadOption");
//		Assert.assertTrue(true, "Failed to Select DownloadOption");
//		
//		helper.waitFor(BrowserHistory);
//		helper.highLightElement(driver, BrowserHistory);
//		BrowserHistory.click();
//		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> clicked on BrowserHistory");
//		Assert.assertTrue(true, "Failed to Select BrowserHistory");
//		
//		helper.waitFor(PDF);
//		helper.highLightElement(driver,PDF);
//		PDF.click();
//		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> clicked on PDF");
//		Assert.assertTrue(true, "Failed to Select PDF");
//		Thread.sleep(5000);
//		
//		helper.waitFor(CSV);
//		helper.highLightElement(driver, CSV);
//		CSV.click();
//		Reporter.log("<B><font color = 'blue'>Step20 .</font></B> clicked on CSV");
//		Assert.assertTrue(true, "Failed to Select CSV");
//		
//		
//		helper.waitFor(Select_All_checkBox);
//		helper.highLightElement(driver, Select_All_checkBox);
//		helper.jsScrollintoview(Select_All_checkBox);
//		Select_All_checkBox.click();
//		Reporter.log("<B><font color = 'blue'>Step21 .</font></B> clicked on Select_All_checkBox");
//		Assert.assertTrue(true, "Failed to Select Select_All_checkBox");
//		Thread.sleep(5000);
//		
//		helper.waitFor(Submit_Button);
//		helper.highLightElement(driver, Submit_Button);
//		helper.Scrollintoview(Submit_Button);
//		Submit_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step22 .</font></B> clicked on Submit_Button");
//		Assert.assertTrue(true, "Failed to Click Submit_Button");
	
}
	
}

