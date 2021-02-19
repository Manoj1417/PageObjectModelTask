package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PermissionAddPage extends TestBase{

	@FindBy(xpath="//*[self::button][@name='mamamamma_Permissions']")
	WebElement Permission_Btn;
	
	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement Close_Btn;
	
	@FindBy(xpath="//button[@class='ant-btn sc-ifAKCX fcfmNQ ant-btn-primary ant-btn-lg']")
	WebElement Add_Btn;
	
	@FindBy(xpath="//input[@name='TableSearch']")
	WebElement Search_Box;
	
	@FindBy(xpath="//i[@class='anticon anticon-close']")
	WebElement Search_Close; 
	
	@FindBy(xpath="//button[@name='Permission_Cancel']")
	WebElement AddCl_Btn;
	//Permission page Close button
	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement Permission_Close;
	
	@FindBy(xpath="//button[@name='Permission_Save']")
	WebElement Save_Btn;
	
	@FindBy(xpath="(//*[self::div][@class='ant-form-explain'])[1]")
	WebElement Savebtn_ErrTxt;
	
	@FindBy(xpath="(//*[self::div][@class='ant-form-explain'])[2]")
	WebElement Savebtn_ErrTxt1;
	
	@FindBy(xpath="(//*[self::div][@class='ant-form-explain'])[3]")
	WebElement Savebtn_ErrTxt2;
	
	@FindBy(xpath="(//*[self::i][@class='anticon anticon-down ant-select-arrow-icon'])[2]")
	WebElement Category_Dropdown;
	//object category dropdown list
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[3]")
	WebElement Category_Menu;
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[2]")
	WebElement Category_SubMenu;
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[2]")
	WebElement Category_SubModule;
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[4]")
	WebElement Category_Module;
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[5]")
	WebElement Category_Action;
	@FindBy(xpath="(//*[self::li][@name='Object Category_Option'])[6]")
	WebElement Category_Element;
	
	@FindBy(xpath="(//*[self::i][@class='anticon anticon-down ant-select-arrow-icon'])[3]")
	WebElement ObjectName_Dropdown;
	//object Name dropdown list
	@FindBy(xpath="(//*[self::li][@name ='Object Name_Option'])[6]")
	WebElement Object_Mainmenu;
	//Permission level dropdownlist
	@FindBy(xpath="(//*[self::i][@class='anticon anticon-down ant-select-arrow-icon'])[4]")
	WebElement PermissionName_Dropdown;
	@FindBy(xpath="(//*[self::li][@name ='Permission Level_Option'])[5]")
	WebElement Permission_Rwad;
	
	@FindBy(xpath="	//div[@class='ant-modal-confirm-content']")
    WebElement Success_Msg;
	
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement Ok_Btn;

	public PermissionAddPage()
	{
		PageFactory.initElements(driver, this);
	}
	public PermissionAddPage Permission_btn(String Char) throws InterruptedException
	{
		Search_Box.clear();
		Thread.sleep(2000);
		Permission_Btn.click();
		Thread.sleep(2000);
		Close_Btn.click();
		Thread.sleep(2000);
		Search_Box.clear();
		Thread.sleep(2000);
		Search_Box.sendKeys(Char);
		Thread.sleep(2000);
		Permission_Btn.click();
		Thread.sleep(2000);
		return null;
	}
	public PermissionAddPage Permissionadd_Btn() throws InterruptedException
	{
		Add_Btn.click();
		Thread.sleep(2000);
		AddCl_Btn.click();
		Thread.sleep(2000);
		Add_Btn.click();
		Thread.sleep(2000);
		Permission_Close.click();
		Thread.sleep(2000);
		Permission_Btn.click();
		Thread.sleep(2000);
		Add_Btn.click();
		Thread.sleep(2000);
		Save_Btn.click();
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
	public PermissionAddPage Category_Std() throws InterruptedException
	{
		AddCl_Btn.click();
		Thread.sleep(2000);
		Add_Btn.click();
		Thread.sleep(2000);
		Category_Dropdown.click();
		Thread.sleep(2000);
		Category_Menu.click();
		Thread.sleep(2000);
		Save_Btn.click();
		Thread.sleep(2000);
		return null;
		
	}
	public PermissionAddPage Objectname() throws InterruptedException
	{
		AddCl_Btn.click();
		Thread.sleep(2000);
		Add_Btn.click();
		Thread.sleep(2000);
		Category_Dropdown.click();
		Thread.sleep(2000);
		Category_Menu.click();
		Thread.sleep(2000);
		ObjectName_Dropdown.click();
		Thread.sleep(2000);
		Object_Mainmenu.click();
		Thread.sleep(2000);
		Save_Btn.click();
		Thread.sleep(2000);
		return null;
	}
	public PermissionAddPage Permissionlevel() throws InterruptedException
	{
		AddCl_Btn.click();
		Thread.sleep(2000);
		Add_Btn.click();
		Thread.sleep(2000);
		Category_Dropdown.click();
		Thread.sleep(2000);
		Category_Menu.click();
		Thread.sleep(2000);
		ObjectName_Dropdown.click();
		Thread.sleep(2000);
		Object_Mainmenu.click();
		Thread.sleep(2000);
		PermissionName_Dropdown.click();
		Thread.sleep(2000);
		Permission_Rwad.click();
		Thread.sleep(2000);
		return null;
	}
	public PermissionAddPage permissionsave() throws InterruptedException
	{
		Save_Btn.click();
		Thread.sleep(2000);
		return null;
	}
	public String Success_msg() throws InterruptedException
	{
		return Success_Msg.getText();
    }
	public PermissionAddPage permissionok() throws InterruptedException
	{
		Ok_Btn.click();
		Thread.sleep(2000);
		Permission_Close.click();
		Thread.sleep(2000);
		Search_Close.click();
		Thread.sleep(2000);
		return null;
		
	}
	
	
}
