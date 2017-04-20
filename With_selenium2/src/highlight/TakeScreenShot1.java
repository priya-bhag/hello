package highlight;

import java.io.IOException;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TakeScreenShot1 {
	
	
	public static WebDriver driver;
	
	
	@Test
	
	public void screenshot(){
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
try{
	FileUtils.copyFile(src,new File( "//Users//rameshpriya//Desktop//save.png"));
}
	catch(IOException e){
		System.out.println(e.getMessage());
	}
		
		
		
	}
	

}
