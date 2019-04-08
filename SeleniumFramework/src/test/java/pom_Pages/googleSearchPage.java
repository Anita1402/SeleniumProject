package pom_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearchPage {
    //declaring the element variable  
	private static WebElement element = null;
      
     public static WebElement textBox_Search(WebDriver driver) {
		  element = driver.findElement(By.name("q"));
    	  return element;
      }
     
     public static WebElement search_Button(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
    	 return element;
    	 
     }
}

