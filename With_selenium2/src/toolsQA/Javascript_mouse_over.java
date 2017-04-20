package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Javascript_mouse_over {
	
	public static WebDriver driver;
	
	@Test
	
	public void mouse_over(){
		
		driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element =  driver.findElement(By.id("email"));
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		String strJavaScript = "var element = arguments[0];"
	            + "var mouseEventObj = document.createEvent('MouseEvents');"
	            + "mouseEventObj.initEvent( 'mouseover', true, true );"
	            + "element.dispatchEvent(mouseEventObj);";
		
	//Then JavascriptExecutor class is used to execute the script to trigger the dispatched event.
	((JavascriptExecutor) driver).executeScript(strJavaScript, element);

	}
	

}
