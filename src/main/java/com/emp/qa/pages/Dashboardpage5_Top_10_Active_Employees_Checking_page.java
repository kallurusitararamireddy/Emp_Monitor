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

public class Dashboardpage5_Top_10_Active_Employees_Checking_page extends BasePage {

	public Dashboardpage5_Top_10_Active_Employees_Checking_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//select[@id='active_location']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Location;

	@FindBy(xpath = "//select[@id='active_department']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Department;

	@FindBy(xpath = "//button[@id='todayActiveEmp']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Today;

	@FindBy(xpath = "//button[@id='yesterdayActiveEmp']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Yesterday;

	@FindBy(xpath = "//button[@id='weekActiveEmp']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Thisweek;
	
	
	@FindBy(xpath = "(//tr[@class='bg-danger']/th)[1]")
	@CacheLookup
	WebElement header_1;
	
	@FindBy(xpath = "(//tr[@class='bg-danger']/th)[2]")
	@CacheLookup
	WebElement header_2;
	
	@FindBy(xpath = "//tbody[@id='active_employees_data']/tr/td[1]")
	@CacheLookup
	WebElement Data;

	@FindBy(xpath = "//tbody[@id='active_employees_data']/tr/td[2]")
	@CacheLookup
	WebElement Data2;
	
	

	public void Top_10_Non_Active_Employee() throws InterruptedException, IOException {

		helper.waitFor(Top10ActiveEmployees_Location);
		helper.highLightElement(driver, Top10ActiveEmployees_Location);
		helper.Scrollintoview(Top10ActiveEmployees_Location);
		helper.selectDropDownValue(Top10ActiveEmployees_Location, "value", "0");
		Top10ActiveEmployees_Location.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Top-10-Active-Employees-Employees_Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active-Employees-Employees_Location  Drop-down and Selected Any Location ");
		helper.waitFor(Top10ActiveEmployees_Department);
		helper.highLightElement(driver, Top10ActiveEmployees_Department);
		helper.Scrollintoview(Top10ActiveEmployees_Department);
		Thread.sleep(1000); 
		helper.selectDropDownValue(Top10ActiveEmployees_Department, "value", "null");
		Top10ActiveEmployees_Department.click();
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Top-10-Active Employees_Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Top10NonProductiveEmployees_Department");
 
		helper.waitFor(Top10ActiveEmployees_Today);
		helper.highLightElement(driver, Top10ActiveEmployees_Today);
		helper.Scrollintoview(Top10ActiveEmployees_Today);
		Top10ActiveEmployees_Today.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top-10-Active Employees Today Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active Employees_Today");
		Thread.sleep(2000); 
		
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'green'>  Today  Active Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[1]"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[2]"));

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
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		
		
		
		Thread.sleep(2000);

		helper.waitFor(Top10ActiveEmployees_Yesterday);
		helper.highLightElement(driver, Top10ActiveEmployees_Yesterday);
		helper.Scrollintoview(Top10ActiveEmployees_Yesterday);
		Top10ActiveEmployees_Yesterday.click();
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Top-10-Active Employees_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active Employees_Yesterday");
		Thread.sleep(2000);
		
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'green'> Yesterday  Active  Employees Data </font></B>   " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_1.getText() +"--"+  header_2.getText());

		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[1]"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		Thread.sleep(2000);
 
		helper.waitFor(Top10ActiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10ActiveEmployees_Thisweek); 
		helper.Scrollintoview(Top10ActiveEmployees_Thisweek);
		Top10ActiveEmployees_Thisweek.click();
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Top-10-Active Employees_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active Employees_Thisweek");
		Thread.sleep(2000);
		
		
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'green'>  This Week  Active Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_1.getText() +"--"+  header_2.getText());

		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[1]"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{ 
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		

	}

}
