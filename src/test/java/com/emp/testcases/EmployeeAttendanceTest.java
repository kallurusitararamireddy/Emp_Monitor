package com.emp.testcases;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeAttendanePage;
import com.emp.qa.pages.HomePage;

public class EmployeeAttendanceTest  extends TestBase{

	@Test
	public void EmployeeAttendanceTest() throws Exception{		
	EmployeeAttendanePage EmployeeAttendance =new EmployeeAttendanePage(getDriver());
	HomePage hp=new HomePage(getDriver());		 

	hp.clickEmployee();
	EmployeeAttendance.EmployeeAttendance();

	}

}
