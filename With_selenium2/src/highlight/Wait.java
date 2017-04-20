package highlight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Wait {

	public static WebDriver driver;
	
	
	@Test
	
	public void wait1(){
		

	driver = new FirefoxDriver();
	
	driver.get("http://google.com");
	
	
	driver.manage().window().maximize();
	
	//implicit wait
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//driver.findElement(By.linkText("Gmail")).click();
	
	//explicit wait
	
	//WebdriverWait class
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	//ExpectedCodition class
	
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("lst-ib")));
	
	element.sendKeys("cars");
	
	}
	
}
