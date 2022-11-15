package com.emp.qa.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
@Listeners(ITestNGListener.class)
public class AutoEmailReportsPage extends BasePage {

	public  AutoEmailReportsPage(WebDriver driver) {
		super(TestBase.getDriver());
	

}
	
	Helpers helper=new Helpers();
	
	
	
	@FindBy(xpath = "//a[@title='Auto Email Reports']")
	@CacheLookup
	WebElement AutoemailReports;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Reports')]")
	@CacheLookup
	WebElement SelectNewReport;
	
	@FindBy(xpath = "//input[@id='usr']")
	@CacheLookup
	WebElement ReportsTitle;
	
	@FindBy(xpath = "//input[@id='daily']")
	@CacheLookup
	WebElement Frequency_Daily_RadioButton;
	
	@FindBy(xpath = "//input[@id='emailReq']")
	@CacheLookup
	WebElement Recipients_Email;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement I_want_to_recieve_email_checkBox;
	

	@FindBy(xpath = "//input[@id='productivity']")
	@CacheLookup
	WebElement Productivity_checkBox;
	
	@FindBy(xpath = "//input[@id='pdf_id']")
	@CacheLookup
	WebElement PDF_checkBox;
	
	@FindBy(xpath = "//input[@id='csv_id']")
	@CacheLookup
	WebElement CSV_CheckBox;
	
	@FindBy(xpath = "//input[@id='org']")
	@CacheLookup
	WebElement organzation_chekBox;
	
	@FindBy(xpath = "//input[@id='emp8925']")
	@CacheLookup
	WebElement Employee_checkBox;
	
	@FindBy(xpath = "//button[@id='testmail']")
	@CacheLookup
	WebElement Send_Testmail;
	
	@FindBy(xpath = "//button[@id='save']")
	@CacheLookup
	WebElement Save_Button;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	@CacheLookup
	WebElement OK_Button;
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	@CacheLookup
	WebElement OK;
	
	public void AutoEmailReportsPage()throws InterruptedException{
		
		
		helper.waitFor(AutoemailReports);
		helper.highLightElement(driver, AutoemailReports);
		AutoemailReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Autoemail-Reports");
		Assert.assertTrue(true, "Failed to click on Autoemail-Reports");
		 
		helper.waitFor(ShowEntries);
		helper.highLightElement(driver,ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Show-Entries Drop-Down Selected Value ");
		Assert.assertTrue(true, "Failed to click on on Show-Entries Drop-Down Selected Value");
		
		helper.waitFor(SelectNewReport);
		helper.highLightElement(driver,SelectNewReport);
		SelectNewReport.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Select-New-Report Button");
		Assert.assertTrue(true, "Failed to click on Select-New-Report Button ");
		
		 
		Random r=new Random();
		int num=r.nextInt(100);
		String Act_name="AutomationCode";
		String Exp_name=Act_name+num;
		
		helper.waitFor(ReportsTitle);
		helper.highLightElement(driver,ReportsTitle);
		ReportsTitle.sendKeys(Exp_name);
		ReportsTitle.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B>  Clecked on Text Field & Entered Report Name ");
		Assert.assertTrue(true, "Failed to Cleck on Text Field & Entered Report Nam");
		
		helper.waitFor(Frequency_Daily_RadioButton);
		helper.highLightElement(driver, Frequency_Daily_RadioButton);
		Frequency_Daily_RadioButton.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on  Frequency_Daily_Radio Button");
		Assert.assertTrue(true, "Failed to click on  Frequency_Daily_Radio Button");
		
		helper.waitFor(Recipients_Email);
		helper.highLightElement(driver,Recipients_Email);
		Recipients_Email.sendKeys("sithukalluru@gmail.com");
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on E-mail Text filed & Entered E-mail ");
		Assert.assertTrue(true, "Failed to Click on E-mail Text filed & Entered E-mail ");
		
		
		helper.waitFor( I_want_to_recieve_email_checkBox);
		helper.highLightElement(driver, I_want_to_recieve_email_checkBox);
		I_want_to_recieve_email_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on  I_want_to_recieve_email_checkBox");
		Assert.assertTrue(true, "Failed to click on  I_want_to_recieve_email_checkBox");
		Thread.sleep(2000);
		
		helper.waitFor(Productivity_checkBox);
		helper.highLightElement(driver,Productivity_checkBox);
		Productivity_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Productivity_checkBox");
		Assert.assertTrue(true, "Failed to click on  Productivity_checkBox");
		Thread.sleep(2000);
		
		helper.waitFor(PDF_checkBox);
		helper.highLightElement(driver, PDF_checkBox);
		PDF_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on  PDF_checkBox");
		Assert.assertTrue(true, "Failed to click on  PDF_checkBox");
		Thread.sleep(2000);
		
		helper.waitFor(CSV_CheckBox);
		helper.highLightElement(driver, CSV_CheckBox);
		CSV_CheckBox.click();
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on  CSV_Check-Box");
		Assert.assertTrue(true, "Failed to click on  CSV_Check-Box");
		Thread.sleep(2000);
		
		helper.waitFor(organzation_chekBox);
		helper.highLightElement(driver,organzation_chekBox);
		organzation_chekBox.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on organzation_chekBox");
		Assert.assertTrue(true, "Failed to click on  organzation_chekBox");
		Thread.sleep(2000);
		
	
		
		
		helper.waitFor(Send_Testmail);
		helper.highLightElement(driver, Send_Testmail);
		Send_Testmail.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Send_Test-mail");
		Assert.assertTrue(true, "Failed to click on  Send_Test-mail");
		Thread.sleep(2000);
		
		helper.waitFor(OK_Button);
		helper.highLightElement(driver, OK_Button);
		helper.Scrollintoview(OK_Button);
		OK_Button.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on OK_Button");
		Assert.assertTrue(true, "Failed to click on OK_Button");
		Thread.sleep(2000);
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.Scrollintoview(Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on  Save_Button");
		Assert.assertTrue(true, "Failed to click on  Save_Button");
		Thread.sleep(2000);
		
		
		helper.waitFor(OK);
		helper.highLightElement(driver, OK);
		OK.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on  OK");
		Assert.assertTrue(true, "Failed to click on  OK");
		Thread.sleep(2000);
}

	
}




