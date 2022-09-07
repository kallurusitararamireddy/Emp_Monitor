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
public class StorageTypePage extends BasePage {
	

	public  StorageTypePage(WebDriver driver) {
		super(TestBase.getDriver());
	

}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Storage Type')]")
	@CacheLookup
	WebElement StorageType;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add Storage')]")
	@CacheLookup
	WebElement Add_Storage_Button;
	
	@FindBy(xpath = "//select[@id='stroageTypes']")
	@CacheLookup
	WebElement Select_Storagetype_Dropdown;
	
	
	
	
	
	
	
	
	public void StorageTypePage()throws InterruptedException{
		
		helper.waitFor( StorageType);
		helper.highLightElement(driver,  StorageType);
		 StorageType.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B>Clicked on  StorageType Field ");
		Assert.assertTrue(true, "Failed to Select  StorageType Field");
		
		helper.waitFor( Add_Storage_Button);
		helper.highLightElement(driver,  Add_Storage_Button);
		Add_Storage_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B>Clicked on  Add_Storage_Button ");
		Assert.assertTrue(true, "Failed to Select  Add_Storage_Button");
		
		
		helper.waitFor(Select_Storagetype_Dropdown);
		helper.highLightElement(driver, Select_Storagetype_Dropdown);
		helper.selectDropDownValue(Select_Storagetype_Dropdown, "visibletext", "Google Drive");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B>Clicked on  Select_Storagetype_Dropdown ");
		Assert.assertTrue(true, "Failed to Select  Select_Storagetype_Dropdown");
		Thread.sleep(5000);
	
}
}


