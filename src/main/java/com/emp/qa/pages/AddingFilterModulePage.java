package com.emp.qa.pages;

import java.io.IOException;

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
public class AddingFilterModulePage extends BasePage{

	public AddingFilterModulePage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}
	
	Helpers helper=new Helpers();
	//Xls_Reader excel = new Xls_Reader("C:\\Users\\Official\\Downloads\\Employee list - 2021-06-30T121059.194.xlsx");
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExportButton;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement SelectAll;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	
	public  void AddingFilterModule() throws InterruptedException, IOException {
		
		
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		
		helper.waitFor(ExportButton);
		helper.highLightElement(driver, ExportButton);
		ExportButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on ExportButton");
		Assert.assertTrue(true, "Failed to click on ExportButton");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on SelectAll");
		Assert.assertTrue(true, "Failed to click on SelectAll");
		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Submit.click();
		//Helpers.getChromeOption();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Submit");
		Assert.assertTrue(true, "Failed to click on Submit");
		Thread.sleep(9000);
		
		String sheetName = "Employee list";
		
//		
//		String A2=excel.getCellData(sheetName, 1, 1);
//		System.out.println(A2);
//		
//		int rowcount = excel.getRowCount(sheetName);
//		System.out.println("The number of rows in the Sheet is:"  + rowcount);
//		int cellcount=excel.getColumnCount(sheetName);
//		System.out.println("The number of cellcount in the Sheet is:"  + cellcount);
////		
////		int s1=excel.getRowvalues(sheetName, 0, 0);
////		System.out.println(s1);
////		
		
		   
			
			
//			 String s1= excel.IterateRow(sheetName);    
//			  System.out.println(s1);
//			
		
	}
}
