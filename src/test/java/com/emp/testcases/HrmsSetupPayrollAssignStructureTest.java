package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsSetupPayrollAssignStructurePage;
import com.emp.qa.pages.HrmsSetupPayrollPage;

public class HrmsSetupPayrollAssignStructureTest extends TestBase {
	
	@Test
	public void HrmsSetupPayrollAssignStructureTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollAssignStructurePage Assignstructure = new HrmsSetupPayrollAssignStructurePage(getDriver());
		homePage.SkipPopup();
		Assignstructure.HrmsSetupPayrollAssignStructurePage();
		
	

	}

}
