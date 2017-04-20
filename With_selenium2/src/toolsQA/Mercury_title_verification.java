package toolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mercury_title_verification {
	
	/*
	 fetch Mercury Tours' homepage
	verify its title
	print out the result of the comparison
	close it before ending the entire program.
	
	*/
	
	/*
	 public static WebDriver driver;

	@Test
	
	public void Title(){
	
	System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");

	String Current_title = driver.getTitle();
		
	Assert.assertEquals(Current_title,"Welcome: Mercury Tours");
	driver.close();
	
	*/
	
	//OR
	
	
	
	
	public static void main(String[] args){
	
		
		//instantiate Chromedriver
		
		
	System.setProperty("webdriver.chrome.driver","/Users/rameshpriya/Downloads/chromedriver");
	
	//create webdriver object
	
	WebDriver driver = new ChromeDriver();
	
	
	//go to website
	
	driver.get("http://newtours.demoaut.com/");
	
	
	String Actual_title =driver.getTitle();
	
	
	 /*
     * compare the actual title of the page witht the expected one and print
     * the result as "Passed" or "Failed"
     */
	
	if (Actual_title.contentEquals("Welcome: Mercury Tours")){
		
		System.out.println("passed");
	}
	else
	{
		System.out.println("faied");
	}
	
	
	   //close Firefox
	
	driver.close();
	
    // exit the program explicitly
	
	System.exit(0);

	}
	
}
