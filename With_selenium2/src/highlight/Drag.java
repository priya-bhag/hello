package highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag {
	
	
	public static WebDriver driver;

	@Test
	
	public void DRag(){
		
		driver=new FirefoxDriver();
		
		
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
	
		
		
		WebElement target = driver.findElement(By.id("dragdiv"));
		WebElement dest = driver.findElement(By.id("dropdiv"));
		
		Actions builder = new Actions(driver);
		Action drag= builder.clickAndHold(target)
		
	.moveToElement(dest)
	.release(dest)
	.build();
	drag.perform();
		
		
		
	
		
	
	

}
}