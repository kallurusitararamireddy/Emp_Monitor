package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityRulesPage;
import com.emp.qa.pages.ProjectsPage;

public class ProductivityRulesTest extends TestBase  {
	
	
	@Test
	public void ProductivityRulesTest() throws Exception{
		ProductivityRulesPage productivityrules=new ProductivityRulesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.ManageLocationsAndDepartmentPage();
		productivityrules.ProductivityRulesPage();
	

}
}

