package com.emp.testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RegisterEmployeePage;
import com.emp.qa.pages.TrackingUserSettingsPage;
import com.emp.qa.util.Helpers;


public class TrackingUserSettingsTest extends TestBase {
	@Test
	public void TrackingUserSettingsPage() throws InterruptedException, AWTException{
		
		/* NOTE:- 
		 *  must be find TrackingUserSettings  id=---?
		 */
		HomePage homePage =new HomePage(getDriver());
		TrackingUserSettingsPage Tracking=new TrackingUserSettingsPage(getDriver());

		homePage.clickEmployee();
		Tracking.TrackingUserSettingsPage();
		
		
	}

	
		
	
	
	

}
