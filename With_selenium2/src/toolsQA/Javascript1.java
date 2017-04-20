package toolsQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;





/*Launch the site
Fetch the details of the site like URL of the site, title name and domain name of the site.
Then navigate to a different page.*/

public class Javascript1 {

	public static WebDriver driver;
	
	
	@Test
	
	public static void login(){
		
		driver= new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	String domain = js.executeScript("return document.domain;").toString();
		
		System.out.println("domain name is " + domain);
		
		String title = js.executeScript("return document.title;").toString();
		
		System.out.println("title of the page is " + title);
		
		String url = js.executeScript("return document.URL;").toString();
		
		System.out.println("The url of the page is "+ url);
		
		
	}
	
	
	
	
	
}
