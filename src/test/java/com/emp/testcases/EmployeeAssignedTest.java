package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeAssignedPage;
import com.emp.qa.pages.EmployeeFullDetailsPage;
import com.emp.qa.pages.HomePage;

public class EmployeeAssignedTest extends TestBase{
	

@Test
public void EmployeeAssignedTest() throws InterruptedException{
	
	HomePage homePage =new HomePage(getDriver());
	EmployeeAssignedPage EMPAssigned = new EmployeeAssignedPage(getDriver());
	////homePage.SkipPopup();
	homePage.clickEmployee();
	EMPAssigned.EmployeeAssigned();
		

}
}
