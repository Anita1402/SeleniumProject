package selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extent_Report_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = null;
		//Start Reporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		//create extentreports and attach reporters
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//create a toggle for the given test, adds all log event under it
		ExtentTest test1 = extent.createTest("Google Search Test","This is a test to validate google search function");
		

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver35.exe");
        driver = new ChromeDriver();
        
        //start extentreport
		test1.log(Status.INFO, "starting test");
		//go to google
        driver.get("https://google.com");
        test1.pass("Navigated to google.com");
        
        
        driver.manage().window().maximize();
                
        //enter txt in the search box
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered text");
  
        //hit enter button instead of click
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
        test1.pass("clicked button");
        
        driver.close();		
        System.out.println("Test Completed Sucessfully");    
        test1.pass("Closed browser");
        test1.info("Test Completed");
        
        //calling Flush writes everything to log file so important step
       extent.flush();
	}

}
