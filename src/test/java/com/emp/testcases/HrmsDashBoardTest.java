package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;

import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsDashBoardPage;

public class HrmsDashBoardTest extends TestBase {
	@Test
	public void HrmsDashBoardTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsDashBoardPage HrmsDashBoardPage = new HrmsDashBoardPage(getDriver());
		homePage.SkipPopup();
		HrmsDashBoardPage.HrmsDashBoardPage();
	}

}
