package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AlertPolociesPage;
import com.emp.qa.pages.AlertsNotificationPage;
import com.emp.qa.pages.HomePage;

public class AlertPolociesTest extends TestBase {
	@Test
	public void AlertPolociesTest() throws InterruptedException{
		AlertPolociesPage AlertPolocies=new AlertPolociesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.behaviourpage();
		AlertPolocies.AlertPolociesPage();
 
}
}

