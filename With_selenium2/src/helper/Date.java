package helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Date {
	
	
	
	public static WebDriver driver;
	
	@Test
	public void date(){
		driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
		
		List <WebElement>date = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']//table[1]//td"));
		
		for(int i=0; i< date.size(); i++){
			
			String value = date.get(i).getText();
			
			if( value.equals("19")){
				date.get(i).click();			
			break;
		}
		
		
	}
	
	
	
	

}
}
