package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//verify login


public class TestCase_for_login {
	
	
	public WebDriver driver;
	
	
	@Test
	public void VerifyLogin(){
		
WebDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com/index.php");


driver.manage().window().maximize();


//create object of the class Login


Login obj = new Login(driver);

//calling the methods

obj.type_userName();

obj.type_password();

obj.click_loginBTn();

driver.quit();


}
}