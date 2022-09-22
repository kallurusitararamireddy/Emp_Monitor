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



//Xls_Reader excel = new Xls_Reader("C:\\Users\\Official\\Downloads\\application_used_1_1625728344325.xlsx");

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
	
//	@FindBy(xpath = "//button[@id='pdfReportsDownload']")
	@FindBy(xpath = "//*[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF;
	
//	@FindBy(xpath = "//div[@id='csvDropdown']")
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
		Thread.sleep(2000);
//		helper.waitFor(PDF);
//		helper.highLightElement(driver,PDF);
//		PDF.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PDF");
//		Assert.assertTrue(true, "Failed to Select PDF");
//		Thread.sleep(30000);
//	
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
//		helper.move_to_element_click(CSV);
//		CSV.click();
		helper.Double_click(CSV);
		
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on CSV");
		Assert.assertTrue(true, "Failed to Select CSV");
		Thread.sleep(2000);
		
//		WebElement c=driver.findElement(By.xpath("//li[@id='li_1']/a/i"));
//		Actions act=new Actions(driver);
//		act.moveToElement(c).doubleClick().build().perform();
		
		helper.waitFor(CSV_Drop_down);
		helper.highLightElement(driver, CSV_Drop_down);
		helper.Double_click(CSV_Drop_down);
//		CSV_Drop_down.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on CSV_Drop_down");
		Assert.assertTrue(true, "Failed to Select CSV_Drop_down");
		Thread.sleep(4000); 
		
		
		
//		helper.waitFor(ApplicationsUsed);
//		helper.highLightElement(driver, ApplicationsUsed);
//		//helper.jsCLick(Select_All_checkBox);
//		helper.jsScrollintoview(ApplicationsUsed);
//		helper.jsCLick(ApplicationsUsed);
//		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on ApplicationsUsed");
//		Assert.assertTrue(true, "Failed to Select ApplicationsUsed");
//		
//		
//		helper.waitFor(Submit_Button);
//		helper.highLightElement(driver, Submit_Button);
//		helper.Scrollintoview(Submit_Button);
//		Submit_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Submit_Button");
//		Assert.assertTrue(true, "Failed to Click Submit_Button");
//		driver.navigate().refresh();
//		
//		helper.waitFor(DownloadFiles_Button);
//		helper.highLightElement(driver, DownloadFiles_Button);
//		//helper.Scrollintoview(Submit_Button);
//		helper.jsCLick(DownloadFiles_Button);
//		//DownloadFiles_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on DownloadFiles_Button");
//		Assert.assertTrue(true, "Failed to Click DownloadFiles_Button");
		//driver.navigate().refresh();
		
//		helper.waitFor(ApplicationsUsageReport);
//		helper.highLightElement(driver, ApplicationsUsageReport);
//		//helper.Scrollintoview(Submit_Button);
//		helper.jsCLick(ApplicationsUsageReport);
//		//ApplicationsUsageReport.click();
//		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on ApplicationsUsageReport");
//		Assert.assertTrue(true, "Failed to Click ApplicationsUsageReport");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		 
		 
		
//         String sheetName = "Sheet 1";
//		int rowcount = excel.getRowCount(sheetName);
//		System.out.println("The number of rows in the Sheet is:"  + rowcount);
//		int cellcount=excel.getColumnCount(sheetName);
//		System.out.println("The number of cellcount in the Sheet is:"  + cellcount);
//		
////		String s1= excel.IterateRow(sheetName);    
////		  System.out.println(s1);
//		
//		 int S2= excel.getRowvalues(sheetName, 0,1);
//		  System.out.println(S2);


	}
}
