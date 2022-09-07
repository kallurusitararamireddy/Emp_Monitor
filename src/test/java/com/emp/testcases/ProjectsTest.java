package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProjectsPage;
import com.emp.qa.pages.TimeClaimPage;

public class ProjectsTest extends TestBase {
	
	
	@Test
	public void ProjectsTest() throws InterruptedException{
		ProjectsPage ProjectsPage=new ProjectsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ProjectsPage();
		ProjectsPage.ProjectsPage();

}
}

