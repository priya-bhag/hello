package toolsQA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//find number of broken links in gmail 



public class No_of_broken_links {
	
	
	public static WebDriver driver;
	
	
	@Test
	
	
	public void count_links() throws IOException{
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		List <WebElement> links  = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		System.out.println("The total number of links  " + size);
		
	for (int i=0;  i<size ; i++){
		
		
		String f = links.get(i).getAttribute("href");
		
		//System.out.println(e);
		
		connection(f);
	}
	
				
	}
	
	
	
	public static void connection(String website) throws IOException{
		
		try{
		
		
		URL url = new URL(website);
		
		
		
			HttpURLConnection obj = (HttpURLConnection)url.openConnection();
			obj.setConnectTimeout(3000);
			obj.connect();
			
		Assert.assertEquals(obj.getResponseCode(), 200);
		{
			System.out.println(website +"  "+obj.getResponseMessage());
		}
		/*else if (obj.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			System.out.println(obj.getResponseMessage());
		}*/
		
		}catch(Exception e){
			
		}
	
	
	
	}}



