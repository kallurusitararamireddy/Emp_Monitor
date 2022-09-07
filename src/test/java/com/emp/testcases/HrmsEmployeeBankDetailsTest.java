package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;

public class HrmsEmployeeBankDetailsTest extends TestBase{
	
	@Test
	public void HrmsEmployeeBankDetailsPage() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		com.emp.qa.pages.HrmsEmployeeBankDetailsPage HrmsEmployeeBankDetailsPage = new com.emp.qa.pages.HrmsEmployeeBankDetailsPage(getDriver());
		homePage.SkipPopup();
		HrmsEmployeeBankDetailsPage.HrmsEmployeeBankDetailsPage();

}
}
