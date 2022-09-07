package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.CreateProjectsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProjectsPage;

public class CreateProjectsTest extends TestBase {
	
	@Test
	public void CreateProjectsTest() throws InterruptedException{
		CreateProjectsPage createProjectsPage=new CreateProjectsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.ProjectsPage();
		createProjectsPage.CreateProjectsPage();

}

}
