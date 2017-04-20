package hotel_app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SharedUImapTest {
	
public static WebDriver driver;
public Properties prop;




@BeforeMethod

	public void login(){
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;

}

@Test

public void testMyFirst() throws FileNotFoundException, IOException{
	
	

			driver.get("http://www.adactin.com/HotelApp/");
			
			prop =new Properties();
			
			prop.load(new FileInputStream("//Users//rameshpriya//Documents//workspace//With_selenium2//shared_UI_map//SharedUImap.properties"));
			
			
			driver.findElement(By.id(prop.getProperty("edit_box_login_page_Username"))).sendKeys("priyaRam");
			driver.findElement(By.id(prop.getProperty("edit_box_login_page_Password"))).sendKeys("062082");
			driver.findElement(By.id((prop.getProperty("Button_Login_page_Login")))).click();
			
	Select location  = new Select(driver.findElement(By.xpath((prop.getProperty("Drop_down_searchPage_Location")))));
	
	
		
		location.selectByVisibleText("London");
		
		
		driver.findElement(By.id(prop.getProperty("button_searchPage_search"))).click();
		
		
		
		driver.findElement(By.xpath(prop.getProperty("radio_btn_searchPage_Select"))).click();
		
		
		driver.findElement(By.xpath(prop.getProperty("button_searchPage_Continue"))).click();
		
driver.findElement(By.xpath(prop.getProperty("edit_box_Book_a_hotel_FirstName"))).sendKeys("priya");




driver.findElement(By.id(prop.getProperty("edit_box_Book_a_hotel_lastName"))).sendKeys("ram");


driver.findElement(By.id(prop.getProperty("edit_box_Book_a_hotel_BillingAddress"))).sendKeys("uygqwehliiudiqeufi iuquyweuyqweuy");


driver.findElement(By.id(prop.getProperty("edit_box_Book_a_hotel_CreditCardNo."))).sendKeys("1234567890123456");

Select cc = new Select(driver.findElement(By.id(prop.getProperty("edit_box_Book_a_hotel_CreditCardType"))));

cc.selectByVisibleText("VISA");


Select cM = new Select(driver.findElement(By.id(prop.getProperty("drop_downBook_a_hotel_SelectMonth"))));

cM.selectByVisibleText("May");

Select cY = new Select(driver.findElement(By.id(prop.getProperty("drop_downBook_a_hotel_SelectYear"))));

cY.selectByVisibleText("2020");

driver.findElement(By.id(prop.getProperty("edit_box_Book_a_hotel_CVV_Number"))).sendKeys("123");


driver.findElement(By.xpath(prop.getProperty("button_Book_a_hotel_BookNow"))).click();

driver.findElement(By.linkText(prop.getProperty("link_Book_a_hotel_Logout"))).click();

driver.findElement(By.linkText(prop.getProperty("link_ClickHereToLoginAgain"))).click();





}}