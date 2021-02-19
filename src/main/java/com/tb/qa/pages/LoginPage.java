package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//input[@id='UserName']")
	WebElement UserName_txt;
	
	@FindBy(xpath = "//input[@id='UserPassword']")
	WebElement Password_txt;
	
	@FindBy(xpath = "//button[@name='SignIn']")
	WebElement SignIn_btn;
	
	//Initializing the Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	//Actions	
//	public ProjectListPage login(String UserName_td, String Password_td) {
//		UserName_txt.sendKeys(UserName_td);
//		Password_txt.sendKeys(Password_td);
//		//System.out.println(UserName_td +"\t"+ Password_td);		
//		SignIn_btn.click();
//		return new ProjectListPage();
//	}
	
	public LoginPage loginN(String UserName_td, String Password_td) {
		UserName_txt.sendKeys(UserName_td);
		Password_txt.sendKeys(Password_td);
		//System.out.println(UserName_td +"\t"+ Password_td);		
		SignIn_btn.click();
		return new LoginPage();
	}	
}
