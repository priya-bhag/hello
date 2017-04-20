package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;

public class TestCase_for_loginNew {
	
	
	
	@Test
	public void loginNew(){
		
		BrowserFactory obj = new BrowserFactory();
		
		//this will launch browser and url
		
		WebDriver driver1 = obj.Open_browser("firefox","http://newtours.demoaut.com/index.php");
		
		
		//PageFactory --built in class
		
		
		//taking arguments driver and login obects class = Login_new.class which returns objects
		
		//Created object using page Factory
	
		Login_new obj1 = PageFactory.initElements(driver1, Login_new.class);
		
		
		//Login_new.class=this will return page objects of Login_new Class
		
		//call the method
		
		
		obj1.login("priya", "mercury");
	}

}
