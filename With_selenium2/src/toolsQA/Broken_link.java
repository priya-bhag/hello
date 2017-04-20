package toolsQA;



//find whether the website is broken or not 

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Broken_link {
	
	
public static WebDriver driver;
	
	
	@Test
	public void  broken_links() throws IOException{
		
		
		driver = new FirefoxDriver();
		
		
		
		
		String website  =  "http://www.guru99.com/user-acceptance-testing.html";
		
		driver.get(website);

		
		//URL class
		
		URL  url= new URL(website);
		
		//HttpURLConnection class 
		
		
		HttpURLConnection obj = (HttpURLConnection)url.openConnection();
		
		obj.connect();
		
		int code =obj.getResponseCode();
		
		System.out.println(code);
		
		
		
		
	}
	
	
	
	
	

}
