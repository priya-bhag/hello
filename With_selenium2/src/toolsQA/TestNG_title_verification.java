package toolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_title_verification {
	
	

	public static String url = "http://newtours.demoaut.com/index.php";
	
	//create webdriver object
	
	public static WebDriver driver = new FirefoxDriver();
	
	
	
	@BeforeTest
	public void set_up(){
		
		driver.get(url);
		
	}
	
	
	@Test
	public void title_verification(){
		String expected ="Welcome: Mercury Tours";
		String actual = driver.getTitle();
	
			Assert.assertEquals(actual, expected);
			
	}
	
	@AfterTest
	public void close_browser(){
		driver.close();
	}
	
	
	
}
