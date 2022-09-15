
package com.emp.qa.pages;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
public class RegisterEmployeePage extends BasePage {

	public RegisterEmployeePage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//button[@id='add_btn']")
	@CacheLookup
	WebElement RegisterEmployee;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement Firstname;

	@FindBy(xpath = "//input[@id='f_name']")
	@CacheLookup
	WebElement Lastname;

	@FindBy(xpath = "//input[@id='emp_email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@id='c_passwd']")
	@CacheLookup
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id='telephone']")
	@CacheLookup
	WebElement Mobilenumber;

	@FindBy(xpath = "//input[contains(@name,'empCode')]")
	@CacheLookup
	WebElement Employeecode;

	@FindBy(xpath = "//select[@id='locations-addEmp']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//select[@id='role-addEmp']")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath= "//li[@class='select2-selection__choice'][contains(.,'×Software Tester')]")
	@CacheLookup
	WebElement SoftwareTester;

	@FindBy(xpath= "//select[@id='EmpReg_departments']")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//input[@id='date_joinCalender']")
	@CacheLookup
	WebElement Dateofjoining;

	@FindBy(xpath = "//select[@id='timeZoneAppend']")
	@CacheLookup
	WebElement Timezone;
	
	@FindBy(xpath = "//select[@id='timeZoneAppend']//option[@id='tz-opt-32']")
	@CacheLookup
	WebElement AsiaKolkata;

	@FindBy(xpath = "//select[@id='Shiftfilteradd']")
	@CacheLookup
	WebElement selectshift;

	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = "//button[@id='empReg']")
	@CacheLookup
	WebElement Register;

	@FindBy(xpath = "//li[@id='select2-role-addEmp-result-8oh9-81']")
	WebElement SoftwareDev;

	public void RegisterEmployee() throws InterruptedException {
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clickedonEmployeeDetails");
		Assert.assertTrue(true, "Failed to clickedonEmployeeDetails");

		helper.waitFor(RegisterEmployee);
		helper.highLightElement(driver, RegisterEmployee);
		RegisterEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clickedonRegisterEmployee");
		Assert.assertTrue(true, "Failed to clickedonRegisterEmployee");

		helper.waitFor(Firstname);
		helper.highLightElement(driver, Firstname);
		Firstname.sendKeys("Automation12");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clickedonFirstname");
		Assert.assertTrue(true, "Failed to sent data to Firstname");

		helper.waitFor(Lastname);
		helper.highLightElement(driver, Lastname);
		Lastname.sendKeys("CodeeeAuto");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Lastname");
		Assert.assertTrue(true, "Failed to sent data to Lastname");

		Random g=new Random();
		int num=g.nextInt(100);
		String Act_g="skabcdef";
		String Exp_g=Act_g+num;
		
		
		helper.waitFor(email);
		helper.highLightElement(driver, email);
		email.sendKeys(Exp_g+"@gmail.com");
		
		
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clickedonemail");
		Assert.assertTrue(true, "Failed to sent data to email");

		helper.waitFor(password);
		helper.highLightElement(driver, password);
		password.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on password");
		Assert.assertTrue(true, "Failed to sent password data");

		helper.waitFor(confirmpassword);
		helper.highLightElement(driver, confirmpassword);
		confirmpassword.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clickedonconfirmpassword");
		Assert.assertTrue(true, "Failed to sent data to confirmpassword");

		helper.waitFor(Mobilenumber);
		helper.highLightElement(driver, Mobilenumber);
		Mobilenumber.sendKeys("9876543210");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Mobilenumber");
		Assert.assertTrue(true, "Failed to sent mobile number data");

		Random r=new Random();
		int num1=r.nextInt(100);
		String Act_code="Emp-Abzcde-12345";
		String Exp_code=Act_code+num1;
		
		helper.waitFor(Employeecode);
		helper.highLightElement(driver, Employeecode);
		Employeecode.sendKeys(Exp_code);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clickedonEmployeecode");
		Assert.assertTrue(true, "Failed to sent data to Employeecode");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clickedonLocation");
		Assert.assertTrue(true, "Failed to selecte location");
		
		

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		helper.selectDropDownValue(Role, "value", "2");
		helper.jsCLick(Role);
		//Role.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Role");
		Assert.assertTrue(true, "Failed to clickeonRole");
		
		


		
		
		helper.waitFor(Department);
		Department.click();
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "Testing");
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clickedonDepartment");
		Assert.assertTrue(true, "Failed to select Department");
		
	

		helper.waitFor(Dateofjoining);
		helper.highLightElement(driver, Dateofjoining);
		Dateofjoining.sendKeys("01-03-2021");
		  //String dateVal = "30-12-2019"; helper.SelectDateByJS(driver, Dateofjoining,dateVal);
		 
		
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");  
//		Date date = new Date();  
//		Dateofjoining.sendKeys(formatter.format(date));
		Dateofjoining.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clickedonDateofjoining");
		Assert.assertTrue(true, "Failed to selecte Dateofjoining");
		

		helper.waitFor(Timezone);
		helper.highLightElement(driver, Timezone);
		Timezone.click();
		//helper.selectDropDownValue(Timezone, "index", "0");
		//helper.jsCLick(Timezone);
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clickedonTimezone");
		Assert.assertTrue(true, "Failed to selecte Timezone");
		
		
		helper.waitFor(AsiaKolkata);
		helper.highLightElement(driver, AsiaKolkata);
		AsiaKolkata.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicke on AsiaKolkata");
		Assert.assertTrue(true, "Failed to select AsiaKolkata");

		

		helper.waitFor(selectshift);
		helper.highLightElement(driver, selectshift);
		helper.selectDropDownValue(selectshift, "value", "115");
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clickedonselectshift");
		Assert.assertTrue(true, "Failed to selecte selectshift");

		helper.waitFor(Address);
		helper.highLightElement(driver, Address);
		Address.sendKeys("Hno:123,Banglore");
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clickedonAddress");
		Assert.assertTrue(true, "Failed to selecte Address");

		
		helper.waitFor(Register);
		helper.highLightElement(driver, Register);
		helper.Scrollintoview(Register);
		helper.jsCLick(Register);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clickedonRegister");
		Assert.assertTrue(true, "Failed to selecte Register");
		Thread.sleep(7000);

	}

}
