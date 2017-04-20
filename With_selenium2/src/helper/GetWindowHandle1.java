package helper;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetWindowHandle1 {
	
	public static WebDriver driver;
	
	@Test
	public void windowHandle(){
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
	}
		
		/*//get parent window name
		
		String parent = driver.getWindowHandle();
		
		//get all window names
		
		Set<String>l = driver.getWindowHandles();
		
		
		//create iterator 
		
		
		Iterator<String> i =l.iterator();
		
		
		while(i.hasNext()){
			
			String child =i.next();
			*/
		
		
	}
	
	

