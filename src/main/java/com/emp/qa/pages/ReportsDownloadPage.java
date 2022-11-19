package com.emp.qa.pages;

import java.awt.AWTException;

import javax.swing.JScrollBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	
	@FindBy(xpath = "//*[@id=\"locations\"]/option[1]")
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
	
	@FindBy(xpath = "//*[@id='li_1']/a")
	@CacheLookup
	WebElement ApplicationsUsageReport;
	
	@FindBy(xpath = "//*[@id=\"25485\"]/td[7]/button")
	@CacheLookup
	WebElement ViewReport;
	
	@FindBy(xpath = "//select[@id='download']")
	@CacheLookup
	WebElement DownloadOptions;
	
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/button[1]")
	@CacheLookup
	WebElement IndividualPdfButton;
	
	@FindBy(css = ".pt-3 > button[title='Download CSV File']")
	@CacheLookup
	WebElement IndividuaCSVButton;

	
	
	
	public void ReportsDownloadPage()throws InterruptedException, AWTException{
		
		helper.waitFor(ReportsDownload);
		helper.highLightElement(driver, ReportsDownload);
		ReportsDownload.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Reports Module and Selected Reports-Download Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Reports Module and Selected Reports-Download Sub-Module");
		
	
		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Role Drop-down ");
		Assert.assertTrue(true, "Failed to click on Role Drop-down");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Select-All option ");
		Assert.assertTrue(true, "Failed to click on Select-All option ");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		//helper.selectDropDownValue(Location, "value", "0");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location Drop-down ans Slected Any Location  ");
		Assert.assertTrue(true, "Failed to click on Location Drop-down ans Slected Any Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "id", "0");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to click on Department Drop-down and Selected Any Department");
		
		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.click();
		//SelectDateRanges.sendKeys("26-05-2021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> click on Calendar Drop-down and Slected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Slected Day's");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");
		
		helper.waitFor(DownloadOption);
		helper.highLightElement(driver, DownloadOption);
		DownloadOption.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Download-Option");
		Assert.assertTrue(true, "Failed to click on  Download-Option");
		
		helper.waitFor(AppliationsUsed);
		helper.highLightElement(driver, AppliationsUsed);
		AppliationsUsed.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Appliations-Used");
		Assert.assertTrue(true, "Failed to click on  Appliations-Used");
		
		
//		helper.waitFor(PDF);
//		helper.highLightElement(driver,PDF);
//		PDF.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PDF Button ");
//		Assert.assertTrue(true, "Failed to click on  PDF Button ");
//		Thread.sleep(3000);
	
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on CSV Button ");
		Assert.assertTrue(true, "Failed to click on  CSV Button ");
		
		
		helper.waitFor(Select_All_checkBox);
		helper.highLightElement(driver, Select_All_checkBox);
		//helper.jsCLick(Select_All_checkBox);
		helper.jsScrollintoview(Select_All_checkBox);
		helper.jsCLick(Select_All_checkBox);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Select-All option  (check Box click)");
		Assert.assertTrue(true, "Failed to click on Select-All option  (check Box click)");
		
		
		helper.waitFor(Submit_Button);
		helper.highLightElement(driver, Submit_Button);
		helper.Scrollintoview(Submit_Button);
		Actions act=new Actions(driver);
		act.moveToElement(Submit_Button).click().build().perform();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Submit-Button");
		Assert.assertTrue(true, "Failed to Click Submit-Button");
		Thread.sleep(4000);
		driver.navigate().refresh();
		
//		helper.waitFor(DownloadOptions);
//		helper.highLightElement(driver, DownloadOptions);
//		helper.selectDropDownValue(DownloadOptions, "value", "2");
//		DownloadOptions.click();
//		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Download-Options");
//		Assert.assertTrue(true, "Failed to Select Download-Options");
		
		helper.waitFor(ViewReport);
		helper.highLightElement(driver, ViewReport);
		ViewReport.click();
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on View-Report");
		Assert.assertTrue(true, "Failed to Select View-Report");
		Thread.sleep(9000); 
		
	
}
	
}

