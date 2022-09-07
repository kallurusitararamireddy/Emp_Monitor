package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeFamilyDetailsPage;

public class HrmsEmployeeQualificationDetailsTest extends TestBase {
	

	@Test
	public void HrmsEmployeeQualificationDetailsPage() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		com.emp.qa.pages.HrmsEmployeeQualificationDetailsPage QualificationDetails = new com.emp.qa.pages.HrmsEmployeeQualificationDetailsPage(getDriver());
		homePage.SkipPopup();
		QualificationDetails.HrmsEmployeeQualificationDetailsPage();
	}

}
