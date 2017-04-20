package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_POM {

	
	WebDriver driver;
	
	By signOff_link = By.linkText("SIGN-OFF");
	
	public void homePage(WebDriver driver){
		
		this.driver=driver;
	}
	
	//get the sign_off link(for verification)
	
	public String getTheLink(){
		return driver.findElement(signOff_link).getText();
	}
	
	
	
	
}
