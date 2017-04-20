package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//this class will store all the locators and methods of login page 
//of http://newtours.demoaut.com/index.php


//constructor name same as class name

public class Login{
	
	
	WebDriver driver;
	
	
	
	//all the elements in the login page 
	
	By UserName = By.name("userName");
	By Password =By.name("password");
	By login =By.name("login");
	
	
	
	//constructor is to just initialize the webdriver
	
	
	public Login(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	// the method which can execute on the elements
	
	public void type_userName(){
		driver.findElement(UserName ).sendKeys("priya");
	}
	public void type_password()
	{
		driver.findElement(Password).sendKeys("mercury");
	}
	public void click_loginBTn(){
		driver.findElement(login).click();
	}
	
}
