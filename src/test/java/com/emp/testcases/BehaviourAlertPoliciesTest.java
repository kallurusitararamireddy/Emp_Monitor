package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.BehaviourAlertPoliciesPage;
import com.emp.qa.pages.HomePage;

public class BehaviourAlertPoliciesTest extends TestBase {
	
	@Test
	public void BehaviourAlertPoliciesTest() throws InterruptedException{
		
		/*
		 *  Change the Edit option xpath 
		 */
		
		BehaviourAlertPoliciesPage AlertPol=new BehaviourAlertPoliciesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		
		homePage.behaviourpage();
		AlertPol.BehaviourAlertPoliciesPage();

}

}
