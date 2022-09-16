package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeNotificationPage;
import com.emp.qa.pages.Employees_Select_Assign_With_Manager_Check_with_manager_side;
import com.emp.qa.pages.HomePage;

public class Employees_Select_Assign_WithCheck_with_manager_side extends TestBase
{
	
	@Test

	public void Employees_Select_Assign_With_Manager_Check_with_manager_side_() throws Exception{		
		Employees_Select_Assign_With_Manager_Check_with_manager_side m=new Employees_Select_Assign_With_Manager_Check_with_manager_side(getDriver());
        m.Assign_Manager_Check_with_manager_side();	
        m.Login_Manager_TL_Employee_log_side_Check_out();
	}
	

}
