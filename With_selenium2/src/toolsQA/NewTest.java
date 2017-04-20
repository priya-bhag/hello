package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
 
	public static WebDriver driver =new FirefoxDriver();
	public String search ="guru99";
	
	
	@Test
	@Parameters({"author","search"}) //these are the names of the parameters
	public void Set_up(String author ,String search,String london ){
	
	driver.get("https://www.google.com/");
	
	
	WebElement box =driver.findElement(By.id("lst-ib"));
	box.sendKeys(search);
	
System.out.println("value in the search box is "+box.getAttribute("value") );
	
	Assert.assertTrue(box.getAttribute("value").equalsIgnoreCase(search));
	
	
	}
	
}
