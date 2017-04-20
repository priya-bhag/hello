
package highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse {
	public static WebDriver driver;

	@Test
	
	public void window(){
		
		
		driver =new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement element =driver.findElement(By.xpath(".//*[@id='hplogo']/a/img"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(element).build().perform();
		
		
		
		
		
		
}
}