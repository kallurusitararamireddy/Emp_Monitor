package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class Bulk_Register_employees_and_Deleted_also_page extends BasePage {

	public Bulk_Register_employees_and_Deleted_also_page(WebDriver driver) {
		super(TestBase.getDriver());
	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//button[@id='addBulkRegBtn']")
	WebElement BulkRegisterBtn;

	@FindBy(xpath = "//label[contains(text(),'Bulk Register')]")
	WebElement Browse;

	@FindBy(xpath = "//button[@id='addBulkDomainBtn']")
	WebElement add;
	
	
	@FindBy(xpath = "(//*[@name='checkbox'])[1]")
	WebElement one_emp;
	@FindBy(xpath = "(//*[@name='checkbox'])[2]")
	WebElement two_emp;
	
	@FindBy(xpath = "//*[@id='delete_btn']")
	WebElement delete_reg_employess;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[7]/form[3]/div/div/div/div[3]/button[2]")
	WebElement del_modal;
	
	@FindBy(xpath = "//*[@id='ShowEntriesList']")
	WebElement Show_entries_list;
	
	
	

	public void Register_employees_and_Deleted_also() throws AWTException, InterruptedException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step 1 .</font></B> Clicked on Employee Module  and Clicked Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Clicked on  Employee Module  and Clicked Employee Details Sub-Module ");

		helper.waitFor(BulkRegisterBtn);
		helper.highLightElement(driver, BulkRegisterBtn);
		BulkRegisterBtn.click();
		Reporter.log("<B><font color = 'blue'>Step 2 .</font></B> Clicked on Bulk_Register Button");
		Assert.assertTrue(true, "Failed to Clicked on Bulk_Register Button");
		

		helper.waitFor(Browse);
		helper.highLightElement(driver, Browse);
		Browse.click();
		Reporter.log("<B><font color = 'blue'>Step 3 .</font></B> Clicked on Browse_option Filed ");
		Assert.assertTrue(true, "Failed to Clicked on Browse_option Filed ");
		Thread.sleep(5000);
		helper.uploadFile("C:\\Users\\GLB-BLR-449\\Downloads\\Employee Registration.xlsx");

		Thread.sleep(3000);
		 

		helper.waitFor(add);
		helper.highLightElement(driver, add);
		add.click();
		Reporter.log("<B><font color = 'blue'>Step 4 .</font></B> Clicked on Add  Button ");
		Assert.assertTrue(true, "Failed to Clicked on Add Button ");
 
		Thread.sleep(4000);

		helper.waitFor(one_emp);
		helper.highLightElement(driver, one_emp);
		one_emp.click();
		Reporter.log("<B><font color = 'blue'>Step 5 .</font></B> Selected  Employee(Clicking check box) ");
		Assert.assertTrue(true, "Failed to Selected on one_emp");

		helper.waitFor(two_emp);
		helper.highLightElement(driver, two_emp);
		two_emp.click();
		Reporter.log("<B><font color = 'blue'>Step 6 .</font></B> Selected  employee (Clicking check box)");
		Assert.assertTrue(true, "Failed to Selected on two_emp");
		
		helper.waitFor(delete_reg_employess);
		helper.highLightElement(driver, delete_reg_employess);
		delete_reg_employess.click();
		Reporter.log("<B><font color = 'blue'>Step 7 .</font></B> Clicked on Deleted Button");
		Assert.assertTrue(true, "Failed to Clicked on Deleted Button");
		Thread.sleep(1000);
		
		helper.waitFor(del_modal);
		helper.highLightElement(driver, del_modal);
		del_modal.click();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> Clicked on Delete  modal button");
		Assert.assertTrue(true, "Failed to Clicked on Delete  modal button");
		Thread.sleep(2000);
		
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		helper.waitFor(Show_entries_list);
		helper.highLightElement(driver, Show_entries_list);
		helper.move_to_element_click_target(Show_entries_list);
		helper.robot_third_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> Selected Show_entries");
		Assert.assertTrue(true, "Failed to Selected  Show_entries");
		 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,600);");
		
		Thread.sleep(3000);

	}

}
