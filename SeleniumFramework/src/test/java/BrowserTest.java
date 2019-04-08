import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		//getting the path from the string , this way error won't occur if project is taken to different system
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anita\\eclipse-workspace\\SeleniumFramework\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", projectPath + "\\Drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver35.exe");
        WebDriver driver = new ChromeDriver();

		driver.get("http://google.com/");
		//to get the count of all the input  webelements in the page
		List<WebElement> lstOfInputElements = driver.findElements(By.xpath("//input"));
		
		int cntList = lstOfInputElements.size();
		System.out.println(cntList);
        //try {
		//	Thread.sleep(3000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
        driver.close();

	}

}
