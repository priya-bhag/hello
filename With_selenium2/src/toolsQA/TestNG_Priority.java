package toolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Priority {
	
	public static WebDriver driver;
	
	@Test(priority=0)
	
	public void Set_up(){
		
		String url = "http://newtours.demoaut.com/index.php";
		

		
		System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
		
		//create webdriver object
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours" );
	
	}
	
	@Test(priority=1)
	public void close(){
		
		try{
			driver.quit();
		}catch (NullPointerException e1)
		{
			System.out.println("browser closed");
	
		}
		}
		
	}
	


