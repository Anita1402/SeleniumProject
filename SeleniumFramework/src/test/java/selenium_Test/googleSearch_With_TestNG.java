package selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config_Pkg.properties_Details;

public class googleSearch_With_TestNG {
    WebDriver driver = null;
    public static String browserName = null;
    
	//Enter all the intial steps needed to go to the test page
	@BeforeTest
    public void setUp() {
		String projectPath = System.getProperty("user.dir");
		 
		properties_Details.get_Properties();
    	 
    	 //Check for the browser
    	 if (browserName.equalsIgnoreCase("chrome")){
        	 System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver35.exe");
        	 driver = new ChromeDriver();
    	 } else if (browserName.equalsIgnoreCase("firefox")){
    		 System.setProperty("webdriver.firefox.driver", projectPath + "/Drivers/geckodriver.exe");
        	 driver = new FirefoxDriver();
    	 }
    	 
	}
	
	//Write the testcases
	@Test
	public void google_Search() {
        //go to google
        driver.get("https://google.com");
        driver.manage().window().maximize();
        //enter txt in the search box
        driver.findElement(By.name("q")).sendKeys("Automation");
        
        //hit enter button instead of click
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);		
	}
	
	//close the window after the test is complete
	@AfterTest
	public void tearDown() {
		driver.close();
		//calls the set preperties in properties_details class to set the result to pass in the config file 
		properties_Details.set_Properties();
		System.out.println("Test Completed Sucessfully");
	}
}
