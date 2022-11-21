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

public class Dashboardpage8_Department_Performance_Checking_page extends BasePage {

	public Dashboardpage8_Department_Performance_Checking_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Helpers helper = new Helpers();


	
	@FindBy(xpath = "//select[@id='department_option']")
	@CacheLookup
	WebElement Department_Performance_Productive;

	@FindBy(xpath = "//button[@id='todayDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Today;
	

	@FindBy(xpath = "//button[@id='yesterdayDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Yesterday;

	@FindBy(xpath = "//button[@id='weekDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Thisweek;

	@FindBy(xpath = "(//tr[@class='bg-success'])[3]//th[1]")
	@CacheLookup
	WebElement header_1;
	
	@FindBy(xpath = "(//tr[@class='bg-success'])[3]//th[2]")
	@CacheLookup
	WebElement header_2;
	
	@FindBy(xpath = "//tbody[@id='department_option_data']/tr/td[1]")
	@CacheLookup
	WebElement Data;

	@FindBy(xpath = "//tbody[@id='department_option_data']/tr/td[2]")
	@CacheLookup
	WebElement Data2;
	
	

	public void Location_Performance() throws InterruptedException, IOException {

	

		/*
		 *  Checking Today
		 */
		helper.waitFor(Department_Performance_Today);
		helper.highLightElement(driver, Department_Performance_Today);
		helper.Scrollintoview(Department_Performance_Today);
		Department_Performance_Today.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Department_Performance_Today Button");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Today");
		Thread.sleep(2000);
		 
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Department Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

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
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "non");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Department Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

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
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "neu");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Department_performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
		
 
		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

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
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		/*
		 *  Checking Yesterday
		 */
		

		helper.waitFor(Department_Performance_Yesterday);
		helper.highLightElement(driver, Department_Performance_Yesterday);
		helper.Scrollintoview(Department_Performance_Yesterday);
		Department_Performance_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Department_Performance_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Yesterday");
		Thread.sleep(2000);
		
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> un=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> un2=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String uns1 = null; 
		String uns2 = null;
		for(WebElement d1:un )
		{
			uns2=d1.getText(); 
		for(WebElement d2:un2 )
		{
			uns1=d2.getText(); 
		}
		String s3=uns2+"--" +uns1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "non");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Department performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
		
 
		List<WebElement> lp1=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp2=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp11 = null;
		String sp21 = null;
		for(WebElement d1:lp1 )
		{
			sp21=d1.getText(); 
		for(WebElement d2:lp2 )
		{
			sp11=d2.getText(); 
		}
		String s3=sp21+"--" +sp11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "neu");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> lp11=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp211=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp111 = null;
		String sp211 = null;
		for(WebElement d1:lp11 )
		{
			 sp211=d1.getText(); 
		for(WebElement d2:lp211 )
		{
			sp111=d2.getText(); 
		}
		String s3=sp211+"--" +sp111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		/*
		 *  Checking This week
		 */

		helper.waitFor(Department_Performance_Thisweek);
		helper.highLightElement(driver, Department_Performance_Thisweek);
		helper.Scrollintoview(Department_Performance_Thisweek);
		Department_Performance_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Department_Performance_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Thisweek");
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> un1=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> un21=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String uns11 = null; 
		String uns21 = null;
		for(WebElement d1:un1 )
		{
			uns21=d1.getText(); 
		for(WebElement d2:un21 )
		{
			uns11=d2.getText(); 
		}
		String s3=uns21+"--" +uns11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "non");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> lp111=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp21=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp1111 = null;
		String sp2111 = null;
		for(WebElement d1:lp111 )
		{
			sp2111=d1.getText(); 
		for(WebElement d2:lp21 )
		{
			sp1111=d2.getText(); 
		}
		String s3=sp2111+"--" +sp1111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "neu");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1.getText() +"--"+  header_2.getText());
 
		List<WebElement> lp1111=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp2111=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp11111 = null;
		String sp21111 = null;
		for(WebElement d1:lp1111 )
		{
			 sp21111=d1.getText(); 
		for(WebElement d2:lp2111 )
		{
			sp11111=d2.getText(); 
		}
		String s3=sp21111+"--" +sp11111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		

	}

}
