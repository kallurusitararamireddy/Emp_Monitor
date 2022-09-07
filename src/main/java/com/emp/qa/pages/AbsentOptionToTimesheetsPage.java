package com.emp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;


public class AbsentOptionToTimesheetsPage extends BasePage {

	public AbsentOptionToTimesheetsPage(WebDriver driver) {
		super(TestBase.getDriver());

	}
	
	Helpers helper=new Helpers();
	//Xls_Reader excel = new Xls_Reader("C:\\Users\\Official\\Downloads\\Attendance History - 2021-07-08T132435.310.csv");
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement selectdateranges;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days;
	
	
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall;
	
	@FindBy(xpath = "//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/input[1]")
	@CacheLookup
	WebElement Timeintotal;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF;
	
	
	
	
	
	public void AbsentOptionToTimesheetsPage()throws InterruptedException, IOException{
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B>Selected Banglore from the loction Dropdown");
		Assert.assertTrue(true, "Failed to Select a value from the Locaton Drpdown");
		

		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "1");
		//Department.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Department dropdown");
		Assert.assertTrue(true, "Failed to Select Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.selectDropDownValue(Employee, "value", "0");
		//Employee.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Employee dropdown");
		Assert.assertTrue(true, "Failed to Select Employee");
		
		helper.waitFor(selectdateranges);
		helper.highLightElement(driver, selectdateranges);
		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
		selectdateranges.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on selectdateranges");
		Assert.assertTrue(true, "Failed toselectdateranges");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Last30days");
		Assert.assertTrue(true, "Failed to select Last30days");
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on CSV Button");
		Assert.assertTrue(true, "Failed to click on CSV Button");
		
		helper.waitFor(Timeintotal);
		helper.highLightElement(driver, Timeintotal);
		helper.Scrollintoview(Timeintotal);
		Timeintotal.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Timeintotal checkBox");
		Assert.assertTrue(true, "Failed to click on Timeintotal ChekBox");
		
//		helper.waitFor(selectall);
//		helper.highLightElement(driver, selectall);
//		selectall.click();
//		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Select All check Box");
//		Assert.assertTrue(true, "Failed to click on selectall Check Box");
//		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Thread.sleep(3000);
		helper.jsCLick(Submit);
		//Submit.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		//Thread.sleep(58000);
		
		
		         String sheetName = "Attendance History - 2021-07-08";
//		        
//				  
//				  
//					int rowcount = excel.getRowCount(sheetName);
//					System.out.println("The number of rows in the Sheet is:"  + rowcount);
//					int columncount=excel.getColumnCount(sheetName);
//					System.out.println("The number of columns  in the Sheet is:"  + columncount);
//					
////					String s1= excel.IterateRow(sheetName);    
////					  System.out.println(s1);
//					
//					 int S2= excel.getRowvalues(sheetName, 0,1);
//					  System.out.println(S2);

		
	
	}
}
	
