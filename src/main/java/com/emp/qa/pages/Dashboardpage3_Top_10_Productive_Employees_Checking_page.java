package com.emp.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Dashboardpage3_Top_10_Productive_Employees_Checking_page extends BasePage {

	public Dashboardpage3_Top_10_Productive_Employees_Checking_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//*[@id=\"productive_location\"]")

	@CacheLookup
	WebElement Top10ProductiveEmployees_Locations;

	@FindBy(xpath = "//select[@id='productive_department']")
	@CacheLookup
	WebElement Top10ProductiveEmployees_Departments;

	@FindBy(xpath = "//button[@id='todayProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployeesToday;

	@FindBy(xpath = "//button[@id='yesterdayProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployeesyesterday;

	@FindBy(xpath = "//button[@id='weekProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployees_Thisweek;
	
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th[1])[1]")
	@CacheLookup
	WebElement header_1;
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th[2])[1]")
	@CacheLookup
	WebElement header_2;
	
	@FindBy(xpath = "//tbody[@id='productive_employees_data']/tr/td/a")
	@CacheLookup
	WebElement Data;

	@FindBy(xpath = "//tbody[@id='productive_employees_data']/tr/td[2]")
	@CacheLookup
	WebElement Data2;
	
	

	public void Top_10_Productive_Employees_Locations_7() throws InterruptedException, IOException {

		helper.waitFor(Top10ProductiveEmployees_Locations);
		helper.highLightElement(driver, Top10ProductiveEmployees_Locations);
		helper.Scrollintoview(Top10ProductiveEmployees_Locations);
		helper.selectDropDownValue(Top10ProductiveEmployees_Locations, "value", "0");
		Top10ProductiveEmployees_Locations.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on  Top_10_Productive_Employees_Locations option");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Productive_Employees_Locations  option ");

		helper.waitFor(Top10ProductiveEmployees_Departments);
		helper.highLightElement(driver, Top10ProductiveEmployees_Departments);
		helper.Scrollintoview(Top10ProductiveEmployees_Departments);
		helper.selectDropDownValue(Top10ProductiveEmployees_Departments, "value", "null");
		Top10ProductiveEmployees_Departments.click();
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Top10ProductiveEmployees_Departments Option");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployees_Departments");

		helper.waitFor(Top10ProductiveEmployeesToday);
		helper.highLightElement(driver, Top10ProductiveEmployeesToday);
		helper.Scrollintoview(Top10ProductiveEmployeesToday);
		Top10ProductiveEmployeesToday.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top10ProductiveEmployeesToday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployeesToday");
		Thread.sleep(2000);

		helper.waitFor(Top10ProductiveEmployeesyesterday);
		helper.highLightElement(driver, Top10ProductiveEmployeesyesterday);
		helper.Scrollintoview(Top10ProductiveEmployeesyesterday);
		Top10ProductiveEmployeesyesterday.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Top10ProductiveEmployeesyesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployeesyesterday");
		Thread.sleep(2000);

		helper.waitFor(Top10ProductiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10ProductiveEmployees_Thisweek);
		helper.Scrollintoview(Top10ProductiveEmployees_Thisweek);
		Top10ProductiveEmployees_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Top10ProductiveEmployees_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployees_Thisweek");
		Thread.sleep(2000);
		
		
		
 
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'> step6 .</font></B>    " + header_1.getText() +"--"+  header_2.getText());
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td/a"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td[2]"));

		String s1 = null;
		String s2 = null;
		for(WebElement d1:l )
		{  
			 s2=d1.getText();
		for(WebElement d2:l2 )
		{
			s1=d2.getText();
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);	
		Reporter.log("<B><font color = 'blue'>    </font></B>    " + s3);
		}
		

	}

}
