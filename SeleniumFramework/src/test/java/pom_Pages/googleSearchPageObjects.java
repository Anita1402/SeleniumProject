package pom_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjects {

	WebDriver driver = null;
	By textbox_Search = By.name("q");
	By search_Button = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']");
	
	public googleSearchPageObjects(WebDriver driver) {
		//using this as i am using the same variable driver as an argument and as a variable
		this.driver = driver;
		
	}
	
	public void setTxtInSrchBox(String text) {
		driver.findElement(textbox_Search).sendKeys(text);
	}
	
	public void clickSrchButton() {
		driver.findElement(search_Button).sendKeys(Keys.RETURN);
	}
}
