package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityRulesPage;

public class ProductivityRulesTest extends TestBase  {
	
	
	@Test
	public void ProductivityRulesTest() throws Exception{
		ProductivityRulesPage productivityrules=new ProductivityRulesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		productivityrules.ProductivityRulesPage();
	

}
}

