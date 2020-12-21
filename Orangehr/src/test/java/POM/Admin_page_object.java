package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_page_object {
@FindBy(id="menu_admin_viewAdminModule")
public static WebElement Admin;

@FindBy(id="menu_admin_UserManagement")
public static WebElement UserManagement;

@FindBy(id="searchSystemUser_userName")
public static WebElement Username;

@FindBy(id="searchSystemUser_userType")
public static WebElement UserRole;
	

@FindBy(id="searchSystemUser_employeeName_empName")
public static WebElement EmployeeName;

@FindBy(id="searchSystemUser_status")
public static WebElement Status;

@FindBy(id="btnAdd")
public static WebElement AddButton;

}
