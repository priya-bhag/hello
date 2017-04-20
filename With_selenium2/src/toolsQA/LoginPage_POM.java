package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {
	
	WebDriver driver;
	By userName_Login = By.name("userName");
	By password_Login=By.name("password");
	By SignIn_button=By.name("login");
	
	
	public void Login(WebDriver driver){
		this.driver=driver;
	}
	
	//set username in the textbox
	
	public void SetusrName(String usrName){
		driver.findElement(userName_Login).sendKeys(usrName);
	}
	
	public void SetPassword(String password){
		driver.findElement(password_Login).sendKeys(password);
	}
	public void ClickButton(){
		driver.findElement(SignIn_button).click();
	}
	
	//get the title of login page 
	public String title(){
		return driver.getTitle();
	}
//use all the above methods in this method 
	
	public void Login_mercury(String usr,String passwd){
		
		this.SetusrName(usr);
		this.SetPassword(passwd);
		this.ClickButton();

	}
	

}
