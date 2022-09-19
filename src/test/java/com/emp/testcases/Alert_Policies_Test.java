package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Alert_Policies_Page;
import com.emp.qa.pages.HomePage;

public class Alert_Policies_Test extends TestBase {
	@Test
	public void Alert_Policies_Test() throws Exception{
		Alert_Policies_Page AlertPolocies=new Alert_Policies_Page(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.behaviourpage();
		AlertPolocies.Alert_Policies_Page();
 
}
}

