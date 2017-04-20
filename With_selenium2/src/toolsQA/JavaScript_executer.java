package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_executer {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('gs_htif0').value='car';");
		//js.executeScript("document.getElementByname('btnK').click");
	}

	}


