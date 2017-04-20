/**
 * 
 */
package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author rameshpriya
 * 
 * 
 * 
 * page factory has a class initElement which will initialize all the webElement
 *
 */
public class Login_new {
	
	WebDriver driver;
	
	public Login_new(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="userName")
	@CacheLookup   //store elements in the cache memeory
	WebElement usr;
	

	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement passwd;
	
	@FindBy(how=How.NAME,using ="login") 
	@CacheLookup
	WebElement button;
	
	public void login(String usrn,String pass){
	usr.sendKeys(usrn);
	passwd.sendKeys(pass);
	button.click();

	}
}