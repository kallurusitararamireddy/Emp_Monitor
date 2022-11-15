package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProjectsPage;
import com.emp.qa.pages.TimeClaimPage;

public class ProjectsTest extends TestBase {
	
	
	@Test
	public void ProjectsTest() throws Exception{
		
		/*
		 * Must be change with project data's range   
		 */
		
		ProjectsPage ProjectsPage=new ProjectsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ProjectsPage();
		ProjectsPage.ProjectsPage();
  
}
}

