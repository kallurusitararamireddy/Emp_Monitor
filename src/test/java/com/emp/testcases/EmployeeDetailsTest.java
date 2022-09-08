package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeDetailspage;
import com.emp.qa.pages.HomePage;

public class EmployeeDetailsTest extends TestBase {

@Test
public void EmployeeDetailsTest() throws Exception{
	
	HomePage homePage =new HomePage(getDriver());
	EmployeeDetailspage empDpage = new EmployeeDetailspage(getDriver());
	//homePage.SkipPopup();
	homePage.clickEmployee();
	homePage.Skip();
	empDpage.EmployeeDetails();
		

	}
}


