package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmailMonitoringPage;
import com.emp.qa.pages.EmployeeAttendanePage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SkipPopUpPage;

public class EmailMonitoringTest extends TestBase {

	@Test
	public void EmailMonitoringTest() throws InterruptedException, AWTException{				 
	//SkipPopUpPage sk= new SkipPopUpPage(getDriver());	
	//sk.SkipPopup();
	EmailMonitoringPage Emailmonitor =new EmailMonitoringPage(getDriver());
	Emailmonitor.EmailMonitoringPage();

	}

}
