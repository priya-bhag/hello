package common_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//return the page titile using javascript

public class JavaScript {
	
	
	public WebDriver driver;
	
	
	@Test
	
	public void getTitle(){
		
	driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	String title = 	(String) js.executeScript("return document.title");
		
	WebElement element =(WebElement) js.executeScript("return document.getElementByid(email)");
		
		
		
	}
	
	

}
