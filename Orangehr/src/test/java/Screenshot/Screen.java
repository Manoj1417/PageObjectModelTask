package Screenshot;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Screen
{
public static void screen(WebDriver driver, String screen) 
	{

		
		try
		{
			
			Robot robot = new Robot();
			  
			Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
			Rectangle rectangle = new Rectangle(ScreenSize);
			
			BufferedImage source = robot.createScreenCapture(rectangle);
			
			File destinationfile = new File("D:\\Screenshots\\screenshot");
			
			ImageIO.write(source, "png",destinationfile );
			
			
//		TakesScreenshot Screenshot	= (TakesScreenshot)driver;
//		
//		File source=Screenshot.getScreenshotAs(OutputType.FILE);
//		
////		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
//		
//		FileHandler.copy(source, new File("C:\\Users\\manoj\\eclipse-workspace\\Orangehr\\ScreenShots"+System.currentTimeMillis()+".png"));
//		
//		System.out.println("taken screenshot");
}
   catch (Exception e) 
   {
	  System.out.println("exception while taking a screenshot"+e.getMessage());
	   
   } 
		}
}

