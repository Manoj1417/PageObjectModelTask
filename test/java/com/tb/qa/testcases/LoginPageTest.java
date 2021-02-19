package com.tb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.LoginPage;
import com.tb.qa.pages.ProjectListPage;

public class LoginPageTest extends TestBase {
		
	LoginPage loginPage;
//	ProjectListPage projectListPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
//		
//	@Test
//	public void loginTest() {
//		projectListPage = loginPage.login("Admin4", "admin");
//	}
	@Test
	public void loginTestN1() {
		loginPage = loginPage.loginN("Admin5", "admin");
	}
//	@Test
//	public void loginTestN2() {
//		loginPage = loginPage.loginN("Admin4", "adminTest");
//	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}
