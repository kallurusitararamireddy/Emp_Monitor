package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AlertsPage;
import com.emp.qa.pages.HomePage;

public class AlertsTest extends TestBase {
	
	@Test
	public void AlertsTest() throws Exception{
		AlertsPage Alerts=new AlertsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.behaviourpage();
		Alerts.AlertsPage();

}
}
 
