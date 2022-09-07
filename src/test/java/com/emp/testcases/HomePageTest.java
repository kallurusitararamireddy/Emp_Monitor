package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	
	@Test
	public void HomepageDisplaytest() throws InterruptedException{		
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.clickDashboard();

}
}




