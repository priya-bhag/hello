package toolsQA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNG1 {
	
	public static WebDriver driver;
	
	
  @Test
  public void login() {
	  
		
		
		driver.findElement(By.name("userName")).sendKeys("priya");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
Assert.assertTrue(title.contains("Find a Flight: Mercury Tours:"));		
 
  }
	  

  @BeforeMethod
  public void Launch() {
	  driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/");
		
	  
	  
  }

  @AfterMethod
  public void close() {
	  driver.quit();
  }

}
