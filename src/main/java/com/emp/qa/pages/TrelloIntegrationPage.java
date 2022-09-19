package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class TrelloIntegrationPage extends BasePage {

	public TrelloIntegrationPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "a[title='Integrations']")
	@CacheLookup
	WebElement Integrations;
	
	
public  void TrelloIntegration() throws InterruptedException, AWTException {
		
		
		helper.waitFor(Integrations);
		helper.highLightElement(driver, Integrations);
		helper.Scrollintoview(Integrations);
		Integrations.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Integrations Button");
		Assert.assertTrue(true, "Failed to click on Integrations Button");
		

}
}
