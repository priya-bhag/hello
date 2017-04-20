package toolsQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_down {
	
	//bootstrap drop down is a kind of drop down only 
	//if select class didnt work then its bootstrap drop down 
	
	
public	WebDriver driver;
	
	
	@Test
	
	public void drop_down() throws InterruptedException{
		 driver=new FirefoxDriver();
		 driver.get("http://seleniumpractise.blogspot.in/2016/08/");
		 
		 driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		 
		 
		 //this xpath ..we can generate
		 
		 //"//ul[@class='dropdown-menu']//li/a"
		 
		 
		 // the table has got tag ====ul
		 
		 //here the table with the class name ===dropdown-menu
		 
		 //then it has got 4  li
		 
		 //then a tags 
		 
		 
		 
		 
		 
	List <WebElement> items = 	 driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	
	for (WebElement a : items){
		String value =(a.getAttribute("innerHTML"));
	if(value.contains("JavaScript")){
		a.click();
		break;
	
	}
	}
		
}
}