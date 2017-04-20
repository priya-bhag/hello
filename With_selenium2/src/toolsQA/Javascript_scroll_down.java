package toolsQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Javascript_scroll_down {
	
	
	public static WebDriver driver;
	
	//Scroll Down using JavaScriptExecutor.
	
	@Test
	public void scroll(){
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	driver= new FirefoxDriver();
	
	driver.get("http://moneyboats.com/");
	
	//driver.manage().window().maximize();
	
		
		
		
	js.executeScript("window.scrollBy(0,600)");
		
	}
	
	

}
