package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeExperienceDetailsPage;
import com.emp.qa.pages.HrmsEmployeeFamilyDetailsPage;

public class HrmsEmployeeExperienceDetailsTest extends TestBase {
	
	
		
		@Test
		public void HrmsEmployeeExperienceDetailsTest() throws InterruptedException, IOException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsEmployeeExperienceDetailsPage ExperienceDetails = new HrmsEmployeeExperienceDetailsPage(getDriver());
			homePage.SkipPopup();
			ExperienceDetails.HrmsEmployeeExperienceDetailsPage();
		}


}
