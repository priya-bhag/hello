package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript {
	
	//Example: Click a button to login and generate Alert window using JavaScriptExecutor.

	public static WebDriver driver;
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		
		 driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");
	        

			
	        //Perform Click on LOGIN button using JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	        WebElement button =driver.findElement(By.name("btnLogin"));			

	    	
	    	js.executeScript("arguments[0].click();",button);
		
	    	//To generate Alert window using JavascriptExecutor. Display the alert message 	
	    	
	    	//js.executeScript("alert('welcome');");

	
		
		
	}

}
