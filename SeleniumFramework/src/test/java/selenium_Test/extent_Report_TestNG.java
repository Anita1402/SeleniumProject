package selenium_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extent_Report_TestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver = null;
	@BeforeSuite
	public void setUp() {
		//Start Reporter
		htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		//create extentreports and attach reporters
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	//Enter all the intial steps needed to go to the test page
	@BeforeTest
    public void setUpTest() {
		 String projectPath = System.getProperty("user.dir");
    	 System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver35.exe");
    	 driver = new ChromeDriver();
    	 
	}
	
	@Test
	public void testCase1() throws Exception {
		//create a toggle for the given test, adds all log event under it
		ExtentTest test1 = extent.createTest("Google Search Test","This is a test to validate google search function");
		
		//go to google
        driver.get("https://google.com");
        test1.pass("navigated to google screen");
		// log(Status, details)
        test1.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test1.info("This step shows usage of info(details)");
        
        // log with snapshot
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test1.addScreenCaptureFromPath("screenshot.png");	
        
       
	}
	
	@Test
	public void testCase2() throws Exception {
		//create a toggle for the given test, adds all log event under it
		ExtentTest test1 = extent.createTest("Google Search Test","This is a test to validate google search function");
		// log(Status, details)
        test1.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test1.info("This step shows usage of info(details)");
        
        // log with snapshot
        test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test1.addScreenCaptureFromPath("screenshot.png");	
        
       
	}
	
	//close the window after the test is complete
		@AfterTest
		public void tearDownTest() {
			driver.close();
			System.out.println("Test Completed Sucessfully");
		}
		
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
