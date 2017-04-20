package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	public static WebDriver driver;
	

	
	public static  WebDriver Open_browser(String browser_name,String url){
	
		
		if(browser_name.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(browser_name.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
			 driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.get(url);
		return driver;
		
	}
}
