package toolsQA;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NoPOMTestGuru99Login {
	

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	
		driver.findElement(By.name("userName")).sendKeys("priya");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
Assert.assertTrue(title.contains("Find a Flight: Mercury Tours:"));		
	}

}
