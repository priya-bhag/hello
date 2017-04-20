package highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frames {
	public static WebDriver driver;

	@Test
	
	public void window(){
		
driver = new FirefoxDriver();

driver.get("http://toolsqa.com/iframe-practice-page/");


driver.switchTo().frame("iframe1");

driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("priya");



}
}