package highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Highlight {
	
	
	public WebDriver driver;
	
	public void highlight(WebDriver driver,WebElement element) throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",element);
				
		Thread.sleep(30);
		
		js.executeScript("arguments[0].setAttribute('style','border:2px white:');",element);
		
	}
	
	@Test
	public void login() throws InterruptedException{
		
		
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.facebook.com");
		 
		 
		// Inspect element
		WebElement username= driver.findElement(By.id("email")); 
		 
		// Call reuse method
		 highlight(driver,username);
	
	
	
	
	

}}
