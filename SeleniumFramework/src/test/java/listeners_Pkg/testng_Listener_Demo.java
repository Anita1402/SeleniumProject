package listeners_Pkg;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//removing the below annotation as this is added in the testng1.xml file
//@Listeners(listeners_Pkg.listeners_With_Testng.class)
public class testng_Listener_Demo {
     
	@Test
	public void test1() {
    	 System.out.println("In test1");
     }
    
	@Test 
	public void test2() {
    	 System.out.println("In test2");
    	 String projPath = System.getProperty("user.dir");
    	 System.setProperty("webdriver.chrome.driver",projPath + "/Drivers/chromedriver35.exe");
    	 WebDriver driver = new ChromeDriver();
    	 
    	 driver.get("http://google.com");
    	 driver.findElement(By.name("q")).sendKeys("Automation");
    	 driver.findElement(By.name("d")).sendKeys("Automation");
    	 driver.close();
     }
     
	@Test
	public void test3() {
    	 System.out.println("In test3");
    	 throw new SkipException("This test3 is skipped");
     }
}
