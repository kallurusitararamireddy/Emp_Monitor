package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Employee_View_Superior_Details_page;
import com.emp.qa.pages.HomePage;

public class Employee_View_Superior_Details_test extends TestBase
{
	@Test
	public void Employee_View_Superior_Details() throws InterruptedException, AWTException {

		/*
		 *     NOTE:-  must be Change or find Superior_Details eye icon  id=---?
		 */
		HomePage homePage = new HomePage(getDriver());
        Employee_View_Superior_Details_page Superior_Details=new Employee_View_Superior_Details_page(getDriver());
		homePage.clickEmployee();
		Superior_Details.View_Superior_Details();

	}

	
}
