package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeDetailspage;
import com.emp.qa.pages.EmployeeFullDetailsPage;
import com.emp.qa.pages.HomePage;

public class EmployeeFullDetailsTest extends TestBase {
	

@Test
public void EmployeeFullDetailsTest() throws Exception{
	
	HomePage homePage =new HomePage(getDriver());
	EmployeeFullDetailsPage Fulldetailspage = new EmployeeFullDetailsPage(getDriver());
	//homePage.SkipPopup();
	homePage.Skip();
	homePage.clickEmployee();
	Fulldetailspage.EmployeeFullDetails();
		

}
}
