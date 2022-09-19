package com.emp.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.ActivatingSuspendedEmployeesPage;
import com.emp.qa.pages.BasePage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TrelloIntegrationPage;

public class TrelloIntegrationTest extends TestBase {

	@Test
	public void EmployeeRoleUpdateTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		TrelloIntegrationPage trellointegration = new TrelloIntegrationPage(getDriver());
		homePage.ManageLocationsAndDepartmentPage();		
		homePage.Skip();
		trellointegration.TrelloIntegration();
	}

}
