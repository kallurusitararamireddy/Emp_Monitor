package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmailMonitoringPage;
import com.emp.qa.pages.EmployeeNotificationPage;
import com.emp.qa.pages.HomePage;

public class EmployeeNotificationTest extends TestBase {
@Test

	public void EmployeeNotificationTest() throws InterruptedException, AWTException{		
		EmployeeNotificationPage Empn =new EmployeeNotificationPage(getDriver());
		HomePage hp=new HomePage(getDriver());		 
		//hp.SkipPopup();
		hp.clickEmployee();
		Empn.EmployeeNotification();
	
}
}
