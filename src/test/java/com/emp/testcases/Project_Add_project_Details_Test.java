package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.Project_Add_Project_Details_Page;

public class Project_Add_project_Details_Test extends TestBase {
	@Test(priority = 1)

	public void Project_Add_project_Details_() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Project_Add_Project_Details_Page add_project_details_T = new Project_Add_Project_Details_Page(getDriver());

		homePage.ProjectsPage();
		add_project_details_T.Add_project_Details_P();

	} 

	@Test(priority = 2)

	public void Project_Add_project_Details_1() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Project_Add_Project_Details_Page add_project_details_T = new Project_Add_Project_Details_Page(getDriver());

		homePage.ProjectsPage();
		add_project_details_T.Task_is_In_Progress_to_complete();

	}

	@Test(priority = 3)

	public void Project_Add_project_Details_2() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Project_Add_Project_Details_Page add_project_details_T = new Project_Add_Project_Details_Page(getDriver());

		homePage.ProjectsPage();
		add_project_details_T.task_complete_to_On_Hold();

	}

}
