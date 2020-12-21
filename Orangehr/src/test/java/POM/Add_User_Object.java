package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_User_Object {

	@FindBy(id="systemUser_userType")
	public static WebElement UserRole;
	
	@FindBy(id="systemUser_employeeName_empName")
	public static WebElement EmployeeName;
	
	@FindBy(id="systemUser_userName")
	public static WebElement Username;
	
	@FindBy(id="systemUser_status")
	public static WebElement Status;
	
	@FindBy(id="systemUser_password")
	public static WebElement Password;
	
	@FindBy(id="systemUser_confirmPassword")
	public static WebElement ConfirmPassword;
	
	@FindBy(id="btnSave")
	public static WebElement SaveButton;
	
}
