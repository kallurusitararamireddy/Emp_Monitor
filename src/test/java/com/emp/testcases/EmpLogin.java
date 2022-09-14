package com.emp.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmpLogin {
	@Test
	public void EmpDashboard_Test () throws InterruptedException {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\git\\EmpCloud\\Drivers\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		String baseUrl = "https://app.dev.empmonitor.com/";
		driver.get(baseUrl);
		Reporter.log("<B><font color = 'orange'> Step1 -</font>Launched Emp  Page");
		driver.manage().window().maximize();
		
		
		WebElement email =driver.findElement(By.cssSelector("[name='amember_login']"));
		email.clear();email.sendKeys("empv3demo");
		Reporter.log("<B><font color = 'orange'> Step2 -</font>Entered Email address");
		Thread.sleep(3000);
		
		
		WebElement password =driver.findElement(By.cssSelector("input#amember-pass"));
		password.clear();password.sendKeys("empv3demo");
		Reporter.log("<B><font color = 'orange'> Step3 -</font>Entered Password");
		Thread.sleep(3000);
		
		
		WebElement Login =driver.findElement(By.cssSelector("input[value='Login']"));
		Login.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font>clicked on login button");
		Thread.sleep(3000);
		
		WebElement Skippopup =driver.findElement(By.xpath("//div[@safeclass~'\\bintrojs-tooltip-header\\b']/a[@role='button']"));
		Skippopup.click();
		Reporter.log("<B><font color = 'orange'> Step5 -</font>clicked on skippopup button");
		Thread.sleep(3000);
		
		
	
	

}
}
