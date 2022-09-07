package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeComponentandPerquisitesPage;
import com.emp.qa.pages.HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage;

public class HrmsEmployeeComponentsandPrerequisitesBulkUpdateTest extends TestBase {
	@Test
	public void HrmsEmployeeComponentandPerquisitesTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage componentbulk = new HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage(getDriver());
		homePage.SkipPopup();
		componentbulk.HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage();
	}


}
