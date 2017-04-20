package toolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Drop_down_2 {
	
	
public	WebDriver driver;
	
	
	@Test
	
	public void drop_down() throws InterruptedException{
		 driver=new FirefoxDriver();
		 driver.get("http://foundation.zurb.com/sites/docs/v/5.5.3/components/dropdown.html#");
		 driver.findElement(By.xpath("html/body/div[1]/div/section/div[1]/div[2]/p[1]/a")).click();
		 
	List<WebElement>items = driver.findElements(By.xpath("//ul[@class='f-dropdown open f-open-dropdown']//li/a"));
	
	for(WebElement e:items){
		String value = e.getAttribute("innerHTML");
		System.out.println(value);
		if(value.contains("This is another")){
			e.click();
			break;
		}
		}
	}
}