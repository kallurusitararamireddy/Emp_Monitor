package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmailMonitoringPage;
import com.emp.qa.pages.EmployeeInsightsPage;
import com.emp.qa.pages.HomePage;

public class EmployeeInsightsTest extends TestBase {
	@Test
	public void EmployeeInsightsTest() throws InterruptedException, AWTException, IOException{		
	EmployeeInsightsPage EmployeeInsights =new EmployeeInsightsPage(getDriver());
	HomePage hp=new HomePage(getDriver());		 

	hp.clickEmployee();   
	EmployeeInsights.EmployeeInsights();

}
}

