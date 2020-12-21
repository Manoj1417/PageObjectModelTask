package Browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Screenshot.Screen;

public class Launching {
	public static ExtentHtmlReporter htmlReporter;//html reporter
	   
    public static ExtentReports extent;
   
    public static ExtentTest test;
	
	public static WebDriver driver;
	
	public static Properties properties;
	
	static Logger logger = Logger.getLogger(Launching.class);//log file
	
	public Properties Propertyfile() throws IOException
	{
      FileInputStream FileInputStream = new FileInputStream("Config.properties");
      properties = new Properties();
      properties.load(FileInputStream);
      return properties;
     }
	@BeforeSuite
	public void setup() throws IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM Begins");
		logger.info("Loading Property File");
		Propertyfile();
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReports1.html");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("yyy-mm-ddd , HH:mm:ss");
		
		
		String browser = properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation = properties.getProperty("Driverlocation");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",driverlocation);
		logger.info("Launching Chrome");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driverlocation);
			logger.info("Launching FireFox");
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	 @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	    }
	
	
	@AfterTest
	public void extent()
	{
		extent.flush();
	}
	@AfterSuite
	public void teardown()
	{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		logger.info("Close the browser");
		driver.quit();
		
	}

}
