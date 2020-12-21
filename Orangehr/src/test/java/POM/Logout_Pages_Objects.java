package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Pages_Objects {
	@FindBy(xpath="//*[@id='welco']")
	public static WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\'welcome-menu\']/ul/li[2]/a")
	public static WebElement LogoutButton;
	
	

}
