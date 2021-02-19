package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class UsersListPage extends TestBase {
	
	@FindBy(xpath="//input[@name='TableSearch']")
	WebElement Search_Box;
	
	@FindBy(xpath="//p[@class='ant-empty-description']")
	WebElement NoData_Txt;
	
	@FindBy(xpath="//*[self::span][@id='showrecordspan']")
	WebElement Result_Record;
	
	@FindBy(xpath="//i[@class='anticon anticon-close']")
	WebElement Search_Close; 
	
	@FindBy(xpath="//button[@name='mamamamma_Edit']")
	WebElement EditButton;
	
	@FindBy(xpath="//input[@id='RoleDescription']")
	WebElement Role_descerption;
	//Edit Module
	@FindBy(xpath="//button[@name='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="//span[@class='ant-select-arrow']")
	WebElement DropDownarrow;
	
	@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-selected']")
	WebElement DropdownAct;
	
	@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item']")
	WebElement DropdownInAct;
	
	@FindBy(xpath="//button[@name='Save']")
	WebElement Save_Btn;
	
	@FindBy(xpath="//*[self::div][@class='ant-form-explain']")
	WebElement RoleDes_txt;
	//Update Roles
	@FindBy(xpath="//button[@name='PopupCancel']")
	WebElement Cancel_Btn;
	
	@FindBy(xpath="//button[@name='PopupConfirm']")
	WebElement Confirm_Btn; 
	
	@FindBy(xpath="//div[@class='ant-form-explain']")
	WebElement Reason_Txt;
	
	@FindBy(xpath="//input[@id='Change Reason']")
	WebElement ChangeReason_Txt;
	
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement ok_Btn;
	
	@FindBy(xpath="//div[@class='ant-modal-confirm-content']")
	WebElement Donemessage;
	
	public UsersListPage()
	{
		PageFactory.initElements(driver, this);
	}
	public UsersListPage SearchNe(String Char) throws InterruptedException
	{
		Thread.sleep(1000);
		Search_Box.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	public String Nodata()
	{
		return NoData_Txt.getText();
	}
	public UsersListPage Search(String Char) throws InterruptedException
	{
		Thread.sleep(2000);
		Search_Close.click();
		Thread.sleep(3000);
		Search_Box.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	public String ShowingRecord()
	{
		return Result_Record.getText();
	}
	
	public UsersListPage Edit() throws InterruptedException
	{
		Thread.sleep(1000);
		EditButton.click();
		return null;
	}
	public UsersListPage Cancel(String Char) throws InterruptedException
	{
		Thread.sleep(2000);
		Cancel.click();
		Thread.sleep(2000);
		Search_Box.sendKeys(Char);
		return null;
	}
	public UsersListPage EditRolrdes() throws InterruptedException
	{
		Thread.sleep(2000);
		EditButton.click();
		Thread.sleep(2000);
		Role_descerption.clear();
		Thread.sleep(2000);
		return null;
	}
	public UsersListPage RolesDesMin(String MinimumValue) throws InterruptedException
	{
		Thread.sleep(2000);
		Role_descerption.sendKeys(MinimumValue);
		return null;
	}
	public UsersListPage Rolesdes() throws InterruptedException
	{
		Thread.sleep(2000);
		Role_descerption.clear();
		return null;
	}
	public UsersListPage RolesDesMax(String MinimumNumber) throws InterruptedException
	{ 
		Role_descerption.sendKeys(MinimumNumber);
		return null;
	}

	//ROleDescription Special Character
	public UsersListPage RolesDesSpechar(String specialChar) throws InterruptedException
	{
		Thread.sleep(2000);
		Role_descerption.clear();
		Thread.sleep(2000);
		Role_descerption.sendKeys(specialChar);
		return null;
	}
	//Role descerpetion Negative message
	public String DesNegChar()
	{
		return RoleDes_txt.getText();
		
	}

	public UsersListPage RoleDesdit() throws InterruptedException
	{
		Thread.sleep(2000);
		Role_descerption.clear();
		
		return null;
	}
	
	public UsersListPage RolesAcIn(String Char) throws InterruptedException
	{
		Thread.sleep(2000);
		Role_descerption.sendKeys(Char);
		Thread.sleep(2000);
		DropDownarrow.click();
		Thread.sleep(2000);
		DropdownInAct.click();
		return null;
	}
	public UsersListPage RolesAc() throws InterruptedException 
	{
		Save_Btn.click();
		Thread.sleep(2000);
		Cancel_Btn.click();
		Thread.sleep(2000);
		Save_Btn.click();
		Thread.sleep(2000);
		Confirm_Btn.click();
		return null;
	}
	public String UpdateRoles()
	{
		return Reason_Txt.getText();
	}
	public UsersListPage Changereason(String Char) throws InterruptedException
	{
		Thread.sleep(2000);
		ChangeReason_Txt.sendKeys(Char);
		return null;
	}
	public UsersListPage Changereason1(String Char) throws InterruptedException
	{
		ChangeReason_Txt.clear();
		Thread.sleep(2000);
		ChangeReason_Txt.sendKeys(Char);
		Thread.sleep(2000);

		return null;
	}
	public UsersListPage ChangeConfirmBtn()
	{
		Confirm_Btn.click();
		return null;
	}
	public String Donemsg()
	{
		return Donemessage.getText();
	}
	public UsersListPage okBtn()
	{
		
		ok_Btn.click();
		return null;
	}
	
	
}
