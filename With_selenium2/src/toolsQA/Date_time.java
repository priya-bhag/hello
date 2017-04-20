package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Date_time {
public static WebDriver driver;
	
	@Test
	
	public void date(){
		
		driver =new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/selenium");
		
	WebElement e = 	driver.findElement(By.name("bdaytime"));
	e.sendKeys("10/27/1983");
	
	e.sendKeys(Keys.TAB);

	e.sendKeys("12:23AM");
	
	}
}