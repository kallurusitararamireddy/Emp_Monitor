package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPtsettingsOverviewPage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPtsettingsPage;

public class HrmsPayrollAdvancedSettingsPtsettingsOverviewTest extends TestBase {
	
	
	@Test
	public void HrmsPayrollAdvancedSettingsPtsettingsOverviewTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPtsettingsOverviewPage PTsettigs = new HrmsPayrollAdvancedSettingsPtsettingsOverviewPage(getDriver());
		homePage.SkipPopup();
		PTsettigs.HrmsPayrollAdvancedSettingsPtsettingsOverviewPage();
	}

}
