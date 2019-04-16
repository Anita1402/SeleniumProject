package priority_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_MultiBrowser_Demo {

	WebDriver driver = null;
	String projPath = System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName) {
		System.out.println("Browser Name is : " + browserName);
		System.out.println("Thread id is: "+ Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projPath + "/Drivers/chromedriver35.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projPath + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.ie.driver", projPath + "/Drivers/IEDriverServer64.exe");
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("http://google.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}
	
}
