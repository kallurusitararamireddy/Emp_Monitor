package com.emp.qa.pages;

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
public class ProductivityRulesPage extends BasePage {
	
	public  ProductivityRulesPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Productivity Rules')]")
	@CacheLookup
	WebElement ProductivityRules;
	
	@FindBy(xpath = "//button[@id='ActivityID']")
	@CacheLookup
	WebElement Activity_Button;
	
	@FindBy(xpath = "//button[@id='CategoryID']")
	@CacheLookup
	WebElement Category_Button;
	
	@FindBy(xpath = "//button[@id='All']")
	@CacheLookup
	WebElement SeeAll_Button;
	
	@FindBy(xpath = "//button[@id='Global']")
	@CacheLookup
	WebElement Global_Button;
	
	@FindBy(xpath = "//button[@id='Custom']")
	@CacheLookup
	WebElement Custom_Button;
	
	@FindBy(xpath = "//button[@id='New']")
	@CacheLookup
	WebElement New_Button;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Website')]")
	@CacheLookup
	WebElement Website_Button;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Application')]")
	@CacheLookup
	WebElement Application_Button;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowentriesDropDown;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add New Domain')]")
	@CacheLookup
	WebElement Addnew_Domain;
	
	@FindBy(xpath = "//input[@id='DomainURL']")
	@CacheLookup
	WebElement Add_Domain_Link;
	
	@FindBy(xpath = "//button[@id='NewURLSave']")
	@CacheLookup
	WebElement Save_Button;
	
	@FindBy(xpath = "//input[@id='searchByname']")
	@CacheLookup
	WebElement SearchBar;
	
	@FindBy(xpath = "//button[@id='ExportBtn']")
	@CacheLookup
	WebElement Export_Button;
	
	
	public void ProductivityRulesPage()throws InterruptedException{
		
		helper.waitFor(ProductivityRules);		
		helper.highLightElement(driver, ProductivityRules);
		ProductivityRules.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on ProductivityRules");
		Assert.assertTrue(true, "Failed To Select ProductivityRules");
		
		
		helper.waitFor(Activity_Button);		
		helper.highLightElement(driver, Activity_Button);
		Activity_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Activity_Button");
		Assert.assertTrue(true, "Failed To Select Activity_Button");
		
		helper.waitFor(Category_Button);		
		helper.highLightElement(driver, Category_Button);
		Category_Button.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Category_Button");
		Assert.assertTrue(true, "Failed To Select Category_Button");
		Thread.sleep(5000);
		
		helper.waitFor(SeeAll_Button);		
		helper.highLightElement(driver, SeeAll_Button);
		SeeAll_Button.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SeeAll_Button");
		Assert.assertTrue(true, "Failed To Select SeeAll_Button");
		Thread.sleep(5000);
		
		
		helper.waitFor(Global_Button);		
		helper.highLightElement(driver, Global_Button);
		Global_Button.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Global_Button");
		Assert.assertTrue(true, "Failed To Select Global_Button");
		Thread.sleep(5000);
		
		
		helper.waitFor(Custom_Button);		
		helper.highLightElement(driver, Custom_Button);
		Custom_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Custom_Button");
		Assert.assertTrue(true, "Failed To Select Custom_Button");
		Thread.sleep(5000);
		
		
		
		helper.waitFor(New_Button);		
		helper.highLightElement(driver, New_Button);
		New_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on New_Button");
		Assert.assertTrue(true, "Failed To Select New_Button");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
//		helper.waitFor(Website_Button);		
//		helper.highLightElement(driver, Website_Button);
//		Website_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Website_Button");
//		Assert.assertTrue(true, "Failed To Select Website_Button");
//		Thread.sleep(5000);
		
		
		helper.waitFor(Addnew_Domain);		
		helper.highLightElement(driver, Addnew_Domain);
		Addnew_Domain.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Addnew_Domain");
		Assert.assertTrue(true, "Failed To Select Addnew_Domain");
		
		helper.waitFor(Add_Domain_Link);		
		helper.highLightElement(driver, Add_Domain_Link);
		Add_Domain_Link.sendKeys("https://www.selenium.de");
		Add_Domain_Link.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Add_Domain_Link");
		Assert.assertTrue(true, "Failed To Add_Domain_Link");
		Thread.sleep(4000);
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver, Save_Button);
		Save_Button.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Click Save_Button");
		Thread.sleep(5000);
		
		
//		helper.waitFor(SearchBar);		
//		helper.highLightElement(driver, SearchBar);
//		SearchBar.sendKeys("www.seleniumhq.com");
//		SearchBar.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on SearchBar");
//		Assert.assertTrue(true, "Failed To SearchBar");
		
		helper.waitFor(Export_Button);		
		helper.highLightElement(driver, Export_Button);
		Export_Button.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Export_Button");
		Assert.assertTrue(true, "Failed To Click Export_Button");
		Thread.sleep(5000);
	
	
}
}

