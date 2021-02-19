package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class UsersAddPage extends TestBase

     
{
	@FindBy(xpath="//button[@name='TableAdd']")
	WebElement Tableadd_btn;
	
	@FindBy(xpath="//button[@name='Cancel']")
	WebElement Cancel_btn;
//	
//	@FindBy(xpath="//button[@name='TableAdd']")
//	WebElement Tableadd_btn1;
	
	@FindBy(xpath="//input[@id='RoleName']")
	WebElement Rolename_Txt;
	
	@FindBy(xpath="//button[@name='Clear']")
	WebElement Clear_Clck;
	
	@FindBy(xpath="//*[self::label][@for=\"RoleName\"]/../..//*[self::div][@class=\"ant-form-explain\"]")
	WebElement Roles_Txt;
	
	@FindBy(xpath="//*[self::label][@for=\"RoleDescription\"]/../..//*[self::div][@class=\"ant-form-explain\"]")
	WebElement RolesDes_Txt;
	
	@FindBy(xpath="//input[@id='RoleDescription']")
	WebElement Role_descerption;
	//Roles Add Button
	@FindBy(xpath="//button[@name='Add']")
	WebElement Add_Button;
	//Popup message ok button
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement PopUp_ok;
	
	//@FindBy(xpath="//div[@class='ant-form-explain']")
	
	@FindBy(xpath="//div[@class='ant-breadcrumb']")
	WebElement BreadCrumb;
	
    @FindBy(xpath="	//div[@class='ant-modal-confirm-content']")
    WebElement Success_Msg;

	
	public UsersAddPage()
	{
		PageFactory.initElements(driver, this);
	}
	public UsersAddPage Clear_Clr()
	{
		Clear_Clck.click();
		return null;
	}
	public UsersAddPage ThreadSleep() throws InterruptedException
	{
		Thread.sleep(1000);
		return null;
	}
	public UsersAddPage Add() throws InterruptedException
	{
        Thread.sleep(2000);
		Tableadd_btn.click();
		Thread.sleep(2000);
		Cancel_btn.click();
		Thread.sleep(2000);
		Tableadd_btn.click();
		Thread.sleep(2000);
		return null;
	}
	public UsersAddPage Add_Btn()
	{
		Add_Button.click();
		return null;
	}
		public UsersAddPage mandatorySpaceerror(String Space) throws InterruptedException
		{
	    	
		Rolename_Txt.sendKeys(Space);
		Thread.sleep(2000);
	    return null;
		}
		
		public String Clear()  
		{
		return Roles_Txt.getText();
		}
		
		public String Clear1()
		{
			return RolesDes_Txt.getText();
		}
		
		public UsersAddPage mandatoryNumericerror(String Num) throws InterruptedException
		{
	   
		Thread.sleep(2000);
		Rolename_Txt.sendKeys(Num);
		Thread.sleep(2000);
		return null;
		}
		
		public UsersAddPage Mandatoryminerror(String SingleChar) throws InterruptedException
		{
		Rolename_Txt.sendKeys(SingleChar);
		Thread.sleep(2000);
		return null;
		}
		
		
		public UsersAddPage mandatoryMaxerror(String Minimumnumber) throws InterruptedException
		{
			Rolename_Txt.sendKeys(Minimumnumber);
			return null;
		}
		
		
		public UsersAddPage RolesSpeChar(String SpecialChar) throws InterruptedException
		{
			Thread.sleep(2000);
			Rolename_Txt.sendKeys(SpecialChar);
			return null;
	   
		}
	
		public UsersAddPage Rolesadd(String Rolename) throws InterruptedException
		{ 
			Thread.sleep(2000);
			Rolename_Txt.sendKeys(Rolename);
			return null;
		}
		
		public UsersAddPage RolesDesMin(String MinimumValue) throws InterruptedException
		{
			Thread.sleep(2000);
			Role_descerption.sendKeys(MinimumValue);
			return null;
		}
		public UsersAddPage RolesDesMax(String MinimumNumber) throws InterruptedException
		{ 
			Role_descerption.sendKeys(MinimumNumber);
			return null;
		}
	
		//ROleDescription Special Character
		public UsersAddPage RolesDesSpechar(String specialChar) throws InterruptedException
		{
			Thread.sleep(2000);
			Role_descerption.sendKeys(specialChar);
			return null;
		}
	
		
		public UsersAddPage RolesDes(String Char) throws InterruptedException
		{
			Thread.sleep(2000);
			Role_descerption.sendKeys(Char);
			return null;
		}
		public UsersAddPage RolesNaDes(String Char,String Char1) throws InterruptedException
		{
			Thread.sleep(2000);
			Rolename_Txt.sendKeys(Char);
			Thread.sleep(2000);
			Role_descerption.sendKeys(Char1);
			return null;
		}
		public UsersAddPage AddButt() throws InterruptedException
		{
			Thread.sleep(2000);
			Add_Button.click();
			Thread.sleep(2000);
			return null;
		}
		public String Success_Msg()
		{
			return Success_Msg.getText();
		}
		public UsersAddPage Popupok() throws InterruptedException 
		{
			Thread.sleep(2000);
			PopUp_ok.click();
			return null;
		}
		
		
		


	
		
		

}


