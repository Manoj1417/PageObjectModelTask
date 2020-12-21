package Testcases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import Browser.Launching;
import POM.Add_User_Object;
import Screenshot.Screen;


public class Add_user extends Launching {
	
	
	static Logger logger = Logger.getLogger(Add_user.class);
	@Test
	public void Adduser() throws InterruptedException
	{
		logger.info("Get Into Add user Page");
		test = extent.createTest("Adduser","passedtestcases");
		Assert.assertTrue(true);
		
		PageFactory.initElements(driver,Add_User_Object.class);
		Add_User_Object.UserRole.click();
		Add_User_Object.EmployeeName.sendKeys(properties.getProperty("EmployeeName"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Add_User_Object.Username.sendKeys(properties.getProperty("Username"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Add_User_Object.Status.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Add_User_Object.Password.sendKeys(properties.getProperty("Password"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Add_User_Object.ConfirmPassword.sendKeys(properties.getProperty("ConfirmPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Add_User_Object.SaveButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

	@AfterMethod
	public void screenshot(ITestResult result)
	{
	
	
	if(ITestResult.FAILURE==result.getStatus())
	{
		logger.info("Failed Test Cases Taken Screenshot");
		Screen.screen(driver, result.getName());
	}
	
	}
		
		
	
	

}


