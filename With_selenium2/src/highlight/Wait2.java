package highlight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait2 {
	
	
	
	public static WebDriver driver;
	
	
	@Test
	
	public void sync(){
		
		
		driver = new FirefoxDriver();
		
		
		//implicit wait
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		//explicitWait
		
		driver.findElement(By.id("timingAlert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Timing Alert")));
		
		
	
		
		
		//element.click();
		
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent())	;
		
	alert.accept();
			
		
	}
	

}
