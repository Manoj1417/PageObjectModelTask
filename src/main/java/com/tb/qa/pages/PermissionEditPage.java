package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PermissionEditPage extends TestBase {
	@FindBy(xpath="//input[@name='TableSearch']")
	WebElement Search_Box;
	
	@FindBy(xpath="//p[@class='ant-empty-description']")
	WebElement NoData_Txt;
	
	@FindBy(xpath="//*[self::span][@id='showrecordspan']")
	WebElement Result_Record;
	
	@FindBy(xpath="(//button[@class='ant-btn sc-ifAKCX fcfmNQ ant-btn-circle ant-btn-sm'])[3]")
	WebElement Permission_Btn;
	
	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement Close_Btn;
	
	@FindBy(xpath="//button[@name='Menu_Main Menu_Edit']")
	WebElement Edit_Btn;
	
	@FindBy(xpath="(//*[self::i][@class='anticon anticon-down ant-select-arrow-icon'])[2]")
	WebElement Category_Dropdown;
	
	@FindBy(xpath="(//*[self::i][@class='anticon anticon-down ant-select-arrow-icon'])[3]")
	WebElement ObjectName_Dropdown;
	
	@FindBy(xpath="(//*[self::li][@name='Object Name_Option'])[1]")
	WebElement Objectname_Project;
	
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[4]")
	WebElement Category_Module;
	
	@FindBy(xpath="//button[@name='Permission_Save']")
	WebElement Save_Btn;
	
	@FindBy(xpath="(//*[self::div][@class='ant-form-explain'])[1]")
	WebElement Savebtn_ErrTxt;
	
	@FindBy(xpath="(//*[self::div][@class='ant-form-explain'])[2]")
	WebElement Savebtn_ErrTxt1;
	
	@FindBy(xpath="(//*[self::div][@class='ant-form-explain'])[3]")
	WebElement Savebtn_ErrTxt2;
	
	@FindBy(xpath="//button[@name='Permission_Cancel']")
	WebElement AddCl_Btn;
	
	@FindBy(xpath="(//*[self::i][@class='anticon anticon-down ant-select-arrow-icon'])[4]")
	WebElement PermissionName_Dropdown;
	
	@FindBy(xpath="(//*[self::li][@name ='Permission Level_Option'])[5]")
	WebElement Permission_Rwad;
	
	@FindBy(xpath="//button[@name='PopupCancel']")
	WebElement Cancel_Btn;
	
	@FindBy(xpath="//input[@id='Change Reason']")
	WebElement reason_Txt;
	
	@FindBy(xpath="//div[@class='ant-form-explain']")
	WebElement reasonerror_msg;
	
	@FindBy(xpath="//button[@name='PopupConfirm']")
	WebElement Confirm_Btn;
	
	@FindBy(xpath="//span[@name='AlertMessage']")
	WebElement Success_Msg;
	
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement Ok_Btn;
	
public PermissionEditPage()
{
	PageFactory.initElements(driver, this);
}
public PermissionEditPage SearchNe(String Char) throws InterruptedException
{
	Thread.sleep(1000);
	Search_Box.sendKeys(Char);
	Thread.sleep(2000);
	return null;
}
public String ShowingRecord()
{
	return Result_Record.getText();
}
public PermissionEditPage Edit() throws InterruptedException
{
	Permission_Btn.click();
	Thread.sleep(2000);
	Close_Btn.click();
	Thread.sleep(2000);
	Permission_Btn.click();
	Thread.sleep(2000);
	Edit_Btn.click();
	Thread.sleep(2000);
	AddCl_Btn.click();
	Thread.sleep(2000);
	Edit_Btn.click();
	Thread.sleep(2000);
	Category_Dropdown.click();
	Thread.sleep(2000);
	Category_Module.click();
	Thread.sleep(2000);
	Save_Btn.click();
	Thread.sleep(2000);
	return null;
}
public String Mandatory_msg() throws InterruptedException
{
	return Savebtn_ErrTxt.getText();
}
public String Mandatory_msg1() throws InterruptedException
{
	return Savebtn_ErrTxt1.getText();
}
public String Mandatory_msg2() throws InterruptedException
{
	return  Savebtn_ErrTxt2.getText();
}
public PermissionEditPage Edit1() throws InterruptedException
{
	 AddCl_Btn.click();
	 Thread.sleep(2000);
	 Edit_Btn.click();
	Thread.sleep(2000);
	Category_Dropdown.click();
	Thread.sleep(2000);
	Category_Module.click();
	Thread.sleep(2000);
	ObjectName_Dropdown.click();
	Thread.sleep(2000);
	Objectname_Project.click();
	Thread.sleep(2000);
	Save_Btn.click();
	Thread.sleep(2000);
	return null;
}
public PermissionEditPage Edit2() throws InterruptedException
{
	 AddCl_Btn.click();
	Thread.sleep(2000);
	Edit_Btn.click();
	Thread.sleep(2000);
	Category_Dropdown.click();
	Thread.sleep(2000);
	Category_Module.click();
	Thread.sleep(2000);
	ObjectName_Dropdown.click();
	Thread.sleep(2000);
	Objectname_Project.click();
	Thread.sleep(2000);
	PermissionName_Dropdown.click();
	Thread.sleep(2000);
	Permission_Rwad.click();
	Thread.sleep(2000);
	Save_Btn.click();
	Thread.sleep(2000);
	Cancel_Btn.click();
	Thread.sleep(2000);
	Save_Btn.click();
	Thread.sleep(2000);
	Confirm_Btn.click();
	Thread.sleep(2000);
	return null;
}

public String Reason_msg1() throws InterruptedException
{
	return reasonerror_msg.getText();
}

public PermissionEditPage Edit3(String Char) throws InterruptedException
{
	Thread.sleep(2000);
	reason_Txt.sendKeys(Char);
	return null;
}
public PermissionEditPage Edit4(String Char) throws InterruptedException
{
	Thread.sleep(2000);
	reason_Txt.clear();
	Thread.sleep(2000);
	reason_Txt.sendKeys(Char);
	return null;
}
public PermissionEditPage Edit5() throws InterruptedException
{
	Thread.sleep(2000);
	Confirm_Btn.click();
	Thread.sleep(2000);
	return null;
}
public String Reason_msg2() throws InterruptedException
{
	return  Success_Msg.getText();
}
public PermissionEditPage Edit6() throws InterruptedException
{
	Ok_Btn.click();
	Thread.sleep(2000);
	Close_Btn.click();
	Thread.sleep(2000);
	Search_Box.clear();
	Thread.sleep(2000);
	
	return null;
}


}


