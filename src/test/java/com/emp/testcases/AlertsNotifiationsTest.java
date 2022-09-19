package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AlertsNotificationPage;
import com.emp.qa.pages.AlertsPage;
import com.emp.qa.pages.HomePage;

public class AlertsNotifiationsTest extends TestBase {
	
	@Test
	public void AlertsNotifiationsPage() throws Exception{
		AlertsNotificationPage AlertNotification=new AlertsNotificationPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.behaviourpage();
		AlertNotification.AlertsNotificationPage();
}

	
}
