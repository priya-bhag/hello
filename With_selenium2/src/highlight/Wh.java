package highlight;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Wh {
	
	public static WebDriver driver;

	@Test
	
	public void window(){
		
driver = new FirefoxDriver();

driver.get("https://www.naukri.com/");



String parent =driver.getWindowHandle();

//Set<String> childs = driver.getWindowHandles();

for(String handle :driver.getWindowHandles()){
	
	driver.switchTo().window(handle);
	
	String child = driver.getWindowHandle();
	
	if(!parent.equals(child)){
		
		driver.close();
		
	}
}
	
	}

}
