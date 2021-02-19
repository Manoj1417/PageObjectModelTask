package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class ProductControlledTermAddPage extends TestBase {
	@FindBy(xpath="//button[@name='TableAdd']")
	WebElement Tableadd_btn;
	
	@FindBy(xpath="//button[@name='Cancel']")
	WebElement Cancel_btn;
	
	@FindBy(xpath="//button[@name='Clear']")
	WebElement Clear_Clck;
	
    @FindBy(xpath="//input[@id='TermName']")
    WebElement Term_name;
    
    @FindBy(xpath="//input[@id='ShortValue']")
    WebElement Short_Value;
    
    @FindBy(xpath="//input[@id='TermCode']")
    WebElement Term_Code;
    
    @FindBy(xpath="//input[@id='LongValue']")
    WebElement Long_Value;
    
    @FindBy(xpath="//button[@name='Add']")
	WebElement Add_Button;
    
    @FindBy(xpath="//*[self::label][@for=\"TermName\"]/..//..//*[self::div][@class=\"ant-form-explain\"]")
    WebElement TermErr_Msg;
    
    @FindBy(xpath="//*[self::label][@for=\"TermCode\"]/..//..//*[self::div][@class=\"ant-form-explain\"]")
    WebElement CodeErr_Msg;
    
    @FindBy(xpath="//*[self::label][@for=\"ShortValue\"]/..//..//*[self::div][@class=\"ant-form-explain\"]")
    WebElement ShortErr_Msg;
	
    @FindBy(xpath="//*[self::label][@for=\"LongValue\"]/..//..//*[self::div][@class=\"ant-form-explain\"]")
    WebElement ValueErr_Msg;
	
	public ProductControlledTermAddPage()
	{
		PageFactory.initElements(driver, this);
	}
	public ProductControlledTermAddPage Clear_Clr()
	{
		Clear_Clck.click();
		return null;
	}
	public ProductControlledTermAddPage ThreadSleep() throws InterruptedException
	{
		Thread.sleep(1000);
		return null;
	}
	public ProductControlledTermAddPage Add() throws InterruptedException
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
	public ProductControlledTermAddPage add_btn1() throws InterruptedException
	{
		Add_Button.click();
		Thread.sleep(2000);
		return null;
	}
	//get the string values
	public String Termname_Err()
	{
		return TermErr_Msg.getText();
	}
	public String TermCode_Err()
	{
		return CodeErr_Msg.getText();
	}
	public String ShortValue_Err()
	{
		return ShortErr_Msg.getText();
	}
	public String LongValue_Err()
	{
		return  ValueErr_Msg.getText();
	}
	//In that Field We give char
	public ProductControlledTermAddPage Termpage(String Char) throws InterruptedException
	{
		Term_name.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	public ProductControlledTermAddPage ShortValue(String Char) throws InterruptedException
	{
		Short_Value.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	public ProductControlledTermAddPage TermCode(String Char) throws InterruptedException
	{
		Term_Code.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	public ProductControlledTermAddPage LongValue(String Char) throws InterruptedException
	{
		Long_Value.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	
	public ProductControlledTermAddPage Negative_Term(String Char) throws InterruptedException
	{
		Term_name.clear();
		Thread.sleep(1000);
		Term_name.sendKeys(Char);
		return null;
	}
	public ProductControlledTermAddPage Negative_Shortvalue(String Char) throws InterruptedException
	{
		Short_Value.clear();
		Thread.sleep(1000);
		Short_Value.sendKeys(Char);
		return null;
	}public ProductControlledTermAddPage Negative_TermCode(String Char) throws InterruptedException
	{
		Term_Code.clear();
		Thread.sleep(1000);
		Term_Code.sendKeys(Char);
		return null;
	}public ProductControlledTermAddPage Negative_LongValue(String Char) throws InterruptedException
	{
		Long_Value.clear();
		Thread.sleep(1000);
		Long_Value.sendKeys(Char);
		return null;
	}
	//clear that particular field
	public ProductControlledTermAddPage Clear_Term() throws InterruptedException
	{
		Term_name.clear();
		return null;
	}
	public ProductControlledTermAddPage Clear_Short() throws InterruptedException
	{
		Short_Value.clear();
		return null;
	}
	public ProductControlledTermAddPage Clear_Code() throws InterruptedException
	{
		Term_Code.clear();
		return null;
	}
	public ProductControlledTermAddPage Clear_Long() throws InterruptedException
	{
		Long_Value.clear();
		return null;
	}
	//maximum number
	public ProductControlledTermAddPage Maximum_Term(String Char) throws InterruptedException
	{
		Term_name.sendKeys(Char);
		return null;
	}
	public ProductControlledTermAddPage Maximum_Short(String Char) throws InterruptedException
	{
		Short_Value.sendKeys(Char);
		return null;
	}
	public ProductControlledTermAddPage Maximum_Code(String Char) throws InterruptedException
	{
		Term_Code.sendKeys(Char);
		return null;
	}
	public ProductControlledTermAddPage Maximum_Long(String Char) throws InterruptedException
	{
		Long_Value.sendKeys(Char);
		return null;
	}
}












































