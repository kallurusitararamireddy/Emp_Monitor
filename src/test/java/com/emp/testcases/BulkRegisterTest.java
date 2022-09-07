package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeePage;
import com.emp.qa.pages.HomePage;

public class BulkRegisterTest extends TestBase {

@Test
public void Employee() throws InterruptedException, AWTException{		
EmployeePage Employee =new EmployeePage(getDriver());
HomePage hp=new HomePage(getDriver());
	 
hp.SkipPopup();
hp.clickEmployee();
Employee.BulkRegister();
	 
	
	}

}
