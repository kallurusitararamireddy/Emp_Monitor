package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.LocaliationPage;
import com.emp.qa.pages.ManageLocationsAndDepartmentPage;

public class LocalizationTest extends TestBase {
	
	@Test
	public void LocalizationTest() throws Exception{
		LocaliationPage Localization=new LocaliationPage(getDriver());
	HomePage homePage =new HomePage(getDriver());

	
	homePage.ManageLocationsAndDepartmentPage();
	Localization.LocaliationPage();

}
}

