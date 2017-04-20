package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Date_time1 {
	
	
	public static WebDriver driver;
	
	
	
	@Test
	
	public void Date1(){
		
		driver = new FirefoxDriver();
		
		driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
		
		
		WebElement date_icon =	driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']"));
		
		date_icon.click();

		

		
		 WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));

		    //button to move previous month in calendar
		 

		    WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]")); 
			
		
		midLink.click();
		
		
		
		
	}
	
	

}
