package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsOverviewPage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPtsettingsPage;

public class HrmsPayrollAdvancedSettingsPtsettingsTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvancedSettingsPtsettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPtsettingsPage PTsettigs = new HrmsPayrollAdvancedSettingsPtsettingsPage(getDriver());
		homePage.SkipPopup();
		PTsettigs.HrmsPayrollAdvancedSettingsPtsettingsPage();
	}

}
