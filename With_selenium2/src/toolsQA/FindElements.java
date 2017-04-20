package toolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {

	
		
		driver =new FirefoxDriver();
		
		driver.get("http://jqueryui.com/");
		
		List<WebElement> links = driver.findElements(By.xpath((".//*[@id='menu-top']/li")));
		for(int i=0;i<links.size();i++){
			
			WebElement e = links.get(i);
			
		}
		
		
		
		
		
		
		
	}

}
