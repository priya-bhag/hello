package highlight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Date {
	
	public static WebDriver driver;
	
	@Test
	public void dynamic(){
		driver=new FirefoxDriver();
		date_select("12");
	}
	
	
	
	public static void date_select(String new_data){
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	List<WebElement>day=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));	
	
	for( int i=0;i<day.size();i++){
		
		String data = day.get(i).getText();
		
		if (data.equals(new_data)){
			day.get(i).click();
			break;
		}
		
	}
	}
	
	
	

}
