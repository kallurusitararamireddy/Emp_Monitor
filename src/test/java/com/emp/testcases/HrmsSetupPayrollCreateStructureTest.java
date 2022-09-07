package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsSetupPayrollAssignStructurePage;
import com.emp.qa.pages.HrmsSetupPayrollCreateStructurePage;

public class HrmsSetupPayrollCreateStructureTest extends TestBase {
	
	@Test
	public void HrmsSetupPayrollCreateStructureTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollCreateStructurePage Createstructure = new HrmsSetupPayrollCreateStructurePage(getDriver());
		homePage.SkipPopup();
		Createstructure.HrmsSetupPayrollCreateStructurePage();
		
	

	}

}
