package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
		
		//create webdriver object
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://newtours.demoaut.com/index.php");
		
		Actions builder = new Actions(driver);
		
		WebElement Link_Home = driver.findElement(By.linkText("Home"));
		  WebElement td_Home = driver
	                .findElement(By
	                .xpath("//html/body/div"
	                + "/table/tbody/tr/td"
	                + "/table/tbody/tr/td"
	                + "/table/tbody/tr/td"
	                + "/table/tbody/tr"));    
	        
		  String Home_color = td_Home.getCssValue("background-color");
		  
		  System.out.println("Before mouse over " + Home_color);
		  
		  
		  
		
		Action mouse_over =  builder.moveToElement(Link_Home).build();
		
		
		Thread.sleep(10);
		mouse_over.perform();
		
		//Thread.sleep(10);

		
		System.out.println("after mouse over" +td_Home.getCssValue("background-color") );

	}

}
