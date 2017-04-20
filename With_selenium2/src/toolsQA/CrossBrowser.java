package toolsQA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser{
	
	public WebDriver driver;
	
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	
	public void set_up(String browser) throws InterruptedException{
		
		
		if (browser.equalsIgnoreCase("firefox")){
			  driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
			 driver = new ChromeDriver();
			 Thread.sleep(10);
		}
	  driver.get("http://newtours.demoaut.com/");
		
	}
	
	
	@Test
	
	public void login(){
		
		
		driver.findElement(By.name("userName")).sendKeys("priya");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
Assert.assertTrue(title.contains("Find a Flight: Mercury Tours:"));		
 
  }
	
	@AfterMethod
	
	public void close(){
		driver.close();
	}

}
