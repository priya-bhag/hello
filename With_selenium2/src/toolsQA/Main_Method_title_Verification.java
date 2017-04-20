package toolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Main_Method_title_Verification {
	
	
	public static String url = "http://newtours.demoaut.com/index.php";
	
	//create webdriver object
	
	public static WebDriver driver = new FirefoxDriver();
	
	
	
	public static void Title_verification(){
		
		String expected ="Welcome: Mercury Tours";
		String actual = driver.getTitle();
			
		try{
			Assert.assertEquals(actual, expected);
			System.out.println("passed");
		}catch(Throwable e){
			System.out.println("failed");
		}
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		driver.get(url);

		
		Title_verification();
		
		
		}


}
