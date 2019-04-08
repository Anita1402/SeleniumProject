package selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
    

	public static void main(String[] args) {
		 googleSearch();
	}
      
      public static void googleSearch(){
           String projectPath = System.getProperty("user.dir");
           System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver35.exe");
           WebDriver driver = new ChromeDriver();
           
           //go to google
           driver.get("https://google.com");
           driver.manage().window().maximize();
           //enter txt in the search box
           driver.findElement(By.name("q")).sendKeys("Automation");
           //driver.findElement(By.name("q")).sendKeys(Keys.TAB);
           
           //driver.findElement(By.name("btnK")).click();
           //hit enter button instead of click
           driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
           driver.close();		
           System.out.println("Test Completed Sucessfully");    	
      }
}
