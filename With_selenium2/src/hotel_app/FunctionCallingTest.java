package hotel_app;


	

	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
	public class FunctionCallingTest {		
	public static WebDriver driver;

	public Properties prop;


	public void HA_BFLogin(WebDriver driver,String Uname,String Passwd) throws FileNotFoundException, IOException{

		
		
Properties prop = new Properties();

prop.load(new FileInputStream("//Users//rameshpriya//Documents//workspace//With_selenium2//shared_UI_map//SharedUImap.properties"));

				driver.findElement(By.id(prop.getProperty("edit_box_login_page_Username"))).sendKeys(Uname);
				driver.findElement(By.id(prop.getProperty("edit_box_login_page_Password"))).sendKeys(Passwd);
				driver.findElement(By.id((prop.getProperty("Button_Login_page_Login")))).click();
				
				
				//verfiy welcome message
				try{
					
					
					WebElement wT= driver.findElement(By.id("label_searchHotel_welcomeMessage"));
				
				String text = wT.getAttribute("value");
				
					
				
				if(text.contains("Hello "+Uname)){
					System.out.println("login passed");
					return;
				}
				else{
					System.out.println("login faied");
				}
				}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("login failed for the invalid username");

	}
	}
	}


