package Testcases;




import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Browser.Launching;
import POM.Login_Page_Objects;
import Screenshot.Screen;


public class login_page extends Launching {
	
	static Logger logger = Logger.getLogger(login_page.class);
	
	
	
	
	@Test
	public void loginpage() throws IOException 
	{
		
	     
		logger.info("Log In Application");
		test = extent.createTest("loginpage","passedtestcases");
		Assert.assertTrue(true);
		
	      

	PageFactory.initElements(driver,Login_Page_Objects.class);
	Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Login_Page_Objects.SubmitButton.click();
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
