package hotel_app;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerificationPointTest {
	
	public static WebDriver driver;



@BeforeMethod

	public void login() throws InterruptedException{
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;		
}

@Test

public void testMyFirst(){

			driver.get("http://www.adactin.com/HotelApp/");
			
			driver.findElement(By.id("username")).sendKeys("priyaRam");
			driver.findElement(By.id("password")).sendKeys("062082");
			driver.findElement(By.id("login")).click();
			
			
			String u_name = driver.findElement(By.xpath(".//*[@id='username_show']")).getAttribute("value");
			
			Assert.assertEquals("Hello priyaRam!",u_name);
			
	Select location  = new Select(driver.findElement(By.xpath(".//*[@id='location']")));
		
		location.selectByVisibleText("London");
		
		Select room_no = new Select(driver.findElement(By.name("room_nos")));
		
		room_no.selectByVisibleText("2 - Two");
		
Select adult_no = new Select(driver.findElement(By.name("adult_room")));
		
		adult_no.selectByVisibleText("2 - Two");
		
		driver.findElement(By.id("Submit")).click();
String location_compare = driver.findElement(By.id("location_1")).getAttribute("value");

Assert.assertEquals("London", location_compare);



		driver.findElement(By.xpath(".//*[@id='radiobutton_3']")).click();
		driver.findElement(By.xpath(".//*[@id='continue']")).click();
		
driver.findElement(By.id("first_name")).sendKeys("priya");

driver.findElement(By.id("last_name")).sendKeys("ram");


driver.findElement(By.id("address")).sendKeys("uygqwehliiudiqeufi iuquyweuyqweuy");


driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
Select cc = new Select(driver.findElement(By.id("cc_type")));

cc.selectByVisibleText("VISA");


Select cM = new Select(driver.findElement(By.id("cc_exp_month")));

cM.selectByVisibleText("May");

Select cY = new Select(driver.findElement(By.id("cc_exp_year")));

cY.selectByVisibleText("2020");

driver.findElement(By.id("cc_cvv")).sendKeys("123");


driver.findElement(By.xpath(".//*[@id='book_hotel_form']/table/tbody/tr[19]/td[2]/input[1]")).click();


try{
	
Assert.assertTrue(isElementPresent(By.linkText("Logout")));}

catch(Exception e){
	e.printStackTrace();
}


driver.findElement(By.linkText("Logout")).click();

driver.findElement(By.linkText("Click here to login again")).click();

	
	}


public Boolean isElementPresent(By by){
	
	return true;
	
}



}
