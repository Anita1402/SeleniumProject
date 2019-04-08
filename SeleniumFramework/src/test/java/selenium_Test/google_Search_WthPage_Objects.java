package selenium_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom_Pages.googleSearchPageObjects;

public class google_Search_WthPage_Objects {
	
	   private static WebDriver driver = null;
	   
         public static void main(String[] args) {
        	 google_Frst_Page_Search();
		}   
         
         public static void google_Frst_Page_Search() {
        	 String projectPath = System.getProperty("user.dir");
        	 System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver35.exe");
        	 driver = new ChromeDriver();
        	 
        	 googleSearchPageObjects searchPgObj = new googleSearchPageObjects(driver);
        	 
        	 driver.get("https://google.com");
        	 driver.manage().window().maximize();
        	 searchPgObj.setTxtInSrchBox("Automate testing");
        	 searchPgObj.clickSrchButton();
        	 driver.close();
        	 
        	 
         }
	
}
