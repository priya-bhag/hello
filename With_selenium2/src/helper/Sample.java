package helper;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample {

	public static void main(String[] args) throws InterruptedException, AWTException {	

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10);
		

Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ALT);  				
robot.keyPress(KeyEvent.VK_TAB);  
robot.keyRelease(KeyEvent.VK_TAB); 
robot.keyRelease(KeyEvent.VK_ALT); 


		driver.findElement(By.name("userName")).sendKeys("priya");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		if (url.contains("http://newtours.demoaut.com/mercuryreservation.php"))
		{
			System.out.println("passed");
		}
		
		else{
			System.out.println("failed");
		}
		
		driver.close();
		driver.quit();//close the focused browser
	}
}
