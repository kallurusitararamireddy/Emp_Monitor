package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Employee_manually_checking_Check_in_Page;
import com.emp.qa.pages.HomePage;

public class Employee_manually_checking_Check_in_Test extends  TestBase
{
	@Test
	public void  Employee_manually_check_in() throws Exception
	{
	HomePage homePage =new HomePage(getDriver());
	homePage.Skip();

	Employee_manually_checking_Check_in_Page admin_change=new Employee_manually_checking_Check_in_Page(getDriver());
	admin_change.Employeecheckin();
		
	admin_change._Employee_log_side_HRM_Check_in();
	
	}
	

}
