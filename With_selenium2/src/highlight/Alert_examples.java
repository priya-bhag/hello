package highlight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert_examples {
	
	
	
	public static WebDriver driver;

	@Test
	
	public void window(){
		
driver = new FirefoxDriver();

driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");


driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[4]/button")).click();

Alert alert = driver.switchTo().alert();

alert.accept();

WebElement element =driver.findElement(By.xpath(".//*[@id='content']/p[8]/button"));

JavascriptExecutor js  =(JavascriptExecutor)driver;

js.executeScript("arguments[0].click()",element);

alert.dismiss();




}
}