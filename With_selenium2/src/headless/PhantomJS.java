package headless;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

//phantom JS we can capture screenshot
//Ghostdriver
//phantomJS.binary.path

public class PhantomJS {
	
	
	
	@Test
	public void verifyFacebook(){
		
		//File location = new File("//Users//rameshpriya//Downloads//phantomjs-2.1.1-macosx//bin//phantomjs");
		
		System.setProperty("phantomjs.binary.path","//Users//rameshpriya//Downloads//phantomjs-2.1.1-macosx//bin//phantomjs");
				
				
				//location.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(src,new File("//Users//rameshpriya//Desktop//image.png"));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
